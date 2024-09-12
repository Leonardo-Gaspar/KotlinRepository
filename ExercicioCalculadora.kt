fun main(){

    println("Digite o primeiro numero:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Escolha uma operacao(+, -, *, /):")
    val operacao = readLine()

    println("Digite o segundo numero:")
    val num2 = readLine()?.toDoubleOrNull()
    if (operacao == null) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    if (num1 == null) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    if (num2 == null) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    val soma = num1 + num2
    val subtracao = num1 - num2
    val multiplicacao = num1 * num2
    val divisao = num1 / num2

    val resultado = when(operacao){
        "+" -> soma
        "-" -> subtracao
        "*" -> multiplicacao
        "/" ->{
            if(num2 != 0.0) {
                divisao
            }else{
                println("Não é possivel dividir numero por 0")
                return
            }
        }
        else -> "Operador invalido"
    }   
    println("Resultado da operacao: $resultado")
}

