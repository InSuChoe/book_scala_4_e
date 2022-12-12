package _7_builtIn_control_syntax._7_5_match
//  7.5 match 표현식
//
//  스칼라의 match 표현식은 여타 언어의 switch하 문과 유사하게,
//  다수의 대안 alternative 중 하나를 선택하게 해준다.
//  일반적으로 match 표현식에서는 15장에서 설명할 패턴 altern을 사용해 원하는 내용을 선택한다.
//  전반적인 내용은 나중에 알아보기로 하고,
//  지금은 match로 대안 중 하나를 고르는 방법부터 알아보자.
//
//  예를 들어. 리스트 7.14의 스크립트는 인자 목록에서 음식의 이름을 읽어 이에 어울리는 짝을 출력한다.
//  match 표현식은 인자 목록의 첫 번째 요소인 firstarg를 조사한다.
//  firstarg가 문자열 "salt" 이면 "pepper"를 출력하고,
//  "chips" 이면 "salsa"를 출력하는 식이다.
//  디폴트 case는 밑줄(_)로 표시하는데,
//  스칼라에서는 완전히 알려지지 않은 값을 표시하기 위한 위치 표시자 aceholde'로 밑줄을 종종 사용한다.
//
//  (본문에서 설명했듯이 스칼라는 finally 절의 값을 무시한다.
//  다른 식으로 생각해본다면,
//  'try 본문 calch 오류 처리 finally 최종 처리'에서
//  try finally는 본래의 로직과는 관계없는 예외 상황(오류 발생이나 최종 정리)을 위한 것으로,
//  정상적인 로직의 결괏값 흐름과는 관계가 없다고 보는 편이 정당하다.
//  오류가 나지 않은 경우,
//  본문의 최종 결과가 전체 try-catch-finally 표현 식의 최종 결과인 편이 훨씬 자연스럽다.
//  자바에서도 finally에서 무언가 다른 값을 반환하는 것은 좋은 프로그래밍 습관이 아니다. - 옮긴이

//  리스트 7.14 부수 효과가 있는 maich 표현식
object _7_14 {
  def main(args: Array[String]): Unit = {
  val firstArg = if (args.length > 0)
    args(0) else ""

    firstArg match{
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ =>println("huh?")
    }
  }
}
