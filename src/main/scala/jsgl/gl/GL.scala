package jsgl.gl

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

// FIXME: These dont belong here. Move them ASAP

trait Float32Array extends js.Object {
    
}

trait Int32Array extends js.Object {

}

trait HTMLElement extends js.Object {

}

trait HTMLVideoElement extends HTMLElement {

}

trait HTMLCanvasElement extends HTMLElement {

}

trait HTMLImageElement extends HTMLElement {

}

trait ArrayBufferView extends js.Object {

}

trait ArrayBuffer extends js.Object {

}

trait ImageData extends js.Object {

}

// END FIXME

trait WebGLObject extends js.Object {
        
}

trait WebGLBuffer extends WebGLObject {

}

trait WebGLFramebuffer extends WebGLObject {

}

trait WebGLProgram extends WebGLObject {

}

trait WebGLRenderbuffer extends WebGLObject {

}

trait WebGLShader extends WebGLObject {

}

trait WebGLTexture extends WebGLObject {

}

trait WebGLUniformLocation extends js.Object {

}

trait WebGLActiveInfo extends js.Object {
    val size: js.Number = ???
    @JSName("type")
    val infoType: js.Number = ???
    val name: js.String = ???
}

trait WebGLShaderPrecisionFormat extends js.Object {
    val rangeMin: js.Number = ???
    val rangeMax: js.Number = ???
    val precision: js.Number = ???
}


trait WebGLContextAttributes extends js.Object {
    val alpha: js.Boolean = ???
    val depth: js.Boolean = ???
    val stencil: js.Boolean = ???
    val antialias: js.Boolean = ???
    val premultipliedAlpha: js.Boolean = ???
    val preserveDrawingBuffer: js.Boolean = ???
}

object WebGLRenderingContext extends js.Object {
/* ClearBufferMask */
    val DEPTH_BUFFER_BIT: js.Number = ???
    val STENCIL_BUFFER_BIT: js.Number = ???
    val COLOR_BUFFER_BIT: js.Number = ???

    /* BeginMode */
    val POINTS: js.Number = ???
    val LINES: js.Number = ???
    val LINE_LOOP: js.Number = ???
    val LINE_STRIP: js.Number = ???
    val TRIANGLES: js.Number = ???
    val TRIANGLE_STRIP: js.Number = ???
    val TRIANGLE_FAN: js.Number = ???

    /* AlphaFunction (not supported in ES20) */
    /*      NEVER */
    /*      LESS */
    /*      EQUAL */
    /*      LEQUAL */
    /*      GREATER */
    /*      NOTEQUAL */
    /*      GEQUAL */
    /*      ALWAYS */

    /* BlendingFactorDest */
    val ZERO: js.Number = ???
    val ONE: js.Number = ???
    val SRC_COLOR: js.Number = ???
    val ONE_MINUS_SRC_COLOR: js.Number = ???
    val SRC_ALPHA: js.Number = ???
    val ONE_MINUS_SRC_ALPHA: js.Number = ???
    val DST_ALPHA: js.Number = ???
    val ONE_MINUS_DST_ALPHA: js.Number = ???

    /* BlendingFactorSrc */
    /*      ZERO */
    /*      ONE */
    val DST_COLOR: js.Number = ???
    val ONE_MINUS_DST_COLOR: js.Number = ???
    val SRC_ALPHA_SATURATE: js.Number = ???
    /*      SRC_ALPHA */
    /*      ONE_MINUS_SRC_ALPHA */
    /*      DST_ALPHA */
    /*      ONE_MINUS_DST_ALPHA */

    /* BlendEquationSeparate */
    val FUNC_ADD: js.Number = ???
    val BLEND_EQUATION: js.Number = ???
    val BLEND_EQUATION_RGB: js.Number = ???
    val BLEND_EQUATION_ALPHA: js.Number = ???

    /* BlendSubtract */
    val FUNC_SUBTRACT: js.Number = ???
    val FUNC_REVERSE_SUBTRACT: js.Number = ???

    /* Separate Blend Functions */
    val BLEND_DST_RGB: js.Number = ???
    val BLEND_SRC_RGB: js.Number = ???
    val BLEND_DST_ALPHA: js.Number = ???
    val BLEND_SRC_ALPHA: js.Number = ???
    val CONSTANT_COLOR: js.Number = ???
    val ONE_MINUS_CONSTANT_COLOR: js.Number = ???
    val CONSTANT_ALPHA: js.Number = ???
    val ONE_MINUS_CONSTANT_ALPHA: js.Number = ???
    val BLEND_COLOR: js.Number = ???

    /* Buffer Objects */
    val ARRAY_BUFFER: js.Number = ???
    val ELEMENT_ARRAY_BUFFER: js.Number = ???
    val ARRAY_BUFFER_BINDING: js.Number = ???
    val ELEMENT_ARRAY_BUFFER_BINDING: js.Number = ???

    val STREAM_DRAW: js.Number = ???
    val STATIC_DRAW: js.Number = ???
    val DYNAMIC_DRAW: js.Number = ???

    val BUFFER_SIZE: js.Number = ???
    val BUFFER_USAGE: js.Number = ???

    val CURRENT_VERTEX_ATTRIB: js.Number = ???

    /* CullFaceMode */
    val FRONT: js.Number = ???
    val BACK: js.Number = ???
    val FRONT_AND_BACK: js.Number = ???

    /* DepthFunction */
    /*      NEVER */
    /*      LESS */
    /*      EQUAL */
    /*      LEQUAL */
    /*      GREATER */
    /*      NOTEQUAL */
    /*      GEQUAL */
    /*      ALWAYS */

    /* EnableCap */
    /* TEXTURE_2D */
    val CULL_FACE: js.Number = ???
    val BLEND: js.Number = ???
    val DITHER: js.Number = ???
    val STENCIL_TEST: js.Number = ???
    val DEPTH_TEST: js.Number = ???
    val SCISSOR_TEST: js.Number = ???
    val POLYGON_OFFSET_FILL: js.Number = ???
    val SAMPLE_ALPHA_TO_COVERAGE: js.Number = ???
    val SAMPLE_COVERAGE: js.Number = ???

    /* ErrorCode */
    val NO_ERROR: js.Number = ???
    val INVALID_ENUM: js.Number = ???
    val INVALID_VALUE: js.Number = ???
    val INVALID_OPERATION: js.Number = ???
    val OUT_OF_MEMORY: js.Number = ???

    /* FrontFaceDirection */
    val CW: js.Number = ???
    val CCW: js.Number = ???

    /* GetPName */
    val LINE_WIDTH: js.Number = ???
    val ALIASED_POINT_SIZE_RANGE: js.Number = ???
    val ALIASED_LINE_WIDTH_RANGE: js.Number = ???
    val CULL_FACE_MODE: js.Number = ???
    val FRONT_FACE: js.Number = ???
    val DEPTH_RANGE: js.Number = ???
    val DEPTH_WRITEMASK: js.Number = ???
    val DEPTH_CLEAR_VALUE: js.Number = ???
    val DEPTH_FUNC: js.Number = ???
    val STENCIL_CLEAR_VALUE: js.Number = ???
    val STENCIL_FUNC: js.Number = ???
    val STENCIL_FAIL: js.Number = ???
    val STENCIL_PASS_DEPTH_FAIL: js.Number = ???
    val STENCIL_PASS_DEPTH_PASS: js.Number = ???
    val STENCIL_REF: js.Number = ???
    val STENCIL_VALUE_MASK: js.Number = ???
    val STENCIL_WRITEMASK: js.Number = ???
    val STENCIL_BACK_FUNC: js.Number = ???
    val STENCIL_BACK_FAIL: js.Number = ???
    val STENCIL_BACK_PASS_DEPTH_FAIL: js.Number = ???
    val STENCIL_BACK_PASS_DEPTH_PASS: js.Number = ???
    val STENCIL_BACK_REF: js.Number = ???
    val STENCIL_BACK_VALUE_MASK: js.Number = ???
    val STENCIL_BACK_WRITEMASK: js.Number = ???
    val VIEWPORT: js.Number = ???
    val SCISSOR_BOX: js.Number = ???
    
    /*      SCISSOR_TEST */
    val COLOR_CLEAR_VALUE: js.Number = ???
    val COLOR_WRITEMASK: js.Number = ???
    val UNPACK_ALIGNMENT: js.Number = ???
    val PACK_ALIGNMENT: js.Number = ???
    val MAX_TEXTURE_SIZE: js.Number = ???
    val MAX_VIEWPORT_DIMS: js.Number = ???
    val SUBPIXEL_BITS: js.Number = ???
    val RED_BITS: js.Number = ???
    val GREEN_BITS: js.Number = ???
    val BLUE_BITS: js.Number = ???
    val ALPHA_BITS: js.Number = ???
    val DEPTH_BITS: js.Number = ???
    val STENCIL_BITS: js.Number = ???
    val POLYGON_OFFSET_UNITS: js.Number = ???
    
    /*      POLYGON_OFFSET_FILL */
    val POLYGON_OFFSET_FACTOR: js.Number = ???
    val TEXTURE_BINDING_2D: js.Number = ???
    val SAMPLE_BUFFERS: js.Number = ???
    val SAMPLES: js.Number = ???
    val SAMPLE_COVERAGE_VALUE: js.Number = ???
    val SAMPLE_COVERAGE_INVERT: js.Number = ???

    /* GetTextureParameter */
    /*      TEXTURE_MAG_FILTER */
    /*      TEXTURE_MIN_FILTER */
    /*      TEXTURE_WRAP_S */
    /*      TEXTURE_WRAP_T */

    val COMPRESSED_TEXTURE_FORMATS: js.Number = ???

    /* HintMode */
    val DONT_CARE: js.Number = ???
    val FASTEST: js.Number = ???
    val NICEST: js.Number = ???

    /* HintTarget */
    val GENERATE_MIPMAP_HINT: js.Number = ???

    /* DataType */
    val BYTE: js.Number = ???
    val UNSIGNED_BYTE: js.Number = ???
    val SHORT: js.Number = ???
    val UNSIGNED_SHORT: js.Number = ???
    val INT: js.Number = ???
    val UNSIGNED_INT: js.Number = ???
    val FLOAT: js.Number = ???

    /* PixelFormat */
    val DEPTH_COMPONENT: js.Number = ???
    val ALPHA: js.Number = ???
    val RGB: js.Number = ???
    val RGBA: js.Number = ???
    val LUMINANCE: js.Number = ???
    val LUMINANCE_ALPHA: js.Number = ???

    /* PixelType */
    /*      UNSIGNED_BYTE */
    val UNSIGNED_SHORT_4_4_4_4: js.Number = ???
    val UNSIGNED_SHORT_5_5_5_1: js.Number = ???
    val UNSIGNED_SHORT_5_6_5: js.Number = ???

    /* Shaders */
    val FRAGMENT_SHADER: js.Number = ???
    val VERTEX_SHADER: js.Number = ???
    val MAX_VERTEX_ATTRIBS: js.Number = ???
    val MAX_VERTEX_UNIFORM_VECTORS: js.Number = ???
    val MAX_VARYING_VECTORS: js.Number = ???
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: js.Number = ???
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: js.Number = ???
    val MAX_TEXTURE_IMAGE_UNITS: js.Number = ???
    val MAX_FRAGMENT_UNIFORM_VECTORS: js.Number = ???
    val SHADER_TYPE: js.Number = ???
    val DELETE_STATUS: js.Number = ???
    val LINK_STATUS: js.Number = ???
    val VALIDATE_STATUS: js.Number = ???
    val ATTACHED_SHADERS: js.Number = ???
    val ACTIVE_UNIFORMS: js.Number = ???
    val ACTIVE_ATTRIBUTES: js.Number = ???
    val SHADING_LANGUAGE_VERSION: js.Number = ???
    val CURRENT_PROGRAM: js.Number = ???

    /* StencilFunction */
    val NEVER: js.Number = ???
    val LESS: js.Number = ???
    val EQUAL: js.Number = ???
    val LEQUAL: js.Number = ???
    val GREATER: js.Number = ???
    val NOTEQUAL: js.Number = ???
    val GEQUAL: js.Number = ???
    val ALWAYS: js.Number = ???

    /* StencilOp */
    /*      ZERO */
    val KEEP: js.Number = ???
    val REPLACE: js.Number = ???
    val INCR: js.Number = ???
    val DECR: js.Number = ???
    val INVERT: js.Number = ???
    val INCR_WRAP: js.Number = ???
    val DECR_WRAP: js.Number = ???

    /* StringName */
    val VENDOR: js.Number = ???
    val RENDERER: js.Number = ???
    val VERSION: js.Number = ???

    /* TextureMagFilter */
    val NEAREST: js.Number = ???
    val LINEAR: js.Number = ???

    /* TextureMinFilter */
    /*      NEAREST */
    /*      LINEAR */
    val NEAREST_MIPMAP_NEAREST: js.Number = ???
    val LINEAR_MIPMAP_NEAREST: js.Number = ???
    val NEAREST_MIPMAP_LINEAR: js.Number = ???
    val LINEAR_MIPMAP_LINEAR: js.Number = ???

    /* TextureParameterName */
    val TEXTURE_MAG_FILTER: js.Number = ???
    val TEXTURE_MIN_FILTER: js.Number = ???
    val TEXTURE_WRAP_S: js.Number = ???
    val TEXTURE_WRAP_T: js.Number = ???

    /* TextureTarget */
    val TEXTURE_2D: js.Number = ???
    val TEXTURE: js.Number = ???

    val TEXTURE_CUBE_MAP: js.Number = ???
    val TEXTURE_BINDING_CUBE_MAP: js.Number = ???
    val TEXTURE_CUBE_MAP_POSITIVE_X: js.Number = ???
    val TEXTURE_CUBE_MAP_NEGATIVE_X: js.Number = ???
    val TEXTURE_CUBE_MAP_POSITIVE_Y: js.Number = ???
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: js.Number = ???
    val TEXTURE_CUBE_MAP_POSITIVE_Z: js.Number = ???
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: js.Number = ???
    val MAX_CUBE_MAP_TEXTURE_SIZE: js.Number = ???

    /* TextureUnit */
    val TEXTURE0: js.Number = ???
    val TEXTURE1: js.Number = ???
    val TEXTURE2: js.Number = ???
    val TEXTURE3: js.Number = ???
    val TEXTURE4: js.Number = ???
    val TEXTURE5: js.Number = ???
    val TEXTURE6: js.Number = ???
    val TEXTURE7: js.Number = ???
    val TEXTURE8: js.Number = ???
    val TEXTURE9: js.Number = ???
    val TEXTURE10: js.Number = ???
    val TEXTURE11: js.Number = ???
    val TEXTURE12: js.Number = ???
    val TEXTURE13: js.Number = ???
    val TEXTURE14: js.Number = ???
    val TEXTURE15: js.Number = ???
    val TEXTURE16: js.Number = ???
    val TEXTURE17: js.Number = ???
    val TEXTURE18: js.Number = ???
    val TEXTURE19: js.Number = ???
    val TEXTURE20: js.Number = ???
    val TEXTURE21: js.Number = ???
    val TEXTURE22: js.Number = ???
    val TEXTURE23: js.Number = ???
    val TEXTURE24: js.Number = ???
    val TEXTURE25: js.Number = ???
    val TEXTURE26: js.Number = ???
    val TEXTURE27: js.Number = ???
    val TEXTURE28: js.Number = ???
    val TEXTURE29: js.Number = ???
    val TEXTURE30: js.Number = ???
    val TEXTURE31: js.Number = ???
    val ACTIVE_TEXTURE: js.Number = ???

    /* TextureWrapMode */
    val REPEAT: js.Number = ???
    val CLAMP_TO_EDGE: js.Number = ???
    val MIRRORED_REPEAT: js.Number = ???

    /* Uniform Types */
    val FLOAT_VEC2: js.Number = ???
    val FLOAT_VEC3: js.Number = ???
    val FLOAT_VEC4: js.Number = ???
    val INT_VEC2: js.Number = ???
    val INT_VEC3: js.Number = ???
    val INT_VEC4: js.Number = ???
    val BOOL: js.Number = ???
    val BOOL_VEC2: js.Number = ???
    val BOOL_VEC3: js.Number = ???
    val BOOL_VEC4: js.Number = ???
    val FLOAT_MAT2: js.Number = ???
    val FLOAT_MAT3: js.Number = ???
    val FLOAT_MAT4: js.Number = ???
    val SAMPLER_2D: js.Number = ???
    val SAMPLER_CUBE: js.Number = ???

    /* Vertex Arrays */
    val VERTEX_ATTRIB_ARRAY_ENABLED: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_SIZE: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_STRIDE: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_TYPE: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_POINTER: js.Number = ???
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: js.Number = ???

    /* Shader Source */
    val COMPILE_STATUS: js.Number = ???

    /* Shader Precision-Specified Types */
    val LOW_FLOAT: js.Number = ???
    val MEDIUM_FLOAT: js.Number = ???
    val HIGH_FLOAT: js.Number = ???
    val LOW_INT: js.Number = ???
    val MEDIUM_INT: js.Number = ???
    val HIGH_INT: js.Number = ???

    /* Framebuffer Object. */
    val FRAMEBUFFER: js.Number = ???
    val RENDERBUFFER: js.Number = ???

    val RGBA4: js.Number = ???
    val RGB5_A1: js.Number = ???
    val RGB565: js.Number = ???
    val DEPTH_COMPONENT16: js.Number = ???
    val STENCIL_INDEX: js.Number = ???
    val STENCIL_INDEX8: js.Number = ???
    val DEPTH_STENCIL: js.Number = ???

    val RENDERBUFFER_WIDTH: js.Number = ???
    val RENDERBUFFER_HEIGHT: js.Number = ???
    val RENDERBUFFER_INTERNAL_FORMAT: js.Number = ???
    val RENDERBUFFER_RED_SIZE: js.Number = ???
    val RENDERBUFFER_GREEN_SIZE: js.Number = ???
    val RENDERBUFFER_BLUE_SIZE: js.Number = ???
    val RENDERBUFFER_ALPHA_SIZE: js.Number = ???
    val RENDERBUFFER_DEPTH_SIZE: js.Number = ???
    val RENDERBUFFER_STENCIL_SIZE: js.Number = ???

    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: js.Number = ???
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: js.Number = ???
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: js.Number = ???
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: js.Number = ???

    val COLOR_ATTACHMENT0: js.Number = ???
    val DEPTH_ATTACHMENT: js.Number = ???
    val STENCIL_ATTACHMENT: js.Number = ???
    val DEPTH_STENCIL_ATTACHMENT: js.Number = ???

    val NONE: js.Number = ???

    val FRAMEBUFFER_COMPLETE: js.Number = ???
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: js.Number = ???
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: js.Number = ???
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: js.Number = ???
    val FRAMEBUFFER_UNSUPPORTED: js.Number = ???

    val FRAMEBUFFER_BINDING: js.Number = ???
    val RENDERBUFFER_BINDING: js.Number = ???
    val MAX_RENDERBUFFER_SIZE: js.Number = ???

    val INVALID_FRAMEBUFFER_OPERATION: js.Number = ???

    /* WebGL-specific enums */
    val UNPACK_FLIP_Y_WEBGL: js.Number = ???
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: js.Number = ???
    val CONTEXT_LOST_WEBGL: js.Number = ???
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: js.Number = ???
    val BROWSER_DEFAULT_WEBGL: js.Number = ???
}

trait WebGLRenderingContext extends js.Object {
    val canvas: HTMLCanvasElement = ???

    val drawingBufferWidth: js.Number = ???
    val drawingBufferHeight: js.Number = ???

    def getContextAttributes(): WebGLContextAttributes = ???
    def isContextLost(): js.Boolean = ???

    def getSupportedExtensions(): js.Array[js.String] = ???
    def getExtension(name: js.String): js.Any = ???

    def activeTexture(texture: js.Number) : Unit = ???
    def attachShader(program: WebGLProgram, shader: WebGLShader) : Unit = ???
    def bindAttribLocation(program: WebGLProgram, index: js.Number, name: js.String) : Unit = ???
    def bindBuffer(target: js.Number, buffer: WebGLBuffer) : Unit = ???
    def bindFramebuffer(target: js.Number, framebuffer: WebGLFramebuffer) : Unit = ???
    def bindRenderbuffer(target: js.Number, renderbuffer: WebGLRenderbuffer) : Unit = ???
    def bindTexture(target: js.Number, texture: WebGLTexture) : Unit = ???
    def blendColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number) : Unit = ???
    def blendEquation(mode: js.Number) : Unit = ???
    def blendEquationSeparate(modeRGB: js.Number, modeAlpha: js.Number) : Unit = ???
    def blendFunc(sfactor: js.Number, dfactor: js.Number) : Unit = ???
    def blendFuncSeparate(srcRGB: js.Number, dstRGB: js.Number, srcAlpha: js.Number, dstAlpha: js.Number) : Unit = ???

    def bufferData(target: js.Number, size: js.Number, usage: js.Number) : Unit = ???
    def bufferData(target: js.Number, data: ArrayBufferView, usage: js.Number) : Unit = ???
    def bufferData(target: js.Number, data: ArrayBuffer, usage: js.Number) : Unit = ???
    def bufferSubData(target: js.Number, offset: js.Number, data: ArrayBufferView) : Unit = ???
    def bufferSubData(target: js.Number, offset: js.Number, data: ArrayBuffer) : Unit = ???

    def checkFramebufferStatus(target: js.Number): js.Number = ???
    def clear(mask: js.Number) : Unit = ???
    def clearColor(red: js.Number, green: js.Number, blue: js.Number, alpha: js.Number) : Unit = ???
    def clearDepth(depth: js.Number) : Unit = ???
    def clearStencil(s: js.Number) : Unit = ???
    def colorMask(red: js.Boolean, green: js.Boolean, blue: js.Boolean, alpha: js.Boolean) : Unit = ???
    def compileShader(shader: WebGLShader) : Unit = ???

    def compressedTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, data: ArrayBufferView) : Unit = ???
    def compressedTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, data: ArrayBufferView) : Unit = ???

    def copyTexImage2D(target: js.Number, level: js.Number, internalformat: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number, border: js.Number) : Unit = ???
    def copyTexSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, x: js.Number, y: js.Number, width: js.Number, height: js.Number) : Unit = ???

    def createBuffer(): WebGLBuffer = ???
    def createFramebuffer(): WebGLFramebuffer = ???
    def createProgram(): WebGLProgram = ???
    def createRenderbuffer(): WebGLRenderbuffer = ???
    def createShader(shadeType: js.Number): WebGLShader = ???
    def createTexture(): WebGLTexture = ???

    def cullFace(mode: js.Number) : Unit = ???

    def deleteBuffer(buffer: WebGLBuffer) : Unit = ???
    def deleteFramebuffer(framebuffer: WebGLFramebuffer) : Unit = ???
    def deleteProgram(program: WebGLProgram) : Unit = ???
    def deleteRenderbuffer(renderbuffer: WebGLRenderbuffer) : Unit = ???
    def deleteShader(shader: WebGLShader) : Unit = ???
    def deleteTexture(texture: WebGLTexture) : Unit = ???

    def depthFunc(func: js.Number) : Unit = ???
    def depthMask(flag: js.Boolean) : Unit = ???
    def depthRange(zNear: js.Number, zFar: js.Number) : Unit = ???
    def detachShader(program: WebGLProgram, shader: WebGLShader) : Unit = ???
    def disable(cap: js.Number) : Unit = ???
    def disableVertexAttribArray(index: js.Number) : Unit = ???
    def drawArrays(mode: js.Number, first: js.Number, count: js.Number) : Unit = ???
    def drawElements(mode: js.Number, count: js.Number, elementType: js.Number, offset: js.Number) : Unit = ???

    def enable(cap: js.Number) : Unit = ???
    def enableVertexAttribArray(index: js.Number) : Unit = ???
    def finish() : Unit = ???
    def flush() : Unit = ???
    def framebufferRenderbuffer(target: js.Number, attachment: js.Number, renderbuffertarget: js.Number, renderbuffer: WebGLRenderbuffer) : Unit = ???
    def framebufferTexture2D(target: js.Number, attachment: js.Number, textarget: js.Number, texture: WebGLTexture, level: js.Number) : Unit = ???
    def frontFace(mode: js.Number) : Unit = ???

    def generateMipmap(target: js.Number) : Unit = ???

    def getActiveAttrib(program: WebGLProgram, index: js.Number): WebGLActiveInfo = ???
    def getActiveUniform(program: WebGLProgram, index: js.Number): WebGLActiveInfo = ???
    def getAttachedShaders(program: WebGLProgram) : js.Array[WebGLShader] = ???

    def getAttribLocation(program: WebGLProgram, name: js.String): js.Number = ???

    def getBufferParameter(target: js.Number, pname: js.Number): js.Any = ???
    def getParameter(pname: js.Number): js.Any = ???

    def getError(): js.Number = ???

    def getFramebufferAttachmentParameter(target: js.Number, attachment: js.Number, pname: js.Number): js.Any = ???
    def getProgramParameter(program: WebGLProgram, pname: js.Number): js.Any = ???
    def getProgramInfoLog(program: WebGLProgram): js.String = ???
    def getRenderbufferParameter(target: js.Number, pname: js.Number): js.Any = ???
    def getShaderParameter(shader: WebGLShader, pname: js.Number): js.Any = ???
    def getShaderPrecisionFormat(shadertype: js.Number, precisiontype: js.Number): WebGLShaderPrecisionFormat = ???
    def getShaderInfoLog(shader: WebGLShader): js.String = ???

    def getShaderSource(shader: WebGLShader): js.String = ???
    def getTexParameter(target: js.Number, pname: js.Number): js.Any = ???
    def getUniform(program: WebGLProgram, location: WebGLUniformLocation): js.Any = ???
    def getUniformLocation(program: WebGLProgram, name: js.String): WebGLUniformLocation = ???
    def getVertexAttrib(index: js.Number, pname: js.Number): js.Any = ???
    def getVertexAttribOffset(index: js.Number, pname: js.Number): js.Number = ???

    def hint(target: js.Number, mode: js.Number) : Unit = ???
    def isBuffer(buffer: WebGLBuffer): js.Boolean = ???
    def isEnabled(cap: js.Number): js.Boolean = ???
    def isFramebuffer(framebuffer: WebGLFramebuffer): js.Boolean = ???
    def isProgram(program: WebGLProgram): js.Boolean = ???
    def isRenderbuffer(renderbuffer: WebGLRenderbuffer): js.Boolean = ???
    def isShader(shader: WebGLShader): js.Boolean = ???
    def isTexture(texture: WebGLTexture): js.Boolean = ???
    def lineWidth(width: js.Number) : Unit = ???
    def linkProgram(program: WebGLProgram) : Unit = ???
    def pixelStorei(pname: js.Number, param: js.Number) : Unit = ???
    def polygonOffset(factor: js.Number, units: js.Number) : Unit = ???

    def readPixels(x: js.Number, y: js.Number, width: js.Number, height: js.Number, format: js.Number, pixelDataType: js.Number, pixels: ArrayBufferView) : Unit = ???

    def renderbufferStorage(target: js.Number, internalformat: js.Number, width: js.Number, height: js.Number) : Unit = ???
    def sampleCoverage(value: js.Number, invert: js.Boolean) : Unit = ???
    def scissor(x: js.Number, y: js.Number, width: js.Number, height: js.Number) : Unit = ???

    def shaderSource(shader: WebGLShader, source: js.String) : Unit = ???

    def stencilFunc(func: js.Number, ref: js.Number, mask: js.Number) : Unit = ???
    def stencilFuncSeparate(face: js.Number, func: js.Number, ref: js.Number, mask: js.Number) : Unit = ???
    def stencilMask(mask: js.Number) : Unit = ???
    def stencilMaskSeparate(face: js.Number, mask: js.Number) : Unit = ???
    def stencilOp(fail: js.Number, zfail: js.Number, zpass: js.Number) : Unit = ???
    def stencilOpSeparate(face: js.Number, fail: js.Number, zfail: js.Number, zpass: js.Number) : Unit = ???

    def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, width: js.Number, height: js.Number, border: js.Number, format: js.Number, ofType: js.Number, pixels: ArrayBufferView) : Unit = ???
    def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, ofType: js.Number, pixels: ImageData) : Unit = ???
    def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, ofType: js.Number, image: HTMLImageElement) : Unit = ???
    def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, ofType: js.Number, canvas: HTMLCanvasElement) : Unit = ???
    def texImage2D(target: js.Number, level: js.Number, internalformat: js.Number, format: js.Number, ofType: js.Number, video: HTMLVideoElement) : Unit = ???

    def texParameterf(target: js.Number, pname: js.Number, param: js.Number) : Unit = ???
    def texParameteri(target: js.Number, pname: js.Number, param: js.Number) : Unit = ???

    def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, width: js.Number, height: js.Number, format: js.Number, ofType: js.Number, pixels: ArrayBufferView) : Unit = ???
    def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, ofType: js.Number, pixels: ImageData) : Unit = ???
    def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, ofType: js.Number, image: HTMLImageElement) : Unit = ???
    def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, ofType: js.Number, canvas: HTMLCanvasElement) : Unit = ???
    def texSubImage2D(target: js.Number, level: js.Number, xoffset: js.Number, yoffset: js.Number, format: js.Number, ofType: js.Number, video: HTMLVideoElement) : Unit = ???

    def uniform1f(location: WebGLUniformLocation, x: js.Number) : Unit = ???
    def uniform1fv(location: WebGLUniformLocation, v: Float32Array) : Unit = ???
    def uniform1fv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform1i(location: WebGLUniformLocation, x: js.Number) : Unit = ???
    def uniform1iv(location: WebGLUniformLocation, v: Int32Array) : Unit = ???
    def uniform1iv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform2f(location: WebGLUniformLocation, x: js.Number, y: js.Number) : Unit = ???
    def uniform2fv(location: WebGLUniformLocation, v: Float32Array) : Unit = ???
    def uniform2fv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform2i(location: WebGLUniformLocation, x: js.Number, y: js.Number) : Unit = ???
    def uniform2iv(location: WebGLUniformLocation, v: Int32Array) : Unit = ???
    def uniform2iv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform3f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number) : Unit = ???
    def uniform3fv(location: WebGLUniformLocation, v: Float32Array) : Unit = ???
    def uniform3fv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform3i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number) : Unit = ???
    def uniform3iv(location: WebGLUniformLocation, v: Int32Array) : Unit = ???
    def uniform3iv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform4f(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number) : Unit = ???
    def uniform4fv(location: WebGLUniformLocation, v: Float32Array) : Unit = ???
    def uniform4fv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???
    def uniform4i(location: WebGLUniformLocation, x: js.Number, y: js.Number, z: js.Number, w: js.Number) : Unit = ???
    def uniform4iv(location: WebGLUniformLocation, v: Int32Array) : Unit = ???
    def uniform4iv(location: WebGLUniformLocation, v: js.Array[js.Number]) : Unit = ???

    def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array) : Unit = ???
    def uniformMatrix2fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]) : Unit = ???
    def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array) : Unit = ???
    def uniformMatrix3fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]) : Unit = ???
    def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: Float32Array) : Unit = ???
    def uniformMatrix4fv(location: WebGLUniformLocation, transpose: js.Boolean, value: js.Array[js.Number]) : Unit = ???

    def useProgram(program: WebGLProgram) : Unit = ???
    def validateProgram(program: WebGLProgram) : Unit = ???

    def vertexAttrib1f(indx: js.Number, x: js.Number) : Unit = ???
    def vertexAttrib1fv(indx: js.Number, values: Float32Array) : Unit = ???
    def vertexAttrib1fv(indx: js.Number, value: js.Array[js.Number]) : Unit = ???
    def vertexAttrib2f(indx: js.Number, x: js.Number, y: js.Number) : Unit = ???
    def vertexAttrib2fv(indx: js.Number, values: Float32Array) : Unit = ???
    def vertexAttrib2fv(indx: js.Number, value: js.Array[js.Number]) : Unit = ???
    def vertexAttrib3f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number) : Unit = ???
    def vertexAttrib3fv(indx: js.Number, values: Float32Array) : Unit = ???
    def vertexAttrib3fv(indx: js.Number, value: js.Array[js.Number]) : Unit = ???
    def vertexAttrib4f(indx: js.Number, x: js.Number, y: js.Number, z: js.Number, w: js.Number) : Unit = ???
    def vertexAttrib4fv(indx: js.Number, values: Float32Array) : Unit = ???
    def vertexAttrib4fv(indx: js.Number, value: js.Array[js.Number]) : Unit = ???
    def vertexAttribPointer(indx: js.Number, size: js.Number, ofType: js.Number, normalized: js.Boolean, stride: js.Number, offset: js.Number) : Unit = ???

    def viewport(x: js.Number, y: js.Number, width: js.Number, height: js.Number) : Unit = ???
}
