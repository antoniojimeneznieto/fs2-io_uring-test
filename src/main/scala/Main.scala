//> using repository https://s01.oss.sonatype.org/content/repositories/snapshots/
//> using dep com.armanbilge::fs2-io_uring::0.2-e98acdd-SNAPSHOT
//> using dep org.http4s::http4s-ember-server::0.23.23

import cats.effect.*
import org.http4s.ember.server.EmberServerBuilder
import fs2.io.uring.net.UringSocketGroup
import fs2.io.uring.unsafe.UringSystem

object App extends IOApp.Simple:
  override protected def pollingSystem = UringSystem
  def run = EmberServerBuilder.default[IO].withSocketGroup(UringSocketGroup[IO]).build.useForever