
package jsgl.core

import scala.scalajs.js

class DisplayLink {
  val window = js.Dynamic.global.window
  window.requestAnimationFrame(() => {
    System.out.println("Callback")
  })
}
