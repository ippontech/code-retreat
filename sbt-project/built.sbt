organization := "fr.ippon"
name := "sbt-project"
version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= List(
    "org.scalaz" %% "scalaz-core" % "7.1.3",
    "com.chuusai" %% "shapeless" % "2.2.5",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "org.scalacheck" %% "scalacheck" % "1.12.5" % "test"
)

