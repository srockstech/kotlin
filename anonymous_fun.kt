//Anonymous Functions

val f = {a: Int, b: Int -> a+b}
// val f: (Int, Int) -> Int = {a, b -> a+b}

val g = {a: Double, b: Double -> a+b}
// val g: (Double, Double) -> Double = {a, b -> a+b}

fun main() {
    var sum = f(1,2)
    var sumDouble = g(4.0, 6.4)
    println(sum)
    println(sumDouble)
}

