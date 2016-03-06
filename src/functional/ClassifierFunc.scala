package functional

class ClassifierFunc {
  def isFactor(number: Int, potentialFactor: Int): Boolean = {
    number % potentialFactor == 0
  }

  def factors(number: Int): List[Int] = {
    Range(1, number+1).filter(isFactor(number, _)).toList
  }

  def sum(factors: List[Int]): Int = {
    factors.sum
  }

  def isPerfect(number: Int): Boolean = {
    sum(factors(number)) - number == number
  }

  def isAbundant(number: Int): Boolean = {
    sum(factors(number)) - number > number
  }

  def isDeficient(number: Int): Boolean = {
    sum(factors(number)) - number < number
  }
}
