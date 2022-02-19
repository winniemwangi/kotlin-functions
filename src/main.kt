fun main (){
    helloname()
    modulus(20, 6)
    sum(2, 4, 6, 8)
    interesting()
}
 fun helloname(){
     var name = "winnie"
     println("hello "+name)
 }

fun modulus(a: Int, b: Int){
    var modulus = a%b
    println(modulus)
}

fun sum(a: Int, b: Int, c: Int, d: Int){
    var sum = a+b+c+d
    println(sum)
}

fun interesting(){
    var interesting = "i love swimming"
    println(interesting)
}