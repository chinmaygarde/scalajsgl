package jsgl.core

import jsgl.core
import scalajs.js
import jsgl.gl.WebGLRenderingContext

abstract class Application(var rootNode: Node) {
  val displayLink = new DisplayLink(heartbeat _)

  protected def heartbeat(duration: Number) = {
    System.out.println("Heartbeat")

    update()

    layout()

    display()

    render()
  }

  protected def layout() = {

  }

  protected  def display() {

  }

  protected def render() {

  }

  protected def update() {

  }

  private def setupOpenGL() {
    val document = js.Dynamic.global.document
    val canvas = document.getElementById("surface")
    val context = canvas.getContext("webgl").asInstanceOf[WebGLRenderingContext]

    context.clearColor(0.2, 0.2, 0.2, 1.0)
    context.clear(WebGLRenderingContext.COLOR_BUFFER_BIT)

    val program = new NodeProgram(context)
    program.link()
  }

  def launch() {

    setupOpenGL()

    displayLink.setPaused(false)
  }

  protected def applicationFinishedLaunching() {

  }
}
