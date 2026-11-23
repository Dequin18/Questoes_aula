package Q1;

public class Instrutor {
	private String nome;
	private String especialidade;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecializacao() {
		return this.especialidade;
	}
	public String getNome () {
		return this.nome;
	}		
	@Override
	public String toString() {
		return " Nome do instrutor: " + nome + " -  especialidade: " + especialidade;
	}
}
