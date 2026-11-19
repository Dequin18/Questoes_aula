package Q10;

public class Tarefa {
	private String Descricao;
	private String Prioridade;
	private String situacao;
		
	public void setDescricao(String nome) {
		this.Descricao = nome;
	}
	public void setSituacao(String Numero) {
		this.situacao = Numero;
	}
	public void setPrioridade (String Documento) {
		this.Prioridade = Documento;
	}

	
	public String getPrioridade () {
		return this.Prioridade;
	}
	public String getSituacao() {
		return this.situacao;
	}
	public String getDescricao () {
		return this.Descricao;
	}	
}
