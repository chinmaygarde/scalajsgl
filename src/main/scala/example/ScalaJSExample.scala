package example

import scala.scalajs.js
import jsgl.gl.{WebGLRenderingContext, HTMLCanvasElement}
import jsgl.core.{DisplayLink, NodeProgram, Program}

object ScalaJSExample {
  def main(): Unit = {
    val document = js.Dynamic.global.document
    val canvas = document.getElementById("surface")
    val context = canvas.getContext("webgl").asInstanceOf[WebGLRenderingContext]

    context.clearColor(0.2, 0.2, 0.2, 1.0)
    context.clear(WebGLRenderingContext.COLOR_BUFFER_BIT)

    val program = new NodeProgram(context)
    program.link()

    new DisplayLink()
  }
}
