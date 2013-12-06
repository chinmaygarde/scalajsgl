
package jsgl.core

import scala.scalajs.js

class DisplayLink(val callbackFunction: (Number) => Unit) {
  private val _window = js.Dynamic.global.window
  private var _paused = true

  def setPaused(shouldPause : Boolean) = {
    _paused = shouldPause
    heartbeat(js.Number.MIN_VALUE)
  }

  def heartbeat(duration: js.Number) : Unit = {
    callbackFunction(duration.toDouble)

    if (!_paused)
      _window.requestAnimationFrame(heartbeat _)
  }
}
