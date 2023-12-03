package una7l;

public abstract class Pessoa {
    private String nome;
    private long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract String quemSouEu();
}
