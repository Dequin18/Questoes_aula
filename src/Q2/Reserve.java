package Q2;

public class Reserve {
	private String DataEntrada;
	private String DataSaida;
	private String Status;
		
	public void setDataEntrada(String nome) {
		this.DataEntrada = nome;
	}
	public void setStatus(String Numero) {
		this.Status = Numero;
	}
	public void setDataSaida (int Documento) {
		this.DataSaida = DataSaida;
	}

	
	public String getCarga () {
		return this.DataSaida;
	}
	public String getStatus() {
		return this.Status;
	}
	public String getDataEntrada () {
		return this.DataEntrada;
	}		
	
}
