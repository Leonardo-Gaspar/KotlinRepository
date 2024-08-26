//Calcular a soma dos numeros pares em uma lista de numeros.
//Criar uma lista de numeros e calcular a soma dos numeros pares.

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //Criando a lista

    var sumNumbers = 0 // armazenar a soma
  
    for (number in numbers) { //Fazendo a soma
        if (number % 2 == 0) { //Pegando apenas os pares
            sumNumbers += number
        }
    }

    println("A soma dos números pares na lista é: $sumNumbers")
}
