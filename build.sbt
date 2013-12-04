name := "play-mail-app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0"
)     

play.Project.playScalaSettings
