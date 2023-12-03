import una7l.Disciplina;
import una7l.Estudante;
import una7l.Pessoa;
import una7l.Professor;

public class Main {
    public static void main(String[] args) {
        new Main();
    }


    public Main() {
        Estudante objEstudanteTipoEstudante = new Estudante("Gabriel",
                123_456_789_11L,
                "CC00123");
        Professor objProfessorTipoProfessor = new Professor("Miguel",
                123_456_789_11L,
                "Engenharia de Software");
        Pessoa objEstudanteTipoPessoa = new Estudante("Giovana",
                123_456_789_12L,
                "CC00124");
        Pessoa objProfessorTipoPessoa = new Professor("Leticia",
                123_456_789_13L,
                "Sistemas Distribuidos");

        Disciplina disciplina = new Disciplina("Programação de soluções computacionais", "CC001");



        System.out.println("objEstudanteTipoEstudante: " + objEstudanteTipoEstudante.quemSouEu());
        System.out.println("objProfessorTipoProfessor: " + objProfessorTipoProfessor.quemSouEu());
        System.out.println("objEstudanteTipoPessoa: " + objEstudanteTipoPessoa.quemSouEu());
        System.out.println("objProfessorTipoPessoa: " + objProfessorTipoPessoa.quemSouEu());

        System.out.println("\n\n");

        testeDePassagemDeSupertipo(objEstudanteTipoEstudante);
        testeDePassagemDeSupertipo(objEstudanteTipoPessoa);
        testeDePassagemDeSupertipo(objProfessorTipoProfessor);
        testeDePassagemDeSupertipo(objProfessorTipoPessoa);

        System.out.println("\n\n--------------\n\n");

        System.out.println(objEstudanteTipoEstudante.getDescricao());
        System.out.println(disciplina.getDescricao());

    }

    public void testeDePassagemDeSupertipo(Pessoa pessoa) {
        if(pessoa instanceof Estudante){
            System.out.println("Primeiro if");
            Estudante e = ((Estudante) pessoa);
            System.out.println(e.metodoEspecificoDoEstudante());
        } else if (pessoa instanceof Professor) {
            System.out.println("Segundo if");
            System.out.println(((Professor) pessoa).metodoEspecificoDoProfessor());
        } else {
            System.out.println("Tipo não identificado.");
        }
    }
}

