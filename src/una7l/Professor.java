package una7l;

import una7l.interfaces.IDescritivel;

public class Professor extends Pessoa implements IDescritivel {

    private final String descricao;
    private String especialidade;

    public Professor(String nome,
                     long cpf,
                     String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;

        descricao = "Professor "  + nome +  " Especialidade " + especialidade;
    }

    @Override
    public String quemSouEu() {
        return "Professor";
    }

    public String metodoEspecificoDoProfessor() {
        return "Retorno do método específico do PROFESSOR";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
