

/** var (Mutable reference) **/
/** explicitly specified **/
var i: Int =10
var s: String = "hello"

/** not explicitly specified **/
var x = 10
var v = "kotlin"
var c = 'K'

/** cannot reasign "val" like final in java - (Immutable reference) **/
val j = 10
val k = "final"

/** fun keyword for methods **/
fun main(args: Array<String>){
    /** println iside calling java System.out.println **/
//    println("Hello Kotlin:"+i+s)
//
//    println("Hello $c")
//
//    print(v + x)
//
//    callMe()

    conf()
    print("Ans:"+addNum(2,3))
}

fun callMe(){
    for(i in 1..10){
        println(i)
    }
}

/** function with return type **/
fun addNum(n1:Int,n2:Int): Int{
    return n1+n2
}

fun conf(){
    val a = -12
    val b = 12

    // use of greater than operator
    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        b
    }

    println("max = $max")
}
