import java.time.LocalDate;

import brComDioDesafioDominio.BootCamp;
import brComDioDesafioDominio.Curso;
import brComDioDesafioDominio.Dev;
import brComDioDesafioDominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
	
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso python");
		curso1.setDescricao("Descrição curso python");
		curso1.setCargaHoraria(9);
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição mentora java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		BootCamp bootcamp =new BootCamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.InscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos " + devLucas.getConteudoInscrito());
		System.out.println();
		devLucas.progredir();
		System.out.println("Conteudos inscritos " + devLucas.getConteudoInscrito());
		System.out.println("Conteudos concluidos" + devLucas.getConteudoConcluido());
		System.out.println("XP = " + devLucas.calcularTotalXp());
		
		
		Dev devRayane = new Dev();
		devRayane.setNome("Rayane");
		devRayane.InscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos " + devRayane.getConteudoInscrito());
		System.out.println();
		devRayane.progredir();
		devRayane.progredir();
		System.out.println("Conteudos inscritos " + devRayane.getConteudoInscrito());
		System.out.println("Cnteudos concluidos " + devRayane.getConteudoConcluido() );
		System.out.println("XP = " + devRayane.calcularTotalXp());
		
		
		Dev devPollyana = new Dev();
		devPollyana.setNome("Pollyana");
		devPollyana.InscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos " + devPollyana.getConteudoInscrito());
		System.out.println();
		devPollyana.progredir();
		devPollyana.progredir();
		System.out.println("Conteudos inscritos " + devPollyana.getConteudoInscrito());
		System.out.println("Cnteudos concluidos " + devPollyana.getConteudoConcluido() );
		System.out.println("XP = " + devPollyana.calcularTotalXp());

	
	
	}
}
