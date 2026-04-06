public class CursoGraduacao extends Curso {

    private String tipo;   // bacharelado, licenciatura, tecnológico
    private boolean tccObrigatorio;

    public CursoGraduacao(String codigo, String nome, int chTotal, String tipoDuracaoString modalidade, boolean ativo, String tipo, boolean tccObrigatorio) {
        super(codigo, nome, chTotal, tipoDuracao, modalidade, ativo);
        this.tipo = tipo;
        this.tccObrigatorio = tccObrigatorio;
    }

    @Override
    public void operacao() {
        System.out.println("Validando TCC. Obrigatório? " + tccObrigatorio);
    }
}
