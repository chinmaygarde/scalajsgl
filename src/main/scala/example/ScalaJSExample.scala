package example

import scala.scalajs.js
import jsgl.gl.{WebGLRenderingContext, HTMLCanvasElement}
import jsgl.core.{DisplayLink, NodeProgram, Program}

object ScalaJSExample {
  def main(): Unit = {
    val application = new MyApplication
    application.launch()
  }
}


