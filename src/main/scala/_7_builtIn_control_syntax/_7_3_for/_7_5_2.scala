package _7_builtIn_control_syntax._7_3_for

//  제너레이터 prenorator 라고 부르는 file <- fileshere 문법을 이용해 filesHere의 원소를 이터레이션한다.
//  각 반복 단계마다. file이라는 새로운 val을 각 원소의 값으로 초기화한다.
//  컴파일러는 filesHere가 Array[File] 타입이기 때문에 file의 타입이 File임을 추론해낸다.
//  반복의 각 단계에는 for 표현식의 본문인 println(file)을 실행한다.
//  File의 toString 메서드는 파일이나 디렉토리의 이름을 반환하기 때문에,
//  현재 디렉토리 내 모든 파일과 디렉토리의 이름을 출력한다.
//
//  for 표현식은 배열뿐 아니라 어떤 종류의 컬렉션에도 동작한다.
//  (엄밀히 말하면 for 표현식의 <- 기호 오른쪽에는 정해진 메서드
//  (이 예제에서는 foreach) 를 갖고 있는 어떤 타입의 표현식이 라도 올 수 있다.
//  스칼라 컴파일러가 어떻게 for 표현식을 처리하는지는 23 장에서 설명한다.)

//  한 가지 간편한 특별한 경우는 5장의 표 5.4에서 잠시 살펴본 Range 타입이다.
//  Range는 1 to 5와 같은 문법을 이용해 만들 수 있고,
//  for 문을 이용해 Range를 이터레이션할 수 있다. 다음은 그 예다.
object _7_5_2 {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 4)
      println("Iteration "+ i)
  }
}
