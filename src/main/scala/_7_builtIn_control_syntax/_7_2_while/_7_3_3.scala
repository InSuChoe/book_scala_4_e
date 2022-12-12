package _7_builtIn_control_syntax._7_2_while

import scala.io.StdIn

//  유닛값이 결과인 또 다른 구성요소는 var 변수에 대한 재할당이다.(여기서는 결값을 사용한다).
//  예를 들어. 다음과 같이 자바에서 사용하는(C. C++에서도 마찬가지다)
//  일반적인 형태로 while 루프를 스칼라에서 사용하면 문제가 생긴다.

object _7_3_3 {
  def main(args: Array[String]): Unit = {
    var line =""
    while ((line = StdIn.readLine()) != "") {  //  작동하지 않음!
      println("Read : " +line)
    }
  }
}