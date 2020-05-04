enum class Prioridade1 {
    /* A classe Enum nos permite enumerar, listar possibilidades que a gente pode
    * ter de valores */

    BAIXA, MEDIA, ALTA
}
//Override
enum class Prioridade2(var id: Int){
    BAIXA(1){
        override fun toString(): String {
            return "super baixa, não se preocupe"
        }
    },
    MEDIA(5), ALTA(10)
}

class Alarme(var des:String, p:Prioridade2)

fun main() {

    //println(Prioridade1.BAIXA)
    for(p in Prioridade2.values()) {

        if (p.toString() == "MEDIA") println("Essa é verdade")

        println("$p - ${p.id} - ${p.ordinal}")
    }
    Alarme("Aviso!", Prioridade2.ALTA)



}