fun main(){
    var arr = arrayOf(1, 3, 5)
    arr.forEach{
        println(it * 4)
    }
    println();
    arr.forEach{
        item -> println(item * 4)
    }
}