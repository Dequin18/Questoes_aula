package Q5;

public class TesteAuditorio {

	public static void Palestra() {
		Palestra p1 = new Palestra();
		p1.setTema();
		p1.setDuracao();
		p1.setSala();
		System.out.println(p1);
		
	}
	public static void Palestrante() {
		Palestrante p1 = new Palestrante();
		p1.setNome();
		p1.setAreaAtuacao();
		p1.setTitulacao();
		System.out.println(p1);
		
	}
	public static void Participante() {
		Participante p1 = new Participante();
		p1.setNome();
		p1.setEmail();
		p1.setEmpresa();
		System.out.println(p1);
	}
		
		public static void main(String[] args) {
		Palestra();
		
		Palestrante();
		Participante();
		}

	}
