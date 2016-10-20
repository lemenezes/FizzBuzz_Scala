
object FizzBuzz {
  /*def verificar(numero:Int) = {

    if(numero == 3)
      "Fizz"
    else if (numero ==5)
      "Buzz"
    else if (numero == 15)
       "FizzBuzz"
    else
      numero
  }
*/

  //pattern matching
  def recebeResultado(number: Int): String = (number % 3, number % 5) match {
    case (0 , 0) => "FizzBuzz"
    case (0 , _) => "Fizz"
    case (_ , 0) => "Buzz"
    case  _      => number.toString()
  }
}
