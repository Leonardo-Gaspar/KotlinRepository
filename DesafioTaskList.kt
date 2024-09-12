data class Task(val id: Int, var title: String, var description: String, var completed: Boolean = false)

class TaskManager{
    private val tasks = mutableListOf<Task>()
    private var taskIdCounter = 1

    fun addTask(title: String, description: String){
        val task = Task(taskIdCounter, title, description)
        task.add(tasks)
        taskIdCounter++
        println("Task adicionado: $(tasktitle)")
    }

    fun listTask(){
        if(tasks.isEmpty()){
            println("Nao ha tarefas cadastradas")
        }else{
            println("Lista de Tarefas:")
            for((index, task) in task.index()){
                println("$(index + 1). [$(if(task.completed) "x" else " "]) $(task.title)")
            }
            println()
        }
    }

    fun markTaskCompleted(taskIndex: Int){
        if(taskIndex >= 0 && taskIndex < tasks.size){
            val task = tasks[taskIndex]
            task.completed = true
            println("Tarefa '$(task.title)' marcada como concluida.")
        }else{
            println("Indice de tarefa invalida")
        }
    }

    fun removeTask(taskIndex: Int){
        if(taskIndex >= 0 && taskIndex < tasks.size){
        val removedTask = tasks.removeAt(taskIndex)
        println("Tarefa '$(removedTask.title)' removida")
        }else{
            println("A tarefa é invalida")
        }
    }


fun main(){
    val taskManager = TaskManager()

    println("Bem-vindo ao gerenciador de Tasks")

    var option : Int
    do{
        println("\nOpcoes do menu")
        println("1. Adicionar Task")
        println("2. Listas Tasks")
        println("3. Marcar Task como concluida")
        println("4. Remover Task")
        println("5. Sair")

        print("Escolha uma opcao: ")
        option = readLine()?.toIntOrNull() ?:0

        when(option){
            1 -> {
                print("Digite o titulo da task: ")
                val title = readLine() ?: ""
                print("Digite a descricao da task: ")
                val description = readLine() ?: ""
                taskManager.addTask(title, description)
            }
            2 -> taskManager.listTask()
            3 -> {
                println("Digite o numero da tarefa que deseja marcar como concluida: ")
                val taskIndex = readLine()?.toIntOrNull() ?:-1
                taskManager.markTaskCompleted(taskIndex - 1)
            }
            4 -> {
                print("Digite o numero da tarefa que deseja remover: ")
                val taskIndex = readLine()?.toIntOrNull() ?:0
                taskManager.removeTask(taskIndex)
            }
            5 -> 
                println("Obrigado por utilizar meu codigo")
            else -> println("Voce escolheu sair!")

        }
    }while(option != 5)
        println("Entrada invalida")
}
}