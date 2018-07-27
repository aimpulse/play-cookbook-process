import play.sbt.PlayRunHook
import sbt._

object Grunt {
  def apply(base: File): PlayRunHook = {

    object GruntProcess extends PlayRunHook {

      override def beforeStarted(): Unit = {
        Process("grunt dist", base).run
      }
    }

    GruntProcess
  }
}