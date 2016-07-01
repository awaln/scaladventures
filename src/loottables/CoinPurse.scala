package loottables

/**
  * Created by awaln on 7/1/16.
  */
class CoinPurse {
  private var coins = 0

  def empty(): Unit = {
    this.coins = 0
  }

  def add(pp: Int, gp: Int, sp: Int, cp: Int): Unit = {
    this.coins += cp + 10*sp + 100*gp + 1000*pp
  }

  def sub(pp: Int, gp: Int, sp: Int, cp: Int): Unit = {
    if (this.coins >= (cp + 10*sp + 100*gp + 1000*pp)) {
      this.coins += cp + 10*sp + 100*gp + 1000*pp
    } else {
      print ("You don't have enough money.")
    }
  }

  def show(): Unit = {
    val pp = this.coins / 1000
    val gp = (this.coins - 1000*pp) / 100
    val sp = (this.coins - 1000*pp - 100*gp) / 10
    val cp = (this.coins - 1000*pp - 100*gp - 10*sp)
    print (s"pp: $pp, gp: $gp, sp: $sp, cp: $cp")
  }
}
