package Q1;

public class Treino {
	private int codigo;
	private String Objetivo;
	private int duracao;
		
	public void setCod(int Cod) {
		this.codigo = Cod;
	}
	public void setObjetivo(String Objetivo) {
		this.Objetivo = Objetivo;
	}
	public void setDuracao (int duracao) {
		if(duracao > 0) {
			this.duracao = duracao;
		} else {
			this.duracao = 0;
		}
		
	}


	public int getCod () {
		return this.codigo;
	}
	public String getObjetivo() {
		return this.Objetivo;
	}
	public int getDuracao () {
		return this.duracao;
		}		
}
