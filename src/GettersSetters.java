public class GettersSetters {

    private String nome;
    private int idade;

    public GettersSetters(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args){
        Maquin maquina = new Maquin("hyundai");
        maquina.setMarca("Honda");
        maquina.getMarca();
    }
}
