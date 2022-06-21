ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "1.0.0"

lazy val root = (project in file("."))
  .settings(
    name  := "shelter",
    libraryDependencies  ++= Seq(
      compilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full),
      "org.typelevel" %% "cats-core" % "2.7.0",
      "org.typelevel" %% "cats-effect" % "3.3.12",
      "org.typelevel" %% "cats-mtl" % "1.2.1",
      "co.fs2" %% "fs2-core" % "3.2.8",
      "dev.optics" %% "monocle-core" % "3.1.0",
      "dev.optics"  %% "monocle-macro" % "3.1.0",
      "io.estatico" %% "newtype"% "0.4.4",
      "eu.timepit" %% "refined" % "0.9.29",
      "eu.timepit" %% "refined-cats" % "0.9.29",
      "tf.tofu" %% "derevo-cats" % "0.13.0",
      "tf.tofu" %% "derevo-cats-tagless" % "0.13.0",
      "tf.tofu" %% "derevo-circe-magnolia" % "0.13.0",
      "tf.tofu" %% "tofu-core-higher-kind" % "0.10.8",
      "org.typelevel" %% "squants" % "1.8.3"),
    scalacOptions  ++= Seq("-Ymacro-annotations", "-Wconf:cat=unused:info")
  )