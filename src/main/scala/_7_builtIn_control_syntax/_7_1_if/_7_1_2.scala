package _7_builtIn_control_syntax._7_1_if

//  위 코드는 변수 filename을 선언하고 , 디폴트값으로 초기화한다.
//  그리고 if 문을 사용해 인자가 있는지 여부를 조사한다.
//  만일 인자가 있다면 filename 변수에 인자 목록의 값을 할당한다.
//  인자가 없다면 이미 설정한 디폴트값을 유지한다.

//  2.3절에서 언급한 대로,
//  스칼라의 if 표현식은 값을 내놓기 때문에 위 코드를 더욱 근사하게 작성할 수 있다.

//  리스트 7.1은 var 변수 없이 동일한 내용을 구현한 코드를 보여준다.
object _7_1_2 {
    def main(args: Array[String]): Unit = {

      val filename = if (!args.isEmpty) args(0) else "default.txt"
      println(filename)
    }
}
