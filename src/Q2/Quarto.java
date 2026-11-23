package Q2;

public class Quarto {

<<<<<<< HEAD
	
	public int getValorDiaria () {
		return this.ValorDiaria;
	}
	public int getNumero() {
		return this.Numero;
	}
	public String getTipo () {
		return this.Tipo;
	}		
	
	public String toString() {
		return " Tipo do quarto: " + Tipo + " -  numero: " + Numero + " - Valor da diaria: " + ValorDiaria;
	}
}
=======
    private int Numero;
    private String Tipo;
    private double ValorDiaria;

    public void setNumero(int numero) {
        this.Numero = numero;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public void setValorDiaria(double valor) {
        if (valor > 0) {
            this.ValorDiaria = valor;
        }
    }

    public int getNumero() {
        return this.Numero;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public double getValorDiaria() {
        return this.ValorDiaria;
    }
}
>>>>>>> 9af9fa518be4e022395beb29989b4ead0ccf672c
