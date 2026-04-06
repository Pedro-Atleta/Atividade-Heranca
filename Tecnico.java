public class CursoTecnico extends Curso {

    private String eixoTecnologico;
    private int chEstagio;

    public CursoTecnico(String codigo, String nome, int chTotal, String tipoDuracao,
                        String modalidade, boolean ativo,
                        String eixoTecnologico, int chEstagio) {

        super(codigo, nome, chTotal, tipoDuracao, modalidade, ativo);
        this.eixoTecnologico = eixoTecnologico;
        this.chEstagio = chEstagio;
    }

    @Override
    public void operacao() {
        System.out.println("Estágio obrigatório? " + (chEstagio > 0));
    }
}
