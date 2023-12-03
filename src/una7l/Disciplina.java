package una7l;

import una7l.interfaces.IDescritivel;

public class Disciplina implements IDescritivel {
    private String nome;
    private  String codigo;
    private String descricao;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;

        descricao = "Disciplina " + nome + " código " + codigo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
