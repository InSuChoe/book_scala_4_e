package _7_builtIn_control_syntax._7_3_for

//  이 코드는 이전 코드와 같은 결과를 출력한다.
//  명령형 프로그래밍에 익숙한 프로그래머라면 이런 방법이 더 친숙할 것이다.
//  그렇지만 명령형 프로그래밍 형태로 작성하는 것은 가능한 방법 중 하나일 뿐이다.
//  왜냐하면 여기서 사용한 for는 printin을 통한 출력 부수효과만을 사용하고,
//  for 의 결과로 발생하는 유닛값 ()는 사용하지 않기 때문이다.
//  이번 절의 뒷부분에서 예를 확인하겠지만,
//  for 표현식이 '표현식'이라고 불리는 이유는 사용하기 위한 값을 결과로 내놓기 때문이다.
//
//  for 문의 결핏값은 <- 절에 의해 타입이 정해지는 컬렉션이다.
//  원한다면 필터를 여러 개 추가할 수 있다.
//  if 절만 더 넣으면 된다.
//  예를 들어, 더 방어적이라 할 수 있는 리스트 7.7은 디렉토리가 아닌 파일만 출력하는 코드다.
//  file의 isFile  메서드를 통해 검사하는 필터를 추가해서 디렉토리를 제외한다.

//  리스트 7.7 for 표현식에 여러 개의 필터 적용하기
object _7_6_3 {
  def main(args: Array[String]): Unit = {
    val filesHere = (new java.io.File(".")).listFiles

    for(file <- filesHere
        if file.isFile
        if file.getName.endsWith(".scala"))
       println(file)
  }
}
