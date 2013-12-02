
abstract class Application(var root: Node) {



  protected def heartbeat() = {
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
}
