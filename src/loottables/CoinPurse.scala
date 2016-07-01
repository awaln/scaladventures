package loottables

/**
  * Created by awaln on 7/1/16.
  */
class CoinPurse {
  private var copper, silver, gold, platinum = 0

  def empty(): Unit = {
    this.copper = 0
    this.silver = 0
    this.gold = 0
    this.platinum = 0
  }

  def add(cp: Int, sp: Int, gp: Int, pp: Int): Unit = {
    this.copper += cp
    this.silver += cp
  }

  def sub(cp: Int, sp: Int, gp: Int, pp: Int): Unit = {

  }

  private def consolidate(): Unit = {
    if (this.copper >= 10) {
      this.silver += this.copper / 10
      this.copper = this.copper % 10
    }
    if (this.silver >= 10) {
      this.gold += this.silver / 10
      this.silver = this.silver % 10
    }
    if (this.gold >= 10) {
      this.platinum += this.gold / 10
      this.gold = this.gold % 10
    }
  }

  def show(): List[Int] = List(this.copper, this.silver, this.gold, this.platinum)
}
