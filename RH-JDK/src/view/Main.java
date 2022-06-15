package view;

import java.util.Scanner;

import model.rh;

public class Main {
	public static void main(String[] args) 
	{	
		Scanner leitor = new Scanner(System.in);
		int escolha;
	    rh rh = new rh();
		Menu m = new Menu();
		
		do
		{
			System.out.println("1 - Cadastrar um novo funcion�rio");
			System.out.println("2 - Pesquisar por um funcion�rio e retornar os seus dados");
			System.out.println("3 - Mostrar todos os funcion�rio cadastrados com os seus dados");
			System.out.println("4 - Sair");
			escolha = leitor.nextInt();
			
			switch (escolha)
			{
				case 1:
				{
					System.out.println("1 - Docente");
					System.out.println("2 - T�cnico");
					System.out.println("3 - Terceiro");
					
					int escolhaCadastro = leitor.nextInt();
					if (escolhaCadastro == 1)
					{
						rh.adicionaFuncionarios(m.dadosDocente());
					}
					
					else if (escolhaCadastro == 2)
					{
						rh.adicionaFuncionarios(m.dadosTecnico());
					}
					
					else if (escolhaCadastro == 3)
					{
						rh.adicionaFuncionarios(m.dadosTerceirizado());
					}
					break;
				}
				
				case 2:
				{
					System.out.println("Digite o funcion�rio que voc� deseja buscar:");
					String nome = leitor.next();
					System.out.println(rh.pesquisaFuncionario(nome));
					break;
				}
				
				case 3:
				{
					System.out.println();
					System.out.println(rh.getFuncionarios());
					break;
				}
			}
		} while(escolha != 4);
	}
}