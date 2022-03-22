package entidades;

public class pessoa {
    public static String nome;
    public static String idade;
    public static String cpf;
    public static String apostador;

    public pessoa(int codigo, String nome, String cpf) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public static String getApostador() {
        return apostador;
    }

    public static void setApostador(String apostador) {
        pessoa.apostador = apostador;
    }

    public void PrintP(){
        System.out.println("Nome: "+this.getNome()+"\nIdade: "+this.getIdade()+ "\nCPF:" +this.getCpf());
    }
}
