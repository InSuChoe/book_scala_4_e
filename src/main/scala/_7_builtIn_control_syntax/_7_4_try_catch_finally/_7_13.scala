package _7_builtIn_control_syntax._7_4_try_catch_finally

import java.net.{MalformedURLException, URL}

//  참고
//
//  리스트 7.12는 파일, 소켓, 데이터베이스 연결 같은 비 메모리 자원을 사용 후
//  확실히 정리하기 위해 사용 하는 관용적인 코드다.
//  자원을 획득하고,
//  try 블록을 시작해 블록 내부에서 자원을 사용한다.
//  마지막으로, finally 블록에서 자원을 닫아준다.
//  이러한 관용적인 코드는 자바에서와 마찬가지로 스칼라에서도 사용할 수 있다.
//  하지만 스칼라에서는 동일한 목적을 좀 더 간결하게 달성하기 위해,
//  빌려주기 패턴(loan pattern) 이라는 기법을 사용할 수도 있다.
//  빌려주기 패턴은 9.4절에서 설명한다.
//
//  값 만들어내기
//
//  대부분의 스칼라 제어 구조와 마찬가지로 try-catch-finally도 결과는 값이다.
//  예를 들어, 리스트 7.13은 URL을 해석하되 형식이 잘못된 경우
//  디폴트값을 사용하게 하는 내용이다.
//  예외가 발생하지 않을 경우 전체 결과는 try 절의 수행 결과다.
//  예외가 발생하고 해당 예외를 잡았다면 해당 catch 절의 수행 결과가 전체 결과다.
//  예외가 발생했는데도 처리하지 못했다면 해당 표현식의 결과는 전혀 없다.
//  finally 절에 결팟값이 있다면 버려진다.
//  보통 finally 절은 파일을 닫는 등의 정리 작업을 수행하므로,
//  try 절의 본문이나 catch 절의 결과를 수정하지 않아야 한다.
//
//  리스트 7.13 값을 만들어내는 catch 절
object _7_13 {
  def urlFor(path:String): Unit = {
    try {
      new URL(path)
    } catch {
      case e : MalformedURLException => new URL("http://www.scala-lang.org")
    }
  }
  def main(args: Array[String]): Unit = {
    val rst = urlFor("http://www.naver.com")
    println(rst)
  }

}
