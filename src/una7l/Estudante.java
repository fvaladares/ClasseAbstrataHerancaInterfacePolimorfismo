package una7l;

import una7l.interfaces.IDescritivel;

public class Estudante extends Pessoa implements IDescritivel {
    private String ra;
    private String descricao;
    public Estudante(String nome,
                     long cpf,
                     String ra) {
        super(nome, cpf);
        this.ra = ra;
        descricao = "Estudante " + nome + " RA " + ra;
    }

    @Override
    public String quemSouEu() {
        return "Estudante";
    }

    public String metodoEspecificoDoEstudante() {
        return "Retorno do método específico do ESTUDANTE";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
