package m2

import org.scalatest.FunSuite
import org.scalatest.Matchers.convertToAnyShouldWrapper

class TestSpec extends FunSuite {

  test("x"){
    List(1) should ===(List(1))
  }

}
