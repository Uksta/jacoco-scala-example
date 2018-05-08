package example.jacoco.main

import example.jacoco.beer.BeerSeller

object Main {

  def main(args: Array[String]): Unit = {
    println(BeerSeller.getBeer(20))
  }

}
