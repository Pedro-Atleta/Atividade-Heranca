import java.util.ArrayList;
import java.util.List;

public abstract class Curso {

    protected String codigo;
    protected String nome;
    protected int chTotal;
    protected String tipoDuracao;// trimestral, semestral ou anual
    protected String modalidade;// presencial ou EAD
    protected boolean ativo;

    protected List<String> disciplinas = new ArrayList<>();
    protected List<String> alunosAtivos = new ArrayList<>();
    protected List<String> alunosEgressos = new ArrayList<>();

    public Curso(String codigo, String nome, int chTotal, String tipoDuracao,
                 String modalidade, boolean ativo) {

        this.codigo = codigo;
        this.nome = nome;
        this.chTotal = chTotal;
        this.tipoDuracao = tipoDuracao;
        this.modalidade = modalidade;
        this.ativo = ativo;
    }

    public List<String> obterDisciplinas() {
        return disciplinas;
    }

    public List<String> obterAlunosAtivos() {
        return alunosAtivos;
    }

    public List<String> obterAlunosEgressos() {
        return alunosEgressos;
    }

    public abstract void operacao();

    @Override
    public String toString() {
        return nome + " | Código: " + codigo + " | CH: " + chTotal;
    }
}
