fun main() {
    println("Digite o numero que deseja verificar:") // Definindo o número que será verificado
    val input = readLine()

    if (input.isNullOrBlank()) {
        println("O campo não pode ser nulo")
        return
    }

    val num = input.toIntOrNull() // Tenta converter a string para um inteiro

    if (num == null || num < 2) { // Verifica se o número é inválido ou menor que 2
        println("Por favor, insira um número válido maior ou igual a 2.")
        return
    }

    var isPrime = true // Variável assume que é primo

    // Utilizando loop FOR para verificar se é primo
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) { // Verifica se é um número divisível por i
            isPrime = false
            break // Quebra o loop
        }
    }

    // Após o loop, verifica-se o valor de isPrime para determinar se é ou não um primo
    if (isPrime) {
        println("$num é um número primo")
    } else {
        println("$num não é um número primo")
    }
}