package _7_builtIn_control_syntax._7_2_while
//  이 코드를 컴파일하면,
//  스칼라는 Unit 타입의 값과 문자열을 ! 를 사용해 비교한 결과는 언제나 참이라고 경고한다.
//  자바에서 할당의 결과는 할당한 값이다.
//  (예제에서는 표준 입력에서 전달받은 한 줄이다).

//  스칼라에서 할당의 결과는 유닛값인 ()이다.
//  따라서 line = readLine()의 결과는 항상 ()이므로
//  "(빈 문자열)과는 같을 수 없다.
//  이 while 문의 조건은 거짓이 될 수 없기에,
//  루프가 끝나지 않고 무한 반복된다.

//  while 루프는 결과가 특정 값이 아니기 때문에
//  순수한 함수형 언어는 이를 종종 제외하곤 한다.
//  그러한 언어에는 표현식은 있지만 루프는 없다.
//  그렇지만 스칼라에는 while 루프가 존재하는데,
//  때로는 명령형의 해법이 (특히 명령형 언어 기반에 익숙한 프로그래머에게는 더욱더)
//  가독성이 뛰어나기 때문이다.

//  예를 들어 특정 조건이 바뀔 때까지 정해진 절차를 반복하는 알고리즘을 작성한다면
//  while 문은 해당 내용을 직접 표현할 수 있지만,
//  함수형 언어에서 대안으로 제시하는 재귀를 사용한다면
//  코드를 읽는 어떤 이들에게는 명확해 보이지 않을 것이다.

//  예를 들어, 리스트 7.4는 두 수의 최대공약수를 구하는 또 다른 방법을 보여준다.
//  (리스트 7.4에 보이는 gcd 함수는 Rational 클래스의 최대공약수를 계산하기 위해
//  리스트 6.3에 처음 등장한 비슷한 이름의 함수와 동일한 접근법을 취한다.
//  주된 차이점은 리스트 7.4의 gcd는 Int가 아닌 Long 타입을 기반으로 동작한다는 것이다.)

//  x와 y, 2개의 같은 값이 주어졌다면
//  리스트 7.4의 gcd 함수는 리스트 7.2에서 살펴본 gcdLoop 함수와 같은 결과를 반환할 것이다.
//  두 가지 접근의 차이는 gcdLoop는 var 변수와 while 루 프를 사용하는 명령형 스타일이고,
//  gcd는 자신을 호출하는 재귀를 사용하고 var 변수는 사용하지 않는 함수형 스타일이라는 점이다.
object _7_4 {
  def gcd(x:Long, y:Long):Long=
  if(y==0)x else gcd(y, x % y)

  def main(args: Array[String]): Unit = {
    println(gcd(1L, 2L));
  }
}