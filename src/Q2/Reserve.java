package Q2;

<<<<<<< HEAD
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
	public void setDataSaida (String DataSaida) {
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
	public String toString() {
		return " Data entrada: " + DataEntrada + " -  Data saida: " + DataSaida + " - Status: " + Status;
	}
}
=======
public class Reserva {

    private String DataEntrada;
    private String DataSaida;
    private String Status;

    public void setDataEntrada(String entrada) {
        this.DataEntrada = entrada;
    }

    public void setDataSaida(String saida) {
        this.DataSaida = saida;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getDataEntrada() {
        return this.DataEntrada;
    }

    public String getDataSaida() {
        return this.DataSaida;
    }

    public String getStatus() {
        return this.Status;
    }
}
>>>>>>> 9af9fa518be4e022395beb29989b4ead0ccf672c
