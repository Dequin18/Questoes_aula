package Q2;

public class Hospede {

<<<<<<< HEAD
	
	public int getDocumento () {
		return this.Documento;
	}
	public String getNumero() {
		return this.Numero;
	}
	public String getNome () {
		return this.nome;
	}		
	public String toString() {
		return " Nome: " + nome + " -  Documento: " + Documento + " - Numero: " + Numero;
	}
	
	
	
}
=======
    private String Nome;
    private String Documento;
    private String Telefone;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setDocumento(String documento) {
        this.Documento = documento;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getDocumento() {
        return this.Documento;
    }

    public String getTelefone() {
        return this.Telefone;
    }
}
>>>>>>> 9af9fa518be4e022395beb29989b4ead0ccf672c
