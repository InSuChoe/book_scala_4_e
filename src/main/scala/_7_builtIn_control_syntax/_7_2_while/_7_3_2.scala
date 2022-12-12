package _7_builtIn_control_syntax._7_2_while

//  while과 do-while이 이루는 구조는 수행 결과가 관심을 가질 만한 값이 아니기 때문에
//  표현식이라 하지 않고 '루프'라 부른다.
//  루프의 결과 타입은 Unit이다.
//  Unit 타입에는 유닛값init value 밖에 없고,
//  이 값을 빈 괄호 ()로 표기한다.
//  ()라는 값이 존재한다는 점에서 자바의 void와 스칼라의 Unit은 다르다.
//  다음을 인터프리터에서 실행해보자.
object _7_3_2 {

}
//  scala> def greet() = { println("hi") } greet: ()Unit
//  scala> val wahtAmI = greet()
//  hi
//  whatAmI: Unit =()

//  println("hi") 표현식의 타입이 Unit이기 때문에
//  greet은 결과 타입이 Unit 인 프로시저 procedure
//  (결값이 있으면 함수, 결값이 없으면 프로시저라고 한다.
//  Unit 타입의 ()는 엄연한 값이긴 하지만 아무 쓸모가 없고,
//  이를 반환하더라도 결국 호출하는 쪽에서는 이를 무시할 것이므로,
//  이 책에서도 이런 함수를 프로시저라고 부른다. - 옮긴이)다.
//
//  따라서 greet은 유닛값인 ()를 반환한다.
//  두 번째 줄에서 whatAmI 변수의 타입이 Unit이고
//  변수에 저장된 값이 greet의 결팟값인 ()라는 사실로부터
//  이를 확인할 수 있다.