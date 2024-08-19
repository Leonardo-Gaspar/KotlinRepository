//Exercício: Maior e Menor Elemento

fun main(){

    //Array de inteiros
    val numbers = intArrayOf(8, 3, 12, 6, 20, 1, 21)
    var min = numbers[0]     //variável para armazenar o menor elemento
    var max = numbers[0]    //variável para armazenar o maior elemento

    //Loop para encontrar o menor e o maior elemento
    for (number in numbers){
        if (number < min) {
            min = number
        }
        if(number > max){
            max = number
        }
    }

    println("O menor elemento é: $min\nO maior elemento é: $max")
}