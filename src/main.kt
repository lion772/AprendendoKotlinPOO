/* Nesse file iremos falar sobre o conceito de herança, onde classes diferentes
*  possuem funções semelhantes. Se quiser reutilizar o código de uma classe, a
*  classe Pai, em geral é sempre a classe mais genérica; E a outra classe, a
*  classe filha, deverá colocar ":" após os parenteses e escrever o nome da classe
*  Pai. Para finalizar a herança, deve chamar o atributo desta e tirar o "val" da
*  classe filha. O segundo passo é escrever "open" na classe Pai, que diz que uma
*  classe pode ser herdada. Se não quiser que não seja herdada, tire o código "open"
*   */

open class Machine (val marca: String){
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador (marca: String, val nucleos: Int) : Machine(marca){
    fun ligar(){}
    fun processar(){}
}

fun main() {

    val c: Computador = Computador("xpto", 2)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }
}