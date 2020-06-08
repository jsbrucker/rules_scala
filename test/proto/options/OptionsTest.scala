import org.scalatest.{Matchers, WordSpec}

object OptionsTest extends WordSpec with Matchers {
  "TestMessage.testInt" should {
    "be of type SomeInt" in {
      TestMessage(testInt = SomeInt(1))
    }
  }

  "TestMessage" should {
    "extend SomeTrait" in {
      TestMessage(SomeInt(1)).isInstanceOf[SomeTrait] shouldBe true
    }
  }
}