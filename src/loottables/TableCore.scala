package loottables

/**
  * Created by awaln on 7/1/16.
  */
class TableCore(level: Int){
  var coinPurse = new CoinPurse
  var goods, items : List[Int] = List()
  def generate() = {
    val die = new Dice
    die.roll(100) match{
      case a if 1 to 14 contains a => {
        this.coinPurse.empty()
      }
      case a if 15 to 29 contains a => {
        this.coinPurse.empty()
        this.coinPurse.add(0, 0, 0, 1000*die.roll(6))
      }
      case a if 30 to 52 contains a => {
        this.coinPurse.empty()
        this.coinPurse.add(0, 0, 100*die.roll(8), 0)
      }
      case a if 30 to 52 contains a => {
        this.coinPurse.empty()
        this.coinPurse.add(0, 0, 100*die.roll(8), 0)
      }
    }
  }
}

object TableMaker{
  def apply(level: Int) = new TableCore(level: Int)
}