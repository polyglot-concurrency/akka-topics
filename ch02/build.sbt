val AkkaVersion = "2.8.2"
val LogbackVersion = "1.2.3"
val ScalaVersion = "3.3.0"
val JacksonVersion = "2.11.4" 

lazy val chapter02 = project
  .in(file("."))
  .settings(
    scalaVersion := ScalaVersion,
    // scalafmtOnCompile := true,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      // "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
      "ch.qos.logback" % "logback-classic" % LogbackVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
      )
    )


ThisBuild / watchTriggeredMessage := Watch.clearScreenOnTrigger