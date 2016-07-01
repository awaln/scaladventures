package loottables

/**
  * Created by awaln on 7/1/16.
  */
class TableCore(level: Int){
  var coinPurse = new CoinPurse
  var goods, items : List = List()
  def generate() = {
    val die = new Dice
    die.roll(100) match{
      case a if 1 to 14 contains a => {
        this.coinPurse.empty()
        this.coinPurse.copper = 1000*die.roll(6)
      }
    }
  }
}

object TableMaker{
  def apply(level: Int) = new TableCore(level: Int)
}