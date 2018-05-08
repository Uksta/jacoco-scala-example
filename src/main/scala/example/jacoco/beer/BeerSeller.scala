package example.jacoco.beer

object BeerSeller {

  def getBeer(age: Int): String = {
    if (age < 18) "No beer" else "Beer for you"
  }

}
