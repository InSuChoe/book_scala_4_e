package _7_builtIn_control_syntax._7_3_for

import java.io.File

//  리스트 7.9에서는 trimmed라는 변수가 for 표현식의 중간에 등장한다.
//  trimmed에는 line. trim의 결팟값이 들어간다.
//  for 표현식의 나머지 부분에서도 trimmed 변수를 두 번 사용
//  if와 printin에 한 번씩 등장한다.
//
//  새로운 컬렉션 만들어내기
//
//  지금까지의 모든 예제에서는 값들을 이터레이션하면서 조작하기만 하고 결과는 무시했다.
//  하지만 이터레이션의 매 반복 단계의 결과를 저장하기 위한 값을 만들 수 있다.
//  값을 만들려면, for 표현식의 본문 앞에 yield라는 키워드를 사용한다.
//  scala 파일을 식별하고 결과를 배열에 저장하는 함수는 다음과 같다.
object _7_9_2 {
    def main(args: Array[String]): Unit = {
      val filesHere = (new java.io.File(".")).listFiles()
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
      } yield file
    }

}
