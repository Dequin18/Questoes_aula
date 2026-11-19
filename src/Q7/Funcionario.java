package Q7;

public class Funcionario {
	private String Nome;
	private String Matricula;
	private double Salario;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setSalario(double Numero) {
		this.Salario = Numero;
	}
	public void setMatricula (String Documento) {
		this.Matricula = Documento;
	}

	
	public String getCarga () {
		return this.Matricula;
	}
	public double getSalario() {
		return this.Salario;
	}
	public String getNome () {
		return this.Nome;
	}	
}