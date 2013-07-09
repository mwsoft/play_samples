import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "filters-scala"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm,
    filters
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
