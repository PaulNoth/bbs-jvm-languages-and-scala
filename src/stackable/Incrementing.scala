package stackable

trait Incrementing extends IntQueue {
  // for classes calling super from abstract class is illegal, except traits
  // abstract override is important here, makes super keyword dynamically bound,
  abstract override def put(x: Int) {
    super.put(x + 1)
  }
}
