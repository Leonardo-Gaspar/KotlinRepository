//Exercicio contagem regressiva

fun main() {
    println("Digite um número inteiro positivo:")
    val numeroInput = readLine()

    // Verificar se o campo é nulo ou vazio
    if (numeroInput.isNullOrBlank()) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    // Verificar se é um número e se é positivo
    val numero = numeroInput.toIntOrNull()
    if (numero == null || numero <= 0) {
        println("Por favor, insira um número inteiro positivo.")
        return
    }

    // Iniciar o contador com o valor de número
    var contador = numero
    while (contador >= 1) { //Enquanto o contador for maior ou igual a 1
        println(contador)   
        contador--          //Decrementando o contador em 1 a cada interação
    }
}
