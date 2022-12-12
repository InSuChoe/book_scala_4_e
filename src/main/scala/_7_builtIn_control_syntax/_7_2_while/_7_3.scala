package 내장_제어_구문.while_루프

import scala.io.StdIn

//  스칼라에는 do - while 루프도 있다.
//  while 루프와 유사하나 본문을 수행하고 나서 조건을 검사한다는 차이가 있다.
//  리스트 73 은 표준 입력으로부터 읽은 문장이 빈 줄일 때까지
//  입력받은 줄을 출력하는 스칼라 스크립트다.

//  리스트 7.3 do-whle로 표준 입력 읽기
object _7_3 {
  def main(args: Array[String]): Unit = {
    var line = ""
    do {
      line = StdIn.readLine()
      println("Read: " + line)
    } while (line != "")
  }
}
