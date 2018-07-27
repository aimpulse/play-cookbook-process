import play.sbt.PlayRunHook
import sbt._
import scala.sys.process.Process

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