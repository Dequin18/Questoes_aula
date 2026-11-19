package Q1;

public class Alunos {
	private String nome;
	private String Matricula;
	private int idade;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}
	public void setIdade (int idade) {
		if(idade > 0) {
			this.idade= idade;
		} else {
			this.idade = 0;
		}
	}

	
	public int getIdade () {
		return this.idade;
	}
	public String getMatricula() {
		return this.Matricula;
	}
	public String getNome () {
		return this.nome;
	}		
}
