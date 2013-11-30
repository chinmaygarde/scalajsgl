package example

import scala.scalajs.js
import jsgl.gl.{WebGLRenderingContext, HTMLCanvasElement}

object ScalaJSExample {
  def main(): Unit = {

    val document = js.Dynamic.global.document
    val canvas = document.getElementById("surface")
    val context : WebGLRenderingContext = canvas.getContext("webgl").asInstanceOf[WebGLRenderingContext]

    context.clearColor(0.0, 1.0, 0.0, 1.0)
    context.clear(WebGLRenderingContext.COLOR_BUFFER_BIT)

  }
}
