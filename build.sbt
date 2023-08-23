val scala3Version = "3.3.0"
val ceVersion = "3.6-0142603"
val fs2Version = "3.7.0"
lazy val http4sVersion = "0.23.15"
lazy val slf4jVersion = "2.0.0"
lazy val log4catsVersion = "2.4.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "fs2-io_uring-test",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    resolvers += "Sonatype OSS Snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots/",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.typelevel" %% "cats-effect" % ceVersion,
      "co.fs2" %% "fs2-io" % fs2Version,
      "org.http4s" %% "http4s-dsl" % http4sVersion,
      "org.http4s" %% "http4s-ember-server" % http4sVersion,
      "org.http4s" %% "http4s-circe" % http4sVersion,
      "org.slf4j" % "slf4j-simple" % slf4jVersion,
      "org.typelevel" %% "log4cats-slf4j" % log4catsVersion,
      "com.armanbilge" % "fs2-io_uring_3" % "0.2-e98acdd-SNAPSHOT"
    )
  )
