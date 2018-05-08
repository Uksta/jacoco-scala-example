import com.github.sbt.jacoco.report.JacocoReportSettings

name := "JacocoScalaExample"

version := "1.0"

scalaVersion := "2.12.1"

lazy val excludes = jacocoExcludes in Test := Seq(
  "example.jacoco.main.Main*"
)

lazy val jacoco = jacocoReportSettings in Test := JacocoReportSettings(
  "Jacoco Scala Example Coverage Report",
  None,
  JacocoThresholds(branch = 100),
  Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.CSV),
  "utf-8")

val jacocoSettings = Seq(jacoco, excludes)
lazy val jse = (project in file(".")).settings(jacocoSettings: _*)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"