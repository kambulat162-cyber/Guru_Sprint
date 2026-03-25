package lesson1

fun main(){
    println("Введите ваш возвраст: ")
    val age = readLine()!!.toInt()
    val message = if (age >= 18) {
        println("Добро пожаловать!")
    }
    else
        println("Вход запрещен!!!! иди гуляй")

    println("$message")
}
