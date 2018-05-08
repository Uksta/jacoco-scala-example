import example.jacoco.beer.BeerSeller
import org.scalatest.{FlatSpec, Matchers}

class BeerSellerSpec extends FlatSpec with Matchers {

  "BeerSeller" should "sell beer for an adult" in {
    BeerSeller.getBeer(20) shouldBe "Beer for you"
  }

  it  should "not sell beer for a kid" in {
    BeerSeller.getBeer(4) shouldBe "No beer"
  }

}
