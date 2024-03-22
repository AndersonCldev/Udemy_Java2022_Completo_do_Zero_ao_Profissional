// Nesta atividade foi solcitado criar um programa que lese idade, data de nascimento, nome e sobrenome do usuario e depois mostrase em tela.

import java.util.Scanner;

public class Udemy_Exercicio_01 {

	public static void main(String[] args) {
		
		int idade, mesNascimento, anoNacimento = 0;
		
		String nome, sobrenome;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("A seguir escreva sua idade atual: ");
		idade = ler.nextInt();
		System.out.print("A seguir escreva seu mês de nascimento: ");
		mesNascimento  = ler.nextInt();
		
		
		System.out.print("A seguir escreva seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("A seguir escreva seu sobrenome: ");
		sobrenome = ler.nextLine();
		
		anoNacimento =   2024 - anoNacimento;
		
		System.out.println("Confira seus dados!" );
		System.out.println("Nome: " + nome +" "+ sobrenome );
		System.out.println("Idade: " + idade +"/" + mesNascimento + "/" + anoNacimento);
		
	}

}
