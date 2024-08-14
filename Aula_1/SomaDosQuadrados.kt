fun SomaDosQuadrados(a: Int, b: Int): Int {
    val quadradoA = a * a
    val quadradoB = b * b
    val soma = quadradoA + quadradoB
    return soma
}

fun main() {
    val resultado = SomaDosQuadrados(2, 3)
    println("A soma dos quadrados eh: $resultado")
}
