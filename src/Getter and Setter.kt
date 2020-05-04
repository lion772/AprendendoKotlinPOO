/* Os getters and setters impedem que uma variável seja acessada diretamente, muito
    * falado em encapsulamento. Seria a mesma coisa se existisse uma classe Saldo ou
    * conta corrente onde vc pudesse alterar seu saldo para 1 milhão. A melhor forma de
    * acessar a variável seria através do método Setter, podendo atribuir valor a ela e
    * verificando se pode ou não fazer tal atribuição;  */

    /* Kotlin permite que você acessa a variável direto sem precisar escrever o comando
    * "pessoa.getNome()", podendo escrever "pessoa.nome", pois ele sabe quais são estes
    * comandos, e os getters e setters funcionam por trás dos panos. O método setNome
    * funciona da mesma forma, basta escrever o objeto e o nome da variável a ser setada
    * "pessoa.nome = "william"" */

class Maquina(var marca: String)
//Não é preciso colocar os getters and setters, o kotlin já sabe, então assim que instanciar qualquer classe, já pode usar o objeto.get/set + nome da variável

fun main() {

    var gettersSetters: GettersSetters = GettersSetters("william", 25)
    println(gettersSetters.idade)
}