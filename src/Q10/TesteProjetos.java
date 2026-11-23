package Q10;

public class TesteProjetos {


	public static void Colaborador() {
		Colaborador C1 = new Colaborador();
		C1.setCargo("Administrativo");
		C1.setEmail("Calorsesak@gmail.com");
		C1.setNome("Carlos");
		System.out.println(C1);
	}
	public static void Projeto() {
		Projeto P1 = new Projeto();
		P1.setNome("Reformulacao");
		P1.setPrazo("24/10/2027");
		P1.setStatus("Andamento");
		System.out.println(P1);
		
	}
	public static void Tarefa() {
	Tarefa T1 = new Tarefa();
	T1.setSituacao("Atrasada");
	T1.setDescricao("Avaliar finanças");
	T1.setPrioridade("Media");
  System.out.println(T1);
	}
		
		public static void main(String[] args) {
		Colaborador();
		Projeto();
		Tarefa();
		}

	}