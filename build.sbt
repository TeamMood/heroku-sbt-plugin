lazy val `sbt-heroku` = project in file(".")

name := "sbt-heroku"

organization := "com.heroku"

sbtPlugin := true

crossSbtVersions := Vector("1.9.7")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalacOptions += "-deprecation"

resolvers += Resolver.bintrayRepo("heroku", "maven")

libraryDependencies ++= Seq(
  "com.heroku.sdk" % "heroku-deploy" % "2.0.16"
)

publishMavenStyle := true

publishTo := Some("GitHub Package Registry" at "https://maven.pkg.github.com/TeamMood/heroku-sbt-plugin")

ThisBuild / versionScheme := Some("early-semver")
