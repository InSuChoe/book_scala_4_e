package _7_builtIn_control_syntax._7_4_try_catch_finally

// f() 를 호출하면 결과는 2다. 그에 반해, 다음에서
object _7_13_3 {
 def g():Int = try try  1 finally  2
  def main(args: Array[String]): Unit = {
    val rst = g()
    println(rst);
  }
}
//  g() 를 호출하면 그 결과는 1이다.
//  대부분의 프로그래머는 그 결과에 다소 놀라는데,
//  결국 finally 구문에서는 값을 반환하지 않는 게 최선이다.
//  finally 절은 결팟값을 만들어 내기보다는
//  파일을 닫거나 정리 작업을 하는 등의 부수 효과를 제공하는 방법이라고 생각하는 게 가장 좋다.
