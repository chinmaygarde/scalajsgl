
package jsgl.core
import jsgl.gl.{WebGLShader, WebGLRenderingContext}

abstract class Program(gl: WebGLRenderingContext, vertexShaderSource: String, fragmentShaderSource: String) {

  val program = gl.createProgram()

  val vertexShader = compileShader(vertexShaderSource, WebGLRenderingContext.VERTEX_SHADER)
  val fragmentShader = compileShader(fragmentShaderSource, WebGLRenderingContext.FRAGMENT_SHADER)

  gl.attachShader(program, vertexShader)
  gl.attachShader(program, fragmentShader)

  var attributes = new Array[String]()

  protected def compileShader(source: String, ofType: Number): WebGLShader = {
    val shader = gl.createShader(ofType)

    gl.shaderSource(shader, source)
    gl.compileShader(shader)

    assert(gl.getShaderParameter(shader, WebGLRenderingContext.COMPILE_STATUS))

    return shader
  }

  def addAttribute(name: String) : Unit = {
    if(attributes contains name)
      return

    attributes += name

    gl.bindAttribLocation(program, attributes.indexOf(name), name)
  }

  def attributeIndex(name: String) : Integer = attributes.indexOf(name)

  def uniformIndex(name: String) : Integer = gl.getUniformLocation(program, name)

  def link() : Unit = {
    gl.linkProgram(program)
    gl.validateProgram(program)

    assert(gl.getProgramParameter(program, WebGLRenderingContext.LINK_STATUS) != 0)

    gl.detachShader(program, vertexShader)
    gl.detachShader(program, fragmentShader)

    gl.deleteShader(vertexShader)
    gl.deleteShader(fragmentShader)

    onLinkSuccess()
  }

  protected def onLinkSuccess() : Unit = ???

  // FIXME: glDeleteProgram

}