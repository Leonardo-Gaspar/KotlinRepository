import kotlin.random.Random

fun realizarSorteioMegaSena(){

    println("Bem vindo a Simulacao da Mega Sena!")
    var numerosSorteados = mutableListOf<Int>()

    while (numerosSorteados.size < 6){
        val numero = Random.nextInt(1,61)
        numerosSorteados.add(numero)
    }

    val resultado = numerosSorteados.sorted()
    println("Numeros Sorteados: $resultado")
}
fun main(){
    realizarSorteioMegaSena();

}