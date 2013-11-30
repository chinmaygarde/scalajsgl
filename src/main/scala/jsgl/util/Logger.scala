package jsgl.util

import scala.scalajs.js

object Logger {
  def log(message: String) : Unit = js.Dynamic.global.console.log(message)
}
