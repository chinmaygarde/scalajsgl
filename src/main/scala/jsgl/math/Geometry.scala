
class Matrix4(val elements : Array[Double]) {
  def *(other: Matrix4) = new Matrix4(Array(
    elements(0) * other.elements(0) + elements(4) * other.elements(1) + elements(8) * other.elements(2) + elements(12) * other.elements(3),
    elements(1) * other.elements(0) + elements(5) * other.elements(1) + elements(9) * other.elements(2) + elements(13) * other.elements(3),
    elements(2) * other.elements(0) + elements(6) * other.elements(1) + elements(10) * other.elements(2) + elements(14) * other.elements(3),
    elements(3) * other.elements(0) + elements(7) * other.elements(1) + elements(11) * other.elements(2) + elements(15) * other.elements(3),
    elements(0) * other.elements(4) + elements(4) * other.elements(5) + elements(8) * other.elements(6) + elements(12) * other.elements(7),
    elements(1) * other.elements(4) + elements(5) * other.elements(5) + elements(9) * other.elements(6) + elements(13) * other.elements(7),
    elements(2) * other.elements(4) + elements(6) * other.elements(5) + elements(10) * other.elements(6) + elements(14) * other.elements(7),
    elements(3) * other.elements(4) + elements(7) * other.elements(5) + elements(11) * other.elements(6) + elements(15) * other.elements(7),
    elements(0) * other.elements(8) + elements(4) * other.elements(9) + elements(8) * other.elements(10) + elements(12) * other.elements(11),
    elements(1) * other.elements(8) + elements(5) * other.elements(9) + elements(9) * other.elements(10) + elements(13) * other.elements(11),
    elements(2) * other.elements(8) + elements(6) * other.elements(9) + elements(10) * other.elements(10) + elements(14) * other.elements(11),
    elements(3) * other.elements(8) + elements(7) * other.elements(9) + elements(11) * other.elements(10) + elements(15) * other.elements(11),
    elements(0) * other.elements(12) + elements(4) * other.elements(13) + elements(8) * other.elements(14) + elements(12) * other.elements(15),
    elements(1) * other.elements(12) + elements(5) * other.elements(13) + elements(9) * other.elements(14) + elements(13) * other.elements(15),
    elements(2) * other.elements(12) + elements(6) * other.elements(13) + elements(10) * other.elements(14) + elements(14) * other.elements(15),
    elements(3) * other.elements(12) + elements(7) * other.elements(13) + elements(11) * other.elements(14) + elements(15) * other.elements(15)
  ))

  def translate(tx: Double, ty: Double, tz: Double) = new Matrix4(Array(
    elements(0),
    elements(1),
    elements(2),
    elements(3),
    elements(4),
    elements(5),
    elements(6),
    elements(7),
    elements(8),
    elements(9),
    elements(10),
    elements(11),
    elements(0) * tx + elements(4) * ty + elements(8) * tz + elements(12),
    elements(1) * tx + elements(5) * ty + elements(9) * tz + elements(13),
    elements(2) * tx + elements(6) * ty + elements(10) * tz + elements(14),
    elements(15)
  ))

  def ==(other : Matrix4) = elements.deep == other.elements.deep
}

object Matrix4 {
  def identity() : Matrix4 = new Matrix4(Array (
    1, 0, 0, 0,
    0, 1, 0, 0,
    0, 0, 1, 0,
    0, 0, 0, 1
  ))

  def translation(x: Double, y: Double, z: Double) = new Matrix4(Array (
    1, 0, 0, 0,
    0, 1, 0, 0,
    0, 0, 1, 0,
    x, y, z, 1
  ))

  def scale(x: Double, y: Double, z: Double) = new Matrix4(Array (
    x, 0, 0, 0,
    0, y, 0, 0,
    0, 0, z, 0,
    0, 0, 0, 1
  ))

  def ortho(left: Double, right: Double, bottom: Double, top: Double, nearZ: Double, farZ: Double) : Matrix4 = {

    val ral = right + left
    val rsl = right - left
    val tab = top + bottom
    val tsb = top - bottom
    val fan = farZ + nearZ
    val fsn = farZ - nearZ

    return new Matrix4(Array(
      2.0f / rsl, 0.0f,           0.0f,           0.0f,
      0.0f,       2.0f / tsb,     0.0f,           0.0f,
      0.0f,       0.0f,           -2.0f / fsn,    0.0f,
      -ral / rsl, -tab / tsb,     -fan / fsn,     1.0f
    ))

  }
}

class Point(val x: Double, val y: Double) {
  def ==(other: Point) = ((x == other.x) && (y == other.y))
}

class Size(val width: Double, val height: Double) {
  def ==(other: Size) = ((width == other.width) && (height == other.height))
}

// FIXME: Is this overkill? I just need structs
object Rect {
  def make(x: Double, y: Double, width: Double, height: Double) = new Rect(
    new Point(x, y),
    new Size(width, height)
  )
}

class Rect(val origin: Point, val size: Size) {
  def ==(other: Rect) = ((origin == other.origin) && (size == other.size))
}
