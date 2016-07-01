package loottables

/**
  * Created by awaln on 7/1/16.
  */
class Dice {
  def roll(size: Int): Int = scala.util.Random.nextInt(size -1) + 1
}