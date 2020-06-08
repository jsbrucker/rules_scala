import scalapb.TypeMapper

// Type for testing `(scalapb.field).type` option
case class SomeInt(value: Int) extends AnyVal
object SomeInt {
  implicit val intTypeMapper: TypeMapper[Int, SomeInt] = TypeMapper[Int, SomeInt](SomeInt(_))(_.value)
}

// `trait` for testing `(scalapb.message).extends` option
trait SomeTrait