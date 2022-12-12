package _7_builtIn_control_syntax._7_4_try_catch_finally

import java.io.FileReader;

//  try-catch의 동작도 예외를 다룰 수 있는 여타 언어와 마찬가지로 동작한다.
//  본문을 수행하다가 예외가 발생하면 각 catch 절을 차례로 시도한다.
//  예제에서 발생한 예외 타입이 FileNotFoundException이면,
//  첫 case 절을 수행할 것이다.
//  예외 타입이 IOException 일경우 두 번째 절을 수행한다.
//  발생한 예외가 이 두 가지 타입이 아니라면
//  try-catch 가 끝나고 예외는 계속 전파될 것이다.
//
//  참고
//
//  스칼라에서 쉽게 알 수 있는 차이점 한 가지는,
//  스칼라의 경우 체크드 예외 (checked exception)를 catch 를 이용해 잡거나
//  메서드 선언 시 throws로 선언하지 않아도 된다는 점이다.
//  원한다면 애노테이션인 @throws를 이용해 throws 절을 선언할 수도 있지만,
//  이는 선택사항이다.
//  31.2절에서 gthrows에 대해 설명한다.
//
//  finally 절
//
//  표현식의 결과가 어떻든 특정 코드를 반드시 수행하고 싶은 경우,
//  원하는 표현식을 finally 절로 감쌀 수 있다.
//  예외가 발생해 메서드를 빠져나가더라도 열어둔 파일을 닫고 싶은 경우가 그렇다.
//  리스트 7.12는 그 예를 보여준다

//  (catch 절 안에 있는 case 문을 항상 중괄호로 감싸줘야 하지만,
//  try와 Inaly 안에 단 하나만 포함하는 경우 중괄호가 필요 없다.
//  예를 들어,
//  try t() calch { case e: Exception => ... } finaly if()처럼 쓸 수도 있다.)

//  리스트 7.12 스칼라로 작성한 try-finally 절
object _7_12 {
  def main(args: Array[String]): Unit = {
    val file=new FileReader("input.txt")
    try{
      // 파일을 사용한다
    } finally {
      file.close() // 파일을 확실히 닫는다.
    }
  }

}
