package lesson3

fun main(){
    println("Введите значение")
    var count = readln().toInt()
    while(count > 0 ){
        count -= 1
        println(count)
    }
}
