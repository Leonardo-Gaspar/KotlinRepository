//Exercício Par e Ímpar

fun main(){
    println("Digite um numero:")
    val numeroInput = readLine()

    if(numeroInput == null){
        println("O campo nao pode ser nulo")
        return
    }

    val numero = numeroInput.toIntOrNull()

    if(numero == null){
        println("Entrada invalida. Digite um numero valido")
        return
    }

    if(numero%2 == 0){
        println("O numero eh par")
    }else{
        println("O numero eh impar")
    }
}