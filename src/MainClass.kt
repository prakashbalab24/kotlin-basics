

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
    println("Hello Kotlin:"+i+s)

    println("Hello $c")

    print(v + x)

    callMe()
}

fun callMe(){
    for(i in 1..10){
        println(i)
    }
}