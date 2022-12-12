package _7_builtIn_control_syntax._7_1_if
//  이번에는 if 문에 2개의 분기가 존재한다.
//  args가 비어 있지 않으면 목록의 첫 요소인 args(0)을 선택한다.
//  args가 비어 있으면 디폴트값을 선택한다.
//  if 표현식은 선택한 값이 그 결과이기 때문에, filename 변수를 해당 값으로 초기화한다.
//  제시한 코드의 길이는 이 전 코드에 비해 아주 조금 짧은 정도이지만, 진짜 장점은 var가 아닌 val을 사용했다는 것이다.

//  var 가 아닌 val을 사용함에 따른 두 번째 장점은 동일성 추론 eqaltional ressaning 에 더욱 유리하다는 것이다.
//  부수 효과가 없다는 가정하에서 어떤 변수는 그 값을 도출하는 표현식과 동등하다.
//  따라서 항상 변수명을 표현식으로 대체할 수 있다.
//  예를 들어 println(filename) 대신, 다음과 같이 쓸 수 있다.
object _7_1_3 {
  def main(args: Array[String]): Unit = {
    println(
      if (!args.isEmpty) args(0)
      else "default.txt")
  }
}
//  선택은 여러분의 몫이다.
//  두 방식 중 어느 쪽으로도 쓸 수 있다.
//  val을 사용하면 코드가 진화하는 동안에도 안전하게 리팩토링을 할 수 있다.
//  val을 사용할 기회를 노려보자.
//  val은 코드를 더 가독성 높고 리팩토링하기 쉽게 해준다.