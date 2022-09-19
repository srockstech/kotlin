fun apply(x: Int, action: (Int) -> Int): Int{
    return action(x)
}

fun main(){
    println(apply(4, {x -> x/2}))
}

//apply is a higher order function since it takes another function as an argument