/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Problem_001 {
  def main(args: Array[String]) {
    var sum = 0;
    for (n <- 1 until 1000; if n % 3 == 0 || n % 5 == 0; m <- 0 to n; if m % 111 == 0) {
      println(m)
      sum += n
    }

    println(sum)
  }
}