package Q1;

public class TestesEscola {
public static void alunos() {
	Alunos a1 = new Alunos();
	a1.setIdade(15);
	a1.setMatricula("3342");
	a1.setNome("Moises");
	System.out.println(a1);
	
}
public static void instrutor() {
	Instrutor i1 = new Instrutor();
	i1.setNome("Joao");
	i1.setEspecialidade("Professor");
	System.out.println(i1);
	
}
public static void Treino() {
	Treino T1 = new Treino();
	T1.setCodigo("43");
	T1.setDuracao(50);
	T1.setObjetivo("Engordar");
	System.out.println(T1);
}
	
	public static void main(String[] args) {
	alunos();
	
	instrutor();
	Treino();
	}

}
