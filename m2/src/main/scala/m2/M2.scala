package m2

object M2 {
  def main(args: Array[String]) {
    println(s"hello, Maven, Scala, Java ${sys.props("java.specification.version")}")
  }
}