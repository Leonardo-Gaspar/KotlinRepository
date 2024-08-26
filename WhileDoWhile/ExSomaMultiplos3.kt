//Exercicio soma dos multiplos de 3

fun main() {
    // Input para inserção do número
    println("Digite um número:")
    val numeroInput = readLine()

    // Verificação para ver se é nulo ou vazio
    if (numeroInput.isNullOrBlank()) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    // Tentando converter o numeroInput para inteiro
    val numero = numeroInput.toIntOrNull()
    
    // Verifica se a conversão foi bem-sucedida
    if (numero == null) {
        println("Por favor, insira um número inteiro válido.")
        return
    }

    var soma = 0 // Inicializa a variável soma
    var contador = 3 // Inicializa o contador com o primeiro múltiplo de 3

    // Loop para somar todos os múltiplos de 3 até o número inserido
    while (contador <= numero) {
        soma += contador
        contador += 3
    }

    // Exibe o resultado
    println("A soma dos múltiplos de 3 até $numero é $soma")
}