package _7_builtIn_control_syntax._7_3_for

//  이터레이션 대상 값의 범위에서 최댓값을 제외하고 싶다면 to 대신에 until을 사용한다.
object _7_5_3 {
  def main(args: Array[String]): Unit = {
    for(i<-1 until 4)
      println("Iteration "+ i)
  }
}
