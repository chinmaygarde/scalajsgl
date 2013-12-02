
package jsgl.core

import jsgl.gl.{WebGLUniformLocation, WebGLRenderingContext}

object NodeProgram {
  val VertexShaderSource =
    """
      |    attribute vec3 position;
      |    attribute vec2 textureCoordinateInput;
      |
      |    uniform mat4 modelViewProjectionMatrix;
      |
      |    varying vec2 textureCoordinateOutput;
      |
      |    void main() {
      |       gl_Position = modelViewProjectionMatrix * vec4(position.xy, 0.0, 1.0);
      |
      |       textureCoordinateOutput = textureCoordinateInput;
      |    }
    """.stripMargin
  val FragmentShaderSource =
    """
      |    precision mediump float;
      |
      |    varying vec2 textureCoordinateOutput;
      |
      |    uniform sampler2D texture;
      |    uniform vec4 backgroundColor;
      |    uniform float textureBoundFlag;
      |
      |    void main() {
      |        gl_FragColor = mix(backgroundColor, texture2D(texture, textureCoordinateOutput), textureBoundFlag);
      |    }
      |
    """.stripMargin
}

class NodeProgram(gl: WebGLRenderingContext) extends Program(gl, NodeProgram.VertexShaderSource, NodeProgram.FragmentShaderSource) {

  // FIXME: This does not seem particularly idiomatic

  private var _modelViewProjectionMatrixIndex   : WebGLUniformLocation = _
  private var _textureSamplerIndex              : WebGLUniformLocation = _
  private var _textureBoundFlagIndex            : WebGLUniformLocation = _
  private var _backgroundColorIndex             : WebGLUniformLocation = _

  private var _positionIndex                    : Integer = _
  private var _textureCoordinateInputIndex      : Integer = _

  def modelViewProjectionMatrixIndex = _modelViewProjectionMatrixIndex
  def textureSamplerIndex            = _textureSamplerIndex
  def textureBoundFlagIndex          = _textureBoundFlagIndex
  def backgroundColorIndex           = _backgroundColorIndex
  def positionIndex                  = _positionIndex
  def textureCoordinateInputIndex    = _textureCoordinateInputIndex

  override def onLinkSuccess() = {
    _modelViewProjectionMatrixIndex  = uniformIndex("modelViewProjectionMatrix")
    _textureSamplerIndex             = uniformIndex("texture")
    _backgroundColorIndex            = uniformIndex("backgroundColor")
    _textureBoundFlagIndex           = uniformIndex("textureBoundFlag")

    _positionIndex                   = attributeIndex("position")
    _textureCoordinateInputIndex     = attributeIndex("textureCoordinateInput")

    System.out.println("Node Program Linking Successful")
  }
}
