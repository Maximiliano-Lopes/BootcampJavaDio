import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("É um curso de Java.");
		curso1.setCargaHoraria(240);
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("É um curso de JS.");
		curso2.setCargaHoraria(260);
		Curso curso3 = new Curso();
		curso3.setTitulo("Curso Node");
		curso3.setDescricao("É um curso de Node.");
		curso3.setCargaHoraria(300);
		
		
		
		
		Mentoria mentoria1 = new Mentoria();
		
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Mentoria para JAVA");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(mentoria1);*/ 
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer ");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Incritos:" + devCamila.getConteudosInscritos());
		devCamila.progredir();		
		System.out.println("Conteudos Incritos:" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluídos:" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());
		
		
		
		Dev devMaximiliano = new Dev();
		devMaximiliano.setNome("Maximiliano");
		devMaximiliano.inscreverBootcamp(bootcamp);
		devMaximiliano.progredir();
		devMaximiliano.progredir();
		devMaximiliano.progredir();
		System.out.println("Conteudos Incritos:" + devMaximiliano.getConteudosInscritos());
		System.out.println("Conteudos Concluídos:" + devMaximiliano.getConteudosConcluidos());
		System.out.println("XP:" + devMaximiliano.calcularTotalXp());
	
	
	}

}
