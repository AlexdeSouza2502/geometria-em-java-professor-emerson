package view;

import model.Usuario;
import model.Aluno;
import model.Professor;

public class Main {
	public static void main (String args[]) {
		Usuario usuario1 = new Usuario("050.123.546-80");
		usuario1.setNome("Alex");
		
		System.out.println(usuario1.dadosFormatados());
		
		Aluno aluno1 = new Aluno("123.123.456-78", "3211234580");
		aluno1.setNome("Ana");
		aluno1.setCurso("Sistemas");
		
		
		System.out.println(aluno1.dadosFormatados());
		
		Professor professor1 = new Professor ("202021", "3245");
		professor1.setNome("Emerson");
		professor1.setArea("Linguagem e tecnicas de programação II");
		
		System.out.println(professor1.dadosFormatados());
		
		
	}

}
