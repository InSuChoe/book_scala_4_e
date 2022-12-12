package _7_builtIn_control_syntax._7_3_for

import java.io.File


//  원한다면 괄호 대신 중괄호를 사용해 제너레이터와 필터를 감싸도 된다.
//  중괄호를 사용하면 4.2절에서 설명한 대로 스칼라 컴파일러가 세미콜론을 추론하기 때문에,
//  괄호를 사용할 때 써야만 했던 세미콜론을 제거할 수 있다.
//
//  for 중에 변수 바인딩하기
//
//  방금 살펴본 코드는 line.trim이라는 표현식을 반복한다.
//  무시해도 좋은 하찮은 계산은 아니므로 단 한 번만 계산하고 싶다.
//  등호를 이용해 새로운 변수에 결과를 할당해놓으면 가능하다.
//  바운드한 변수는 val 변수처럼 선언하고 사용하면 되는데,
//  val이라는 키워드를 사용하지는 않는다.
//  리스트 7.9는 한 가지 예를 보여준다.
//
//  리스트 7.9 for 표현식의 흐름 중간에 값 할당하기
object _7_9 {
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines() toArray

  def grep(pattern: String, filesHere: Array[File]) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(s"$file: $trimmed")

    def main(args: Array[String]): Unit = {
      val filesHere = (new java.io.File(".")).listFiles()
      grep(".*gcd.*", filesHere)
    }

}
