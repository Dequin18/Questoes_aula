package Q5;

public class Paciente {
	private String Nome;
	private String Email;
	private String Empresa;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setCodigo(String Numero) {
		this.Empresa = Numero;
	}
	public void setDataSaida (String Documento) {
		this.Email = Documento;
	}

	
	public String getCarga () {
		return this.Email;
	}
	public String getEmpresa() {
		return this.Empresa;
	}
	public String getNome () {
		return this.Nome;
	}	
}
