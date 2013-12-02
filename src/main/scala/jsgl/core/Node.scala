
class Node() {
  private var _bounds : Rect = Rect.zero()
  def bounds() = _bounds
  def setBounds(bounds : Rect) = {
    _bounds = bounds
    _geometryDirty = true
  }

  private var _position : Point = Point.zero()
  def position() = _position
  def setPosition(position : Point) = {
    _position = position
    _geometryDirty = true
  }

  private var _anchor : Point = Point.make(0.5, 0.5)
  def anchor() = _anchor
  def setAnchor(anchor : Point) = {
    _anchor = anchor
    _geometryDirty = true
  }

  private var _backgroundColor : Color4 = new Color4(1.0, 1.0, 1.0, 1.0)
  private var _geometryDirty : Boolean = false

  def frame() : Rect = Rect.make(
    _bounds.origin.x + (_position.x - (_bounds.size.width * _anchor.x)),
    _bounds.origin.y + (_position.y - (_bounds.size.height * _anchor.y)),
    _bounds.size.width,
    _bounds.size.height
  )

  def setFrame(frame: Rect) : Unit = {
    _bounds = Rect.make(0, 0, frame.size.width, frame.size.height);
    _position = Point.make((frame.origin.x + (_anchor.x * frame.size.width)), (frame.origin.y + (_anchor.y * frame.size.height)))
  }
}
