import java.util.* // Importa o scanner

fun main(){
    val scanner = Scanner(System.`in`) // COlocando o Scanner na funcao
    var sair: Char

    do{        //Criando loop para o codigo
        coletarDados()
        println("Tecle [c] para continuar ou [s] para sair:")
        sair = scanner.next()[0]
    }while (sair != 's')
}

fun coletarDados(){
    val scanner = Scanner(System.`in`)
    var peso : Float
    var altura : Float
    var alturaScanner : Float

    println("Digite o seu peso:")   //coletando os dados do usuario
    peso = scanner.nextFloat()
    scanner.nextLine()  // consome a nova linha pendente
    println("Digite a sua altura em cm:")
    alturaScanner = scanner.nextFloat()

    altura = (alturaScanner / 100) // Igualando as grandezas

    val imc = calcularIMC(peso, altura)
    println("Seu IMC é: %2f |".format(imc)) //Format para imprimir na tela

    when{   //divindo os IMCs
        imc < 18.5 -> println("Excesso de Magreza")
        imc < 25 -> println("Peso Normal")
        imc < 30 -> println("Excesso de Peso")
        imc < 35 -> println("Obesidade Grau I")
        imc < 40 -> println("Obesidade Grau II")
        else -> println("Obesidade Grau III")
    }

}

fun calcularIMC(peso:Float, altura:Float):Float{
    val resultado = peso / (altura*altura) //Calculando o IMC
    return resultado    //Retornando o IMC

}

