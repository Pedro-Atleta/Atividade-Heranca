public class CursoPosGraduacao extends Curso {

    private String tipo;          // lato sensu / stricto sensu
    private String areaPesquisa;

    public CursoPosGraduacao(String codigo, String nome, int chTotal, String tipoDuracao,String modalidade, boolean ativo,String tipo, String areaPesquisa) {
        super(codigo, nome, chTotal, tipoDuracao, modalidade, ativo);
        this.tipo = tipo;
        this.areaPesquisa = areaPesquisa;
    }

    @Override
    public void operacao() {
        System.out.println("Validando dissertação/tese na área: " + areaPesquisa);
    }
}
