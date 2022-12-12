package _7_builtIn_control_syntax._7_3_for

//  예를 들어,
//  리스트 7.10의 for 표현식은 먼저 현재 디렉토리의 모든 파일이 들어 있는
//  filesHere라는 Array[File] 타입 컬렉션을 scala 파일만 포함하도록 변환한다.
//  그 결과로 나온 각 파일(file에 저장됨)을 기반으로
//  리스트 7.8에서 살펴본 fileLines 메서드를 호출해 Array[String]을 만든다.
//  Array[String]의 각 원소는 처리 중인 파일의 각 줄이다.
//  이 Array[String]에 들어 있는 줄을 변환해
//  "for" 문자열이 들어간 줄의 앞뒤 공백을 제거한 다른 Array[String]을 얻는다.
//  마지막으로, yield를 사용해 각 줄의 길이를 구해서 Array[Int]로 만든다.

//  리스트 7.10 lor 표현식으로 Array[File]을 Array[int]로 변환하기
object _7_10 {
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines() toArray
    def main(args: Array[String]): Unit = {
      val filesHere = (new java.io.File(".")).listFiles()

      val forLineLengths =
        for{
          file <- filesHere
          if file.getName.endsWith(".scala")
          line <- fileLines(file)
          trimmed=line.trim
          if trimmed.matches("*.for.*")
        } yield trimmed.length
    }

}
//  지금까지 for 표현식의 주요 특징을 살펴봤다.
//  다소 급하게 살펴봤는데, for 표현식에 대한 자세한 내용을 23장에서 의힐 예정이다.