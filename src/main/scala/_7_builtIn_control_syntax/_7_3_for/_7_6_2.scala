package _7_builtIn_control_syntax._7_3_for

//  동일한 목적을 다음의 코드로 달성할 수도 있다.
object _7_6_2 {
  def main(args: Array[String]): Unit = {
    val filesHere = (new java.io.File(".")).listFiles

    for(file <- filesHere) {
      if(file.getName.endsWith(".scala"))
       println(file)
    }
  }
}
