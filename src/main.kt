/* Nesse file iremos falar sobre o conceito de herança, onde classes diferentes
*  possuem funções semelhantes. Se quiser reutilizar o código de uma classe, a
*  classe Pai, em geral é sempre a classe mais genérica; E a outra classe, a
*  classe filha, deverá colocar ":" após os parenteses e escrever o nome da classe
*  Pai. Para finalizar a herança, deve chamar o atributo desta e tirar o "val" da
*  classe filha. O segundo passo é escrever "open" na classe Pai, que diz que uma
*  classe pode ser herdada. Se não quiser que não seja herdada, tire o código "open"
*   */

open class Machine (val marca: String){
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador (marca: String, val nucleos: Int) : Machine(marca){
    override fun minhaMarca() {
        val id = 10 //override serve para caso vc queira adicionar uma nova informação na função que vc está sobrescrevendo
        super.minhaMarca() //super se refere à classe Pai e à função da mesma
    }

    fun ligar(){}
    fun processar(){}

    /* Sobrecarca - São métodos com mesmo nome, só que com tipos e/ou quantidade de
     parâmetros diferentes. */
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: Int, s: String) = println("Overload 2")
    fun overload(i: String) = println("Overload 3")
}

fun main() {

    val c: Computador = Computador("xpto", 2)
    with(c){
        ligar()
        processar()
        minhaMarca()
        overload("") //Dependendo dos parâmetros que colocar, chamará uma função diferente
    }
}