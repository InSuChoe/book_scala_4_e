package _7_builtIn_control_syntax._7_3_for

import java.io.File


//  중첩 이터레이션
//
//  2개의 루프를 중첩한 리스트 7,8의 코드처럼 여러 개의 <- 절을 추가하면
//  중첩 루프를 작성할 수 있다.
//  바깥쪽 루프는 filesHere 내의 scala로 끝나는 파일을, 안쪽 루프는 바깥
//  루프에서 얻은 file에 fileLines(file)을 호출한 결과를 이터레이션한다.
//
//  리스트 7.8 lor 표현식에서 여러 개의 제너레이터 사용하기
object _7_8 {
  def filelines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines() toArray

  def grep(pattern: String, filesHere: Array[File]) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- filelines(file)
      if line.trim.matches(pattern)
    ) println(s"$file: ${line.trim}")

  def main(args: Array[String]): Unit = {
    val filesHere = (new java.io.File(".")).listFiles

    grep(".gcd.", filesHere)
  }
}
