// Crie um programa que verifica se o usuario tem aceso ao sistema

fun main(){

    println("Digite seu nome de usuario:")
    val nomeUsuario = readLine()

    if(nomeUsuario.isNullOrBlank()){
        println("O campo nao pode ser nulo")
        return 
    }

    println("Digite sua senha:")
    val senhaUsuario = readLine()

    if(senhaUsuario.isNullOrBlank()){
        println("O campo nao pode ser nulo")
        return
    }
    val usuario = "vinny"
    val senha = "123456"

    if (nomeUsuario == usuario && senhaUsuario == senha ){
        println("Acesso permitido")
    }else{
        println("Acesso negado")
    }
}