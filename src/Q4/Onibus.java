package Q4;

public class Onibus {
<<<<<<< HEAD
	private String Placa;
	private String Modelo;
	private int Capacidade;
		
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	public void setCapacidade(int capa) {
		this.Capacidade = capa;
	}
	public void setModelo (int modelo>) {
		this.Modelo = modelo;
	}

	
	public String getModelo () {
		return this.Modelo;
	}
	public int getCapacidade() {
		return this.Capacidade;
	}
	public String getPlaca () {
		return this.Placa;
	}		
}
=======

    private String Placa;
    private String Modelo;
    private int Capacidade;

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setCapacidade(int numero) {
        if (numero >= 10) {
            this.Capacidade = numero;
        }
    }

    public String getPlaca() {
        return this.Placa;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public int getCapacidade() {
        return this.Capacidade;
    }
}
>>>>>>> 03a976940040a663e30fcd7f0793a1d40ad06de0
