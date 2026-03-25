fun main(){
    println("Введите возвраст: ")
    val age = readln().toInt()
    val bool = age >=AGE_OF_MAJORITY
    println(bool)


}
const val AGE_OF_MAJORITY = 18
