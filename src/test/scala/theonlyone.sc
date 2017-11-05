// #1

// your code goes here


val alph = List("ABCDEFGHIJKLMNOPQRSTUVWXYZ").flatMap(_.toUpperCase())
val mes = List("GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM").flatMap(_.toUpperCase())
val key = 7
/*for (i <- 1 to 26) {
  println {
    mes.map((s: Char) => {
      if (s.isLetter && s <= 'Z') alph((alph.indexOf(s) + i) % 26)
    })
  }
}*/
/*println {
  mes.map((s: Char) => {
    if (s.isLetter && s <= 'Z') alph((alph.indexOf(s) + key) % 26) else s
  })
}*/

println(s"#1 - ${mes.map((s: Char) => {
  if (s.isLetter && s <= 'Z') alph((alph.indexOf(s) + key) % 26) else s
})}")

// #2

// your code goes here
/////////creativity mode ON////////////
///infinity IDE line mode ON///
val b_num1 = "10001011101010101010000111110111011110101010101101110101010101010010000010110100101010101011011010100101011010101010101010101010101110101011000101101011110101010101010101010001010101010101101010101010101010101010101010111000001010101111010100111010101001011101010111111111101010101111111101010111110101001010101111110111101011010111111101011110101111111111111101111111111010101111101010101001111101010101010100100101010111101001010101001010101001010111110101010101010101011110101010010101001111101010100101111101010101001111111111101010111111111101001010111111110110101001111101010101111111010110100011111111111010101101011111110101010101110101010101010001110111101010101010101010101000001010110111111010101010010101011110101010000001010101000000000000101001111100000000000010010101010000001"
val b_num2_1 = "11100101000010101000001010010000010101011000110000110101000001010100000010000000010101100000110100100010111111111111111010010001010000001000000100000101011110101000000001010100000001010100101010111001010100000000000010101010101101010010101010101111001010000000000000001010010100111000010000000010100001010101000000110000001010101000000000000101001111100000000000010010101010000001"
//var dec_1 : Long = 0
//var dec_2 : Long = 0
//println(b_num1.size)
//for(i <- 1 to b_num1.size){
//  dec_1 += math.pow(2,b_num1.size-i).toInt * b_num1.charAt(i-1).toInt
//}
//println(dec_1)
//println(b_num2.size)
//for(i <- 1 to b_num2.size){
//  dec_2 += math.pow(2,b_num2.size-i).toInt * b_num2.charAt(i-1).toInt
//}
//println(dec_2)
//var dec_res = dec_1+dec_2
//println(dec_res)
//val dec_1 = b_num1.foldLeft()
/////creativity mode OFF///////
val aux_list = List.fill(b_num1.length-b_num2_1.length)("0")
val aux2 = aux_list.foldLeft(""){(memo:String, sum:String) => memo+sum}
val b_num2 = aux2+b_num2_1
println(b_num1.length)
println(b_num2.length)
var st:String = ""
def sum(a:String, b:String): String =
{
  val la = a.length
  val lb = b.length

  def getBit(s: String, index: Int): Int = {
    if (index < 0 || index >= s.length) return 0
    if (s.charAt(index) == '0') 0
    else 1
  }

  val max = Math.max(la, lb)

  val sum = new StringBuilder("")
  var carry = 0

  var i = 0
  while ( {
    i < max
  }) {
    val m = getBit(a, la - i - 1)
    val n = getBit(b, lb - i - 1)
    val add = m + n + carry
    sum.append(add % 2)
    carry = add / 2

    {
      i += 1; i - 1
    }
  }

  if (carry == 1) sum.append("1")

   sum.reverse.toString
}
val res = sum(b_num1,b_num2_1)
println(res)
println(res.length)
var s0 = 0
var s1 = 0
for (i <- 1 to res.length){
  if (res.charAt(i-1) == '0') s0+=1
  else s1+=1
}
println(s"#2 - ${(s1-s0).toString}")

// #3

// your code goes here
////ne vstyhau mode ON//////

def isBinaryPalindrome(num: Int): Boolean = {

  def isBitSet(num: Int, index: Int): Boolean = {
     (num & (1 << (index - 1))) != 0
  }
  val numOfBits = (Math.floor(Math.log(num) / Math.log(2)) + 1).toInt
  var left = 0
  var right = numOfBits - 1
  while ( {
    left < right
  }) {
    if (isBitSet(num, numOfBits - left) != isBitSet(num, numOfBits - right)) return false
    left += 1
    right -= 1
  }
  true
}

var sum2:Long = 0
var i = 1
var porp = 1
while ( {
  i <= 73
}) {
  if (isBinaryPalindrome(porp)){
    sum2+=porp
    i+=1
  }
  porp+=1

}
println(s"#3 - ${sum2}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")