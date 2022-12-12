package _7_builtIn_control_syntax._7_4_try_catch_finally

//  7.4 try 표현식으로 예외 다루기

//  스칼라에서도 예외는 여타 언어와 유사하게 동작한다.
//  메서드는 보통의 경우 값을 반환하지만, 예외를 발생시키며 종료할 수도 있다.
//  메서드를 호출한 측에서는 발생한 예외를 잡아서 처리할 수도 있고, 그냥 종료할 수도 있다.
//  호출한 메서드가 별다른 처리를 하지않고 종료하면 해당 메서드를 호출한 메서드,
//  즉 호출자의 호출자 메서드로 예외를 전파한다.
//  이런 식의 예외 전파는 해당 예외를 처리하는 메서드를 만나거나
//  더 이상 메서드가 남아 있지 않을 때까지 이뤄진다.
//  예외 발생시키기 스칼라에서 예외를 발생시키는 방법은 자바와 같다.
//  예외 객체를 생성하고, throw 키워드를 이용해 생성한 예외를 던진다.
//
//  throw new IllegalArgumentException
//
//  모순처럼 보일 수도 있는데,
//  스칼라에서는 throw가 결과 타입이 있는 표현식이다.
//  다음은 결과 타입의 예다.
object _7_10_2 {
  def main(args: Array[String]): Unit = {
    val n = 11;
    val half = if (n % 2 == 0) n / 2
    else throw new RuntimeException("n must be even");
  }

}
