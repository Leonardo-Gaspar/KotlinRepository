// Desafio soma de Array

fun main(){

    val pares = arrayOf(0, 2, 4, 6)
    val impares = arrayOf(1, 3, 5, 7)
    var sumPares = 0
    var sumImpares = 0

    //utilizando as operações de soma para calcular as somas entre os elementos pares e impares

    for (par in pares) {

    sumPares += par
    }
        
    for (impar in impares) {

    sumImpares += impar
    }

    val somaTudo = sumPares + sumImpares
    println("A soma de tudo é: $somaTudo")
}
