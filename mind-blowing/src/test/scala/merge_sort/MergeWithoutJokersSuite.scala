package merge_sort

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import merge_sort.MergeWithoutJokers._

@RunWith(classOf[JUnitRunner])
class MergeWithoutJokersSuite extends FunSuite {
  test("List(5,10,11,1,2,3)") {
    assert(merge(List(5,10,11,1,2,3), 0, 2, 5) === List(1,2,3,5,10,11))
  }
  
  test("List(1,2,3,5,10,11)") {
    assert(merge(List(1,2,3,5,10,11), 0, 2, 5) === List(1,2,3,5,10,11))
  }
  
  test("List(5,10,11,1,2)") {
    assert(merge(List(5,10,11,1,2), 0, 2, 4) === List(1,2,5,10,11))
  }
}