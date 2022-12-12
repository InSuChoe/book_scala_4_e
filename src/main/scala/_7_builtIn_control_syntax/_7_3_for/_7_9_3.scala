package _7_builtIn_control_syntax._7_3_for

//  for 표현식의 본문을 수행할 때마다 값(여기서는 file)을 하나씩 만들어낸다.
//  for 의 전체 결팟값은 각 이터레이션마다 yield에서 나온 값이 모두 들어 있는 컬렉션이다.
//  처리 대상 컬렉션의 타입이 결과 컬렉션의 타입을 결정한다.
//  이 예제의 경우 filesHere가 배열이고,
//  yield가 만들어내는 각각의 결과는 File 타입이므로 전체 결과는 Array[File] 이다.
//  하지만 yield 키워드의 위치에 주의해야 한다. for-yield 표현식의 문법은 다음과 같다.
//
//  for 절 yield 본문
//
//  yield는 전체 본문의 앞에 위치한다.
//  본문이 중괄호 안에 들어 있는 코드 블록이라 할지라도,
//  yield는 코드 블록의 마지막이 아니라 여는 중괄호 앞에 위치해야 한다.
//  다음과 같이 쓰기 쉽지만, 이를 피해야 한다.
//  (yield가 어떤 결과를 만들어낸다고 가정하면,
//  for 본문의 맨 마지막에 vield가 위치해야 할 것 같으므로 착각하기 쉽다는 뜻이다.
//  yield는 전체 코드 블록(For의 본문)의 이터레이션마다 만들어내는 결핏값을 모은다는 사실을 기억하라.
//  - 옮긴이)
object _7_9_3 {
    def main(args: Array[String]): Unit = {
      val filesHere = (new java.io.File(".")).listFiles()
      for (
        file <- filesHere
        if file.getName.endsWith(".scala")
      ) yield file // 문법 오류
    }

}
