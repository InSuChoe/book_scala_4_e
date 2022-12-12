package _7_builtIn_control_syntax._7_4_try_catch_finally

//  자바에 익숙하다면,
//  자바의 경우 try-finally의 결과가 값이 아니기 때문에
//  스칼라는 동작이 다르다는 사실을 알아두면 유용하다.
//  자바에서는 finally 절 안에서 명시적으로 return 문을 사용하거나,
//  예외를 발생시키면 try 블록이나 catch 절에서 발생한 원래의 결과를 덮어쓴다.
//  예를 들어, 다음과 같은 다소 억지스런 함수 정의를 생각해보자.
object _7_13_2 {
 def f():Int = try return 1 finally return 2
  def main(args: Array[String]): Unit = {
    val rst = f()
    println(rst);
  }

}
