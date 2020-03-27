lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "ch.epfl.scala",
      scalaVersion := "2.13.1"
    )),
    name := "hello-world"
  )


lazy val module1 = (project in file("module1")).
  settings(
    name := "hello-world-module1",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
  )

lazy val module2 = (project in file("module2")).
  settings(
    name := "hello-world-module2"
  ).dependsOn(module1)
