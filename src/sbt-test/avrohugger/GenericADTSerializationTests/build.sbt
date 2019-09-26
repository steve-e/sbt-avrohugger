sourceGenerators in Compile += (avroScalaGenerate in Compile).taskValue

organization := "com.julianpeeters"

name := "datatype-avro-serializaton-tests"

version := "0.4-SNAPSHOT"

crossScalaVersions := Seq("2.11.8", "2.12.4")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ywarn-value-discard")

avroScalaCustomTypes in Compile := {
  avrohugger.format.Standard.defaultTypes.copy(
    protocol = avrohugger.types.ScalaADT)
}

libraryDependencies += "com.sksamuel.avro4s" %% "avro4s-core" % "3.0.0-RC3"

libraryDependencies += "org.apache.avro" % "avro" % "1.9.0"

libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.6"