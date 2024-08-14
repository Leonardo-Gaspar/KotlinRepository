//input precisa

fun main() {
    println("Digite a nota da primeira avaliacao:")
    val nota1 = readLine()!!.toDouble()
    
    println("Digite a nota da segunda avaliacao:")
    val nota2 = readLine()!!.toDouble()
    
    println("Digite a nota da terceira avaliacao:")
    val nota3 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("$.2f", media)

    println("A media eh: $media")

}