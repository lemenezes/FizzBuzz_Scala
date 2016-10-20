import org.scalatest.FunSuite;

class FizzBuzzTest extends FunSuite{

  test("Deve retornar 1 quando é igual a 1") {

    val resultado = FizzBuzz.recebeResultado(1)
    //Se voce escolheu um idioma, programa so nele. Nao é bom misturar
    //no metodo assert, a gente precisa comparar a variavel resultado com o valor que ela deveria ter neste teste
    assert(resultado == "1")
  }

  test("Deve retornar 2 quando é igual a 2"){

    val resultado = FizzBuzz.recebeResultado(2)
    assert(resultado == "2")

    //O metodo vai precisar receber um parametro, certo? Vamos alterar os testes primeiro
    //O metodo verificar ainda nao recebe parametro, entao essa assinatura de metodo nao existe
  }

  test("Deve retornar Fizz quando é igual a 3"){
    val resultado = FizzBuzz.recebeResultado(3)
    assert(resultado == "Fizz")

  }

  test("Deve retornar Fizz quando é igual a 7"){
    val resultado = FizzBuzz.recebeResultado(7)
    assert(resultado == "7")

  }

  test("Deve retornar Fizz quando é igual a 9"){
    val resultado = FizzBuzz.recebeResultado(9)
    assert(resultado == "Fizz")

  }
//Se voce quiser colocar o código dos exercicios que eu te passar no github e me mandar para dar uma olhada, pode
  // fazer isso coursera
  //Qualquer coisa que você quiser, porque eu posso te dar algum feedback ou se eu conhecer outra forma de fazer eu posso
  //te mostrar
  test("Deve retornar Buzz quando é igual a 10"){
    val resultado = FizzBuzz.recebeResultado(10)
    assert(resultado == "Buzz")

  }

  test("Deve retornar Buzz quando é igual a 25"){
    val resultado = FizzBuzz.recebeResultado(25)
    assert(resultado == "Buzz")

  }

  test("Deve retornar FizzBuzz quando é igual a 3 e 5"){
    val resultado = FizzBuzz.recebeResultado(75)
    assert(resultado == "FizzBuzz")
  }
}
