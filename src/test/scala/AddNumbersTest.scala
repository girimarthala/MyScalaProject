/**
  * Created by GirishKumarReddy on 1/22/2017.
  */
import TestPrograms.AddNumbers
import org.scalatest._

class AddNumbersTest extends FlatSpec with Matchers{
  "TestPrograms.AddNumbers" should "add two numbers" in {
    val addNumbers = new AddNumbers
    val result = addNumbers.add(1,2)
    print("Result:"+ result)
  }
}
