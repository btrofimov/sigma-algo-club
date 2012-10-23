package merge_sort

object MergeWithoutJokers {
  def merge(A: List[Int], p: Int, q: Int, r: Int): List[Int] = {
    def iter(li: Int, ri: Int, result: List[Int]): List[Int] = {
      if (li > q && ri > r)
        result
      else if (ri > r || li <= q && A(li) <= A(ri))
        iter(li + 1, ri, result :+ A(li))
      else
        iter(li, ri + 1, result :+ A(ri))
    }

    iter(p, q + 1, List())
  }
}