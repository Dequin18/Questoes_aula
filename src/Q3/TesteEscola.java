package Q3;

public class TesteEscola {

		public static void Disciplina() {
			Hospede d1 = new Hospede();
			d1.setNome("João);
			d1.setCodigo("33425599");
			d1.setCargaHoraria("71 9 97885677");
			System.out.println(h1);
			
		}
		public static void Professor() {
			Quarto p1 = new Quarto();
			p1.setNumero(33);
			p1.setTipo("Deluxe");
			p1.setVAlorDiaria(55.69);
			System.out.println(q1);
			
		}
		public static void Turma() {
			Reserve t1 = new Reserve();
			t1.setDataEntrada("06/07/2022");
			t1.setDataSaida("08/07/2022");
			t1.setStatus("encerrado");
			System.out.println(r1);
		}
			
			public static void main(String[] args) {
			Hospede();
			
			Quarto();
			Reserve();
			}

		}