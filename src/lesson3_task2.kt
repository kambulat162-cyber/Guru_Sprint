fun main(){
    println("Введите пароль")
    var passowrd = readLine()!!
   do {
       passowrd = readLine()!!
   }
   while (passowrd != "admin")

}