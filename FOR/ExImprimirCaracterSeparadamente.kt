//Exercicio imprimir caracter separadamente

fun main() {
    println("Digite uma palavra:")
    val wordInput = readLine()

    if (wordInput.isNullOrBlank()) {
        println("O campo não pode ser nulo")
        return
    }

    // Usando loop FOR para imprimir cada char da string separadamente
    for (char in wordInput) {
        println(char)
    }
}