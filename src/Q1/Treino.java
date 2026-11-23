package Q1;

public class Treino {

    private String Codigo;
    private String Objetivo;
    private int Duracao;

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public void setObjetivo(String objetivo) {
        this.Objetivo = objetivo;
    }

    public void setDuracao(int duracao) {
        if (duracao >= 0) {
            this.Duracao = duracao;
        }
    }

    public String getCodigo() {
        return this.Codigo;
    }

    public String getObjetivo() {
        return this.Objetivo;
    }

    public int getDuracao() {
        return this.Duracao;
    }
}