// Exercício classificação numérica

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

        if (numero > 0){
            println("O numero eh positivo")
        }else if (numero < 0){
            println("O numero nao eh positivo")
        }else{
            println("O numero eh ZERO")
        }
}