package 내장_제어_구문.while_루프

//  스칼라의 while 루프는 여타 언어와 마찬가지로 동작한다.
//  while에는 조건 condition 과 본문 body 이 하나씩 존재하며, 조건이 참인 동안 본문을 반복 수행한다.
//  리스트 7.2에 예가 있다.

//  리스트 7.2 최대공약수를 계산하는 while 루프
object _7_2 {
  def stagcdLoof(x: Long, y: Long): Long = {
    var a = x
    var b = y

    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def main(args: Array[String]): Unit = {
    val list = _7_2
    val rst = list.stagcdLoof(1L, 2L)
    println(rst)
  }
}
