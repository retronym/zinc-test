package a

object Z {
  implicit class RichY(Y: Y) {
    def foo = ""
  }
  def bar(y: Y) = {
    y.foo
  }
}
