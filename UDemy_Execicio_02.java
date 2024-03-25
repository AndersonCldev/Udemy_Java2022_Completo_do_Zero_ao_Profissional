import java.util.Scanner;
/// Crie um programa que receba o slario de um funcionario e remova 10% de fgts
public class UDemy_Execicio_02 {

	public static void main(String[] args) {
		
		double salario, fgts, salarioFinal, desconto;
		String confirmar;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva seu salario: ");
		salario = ler.nextDouble();
		System.out.println("Confirme salario: R$"+ salario);
		System.out.println("Seu salario esta correto ? (Digite Sim ou Não)  ");
		confirmar = ler.next();
		if(confirmar.equalsIgnoreCase("sim")){
			System.out.println("Ok...");
			
		} else if (confirmar.equalsIgnoreCase("não")) {
			System.out.println("Escreva seu salario: ");
			salario = ler.nextDouble();
		} else {
			System.err.println("Reinicie o Código...");
		}
		
		fgts = 10 ;
		desconto = salario * fgts / 100 ;
		salarioFinal = salario - desconto;
		
		 System.out.println("Seu salrio com desconto de FGTS fica: R$" + salarioFinal);
		
	}

}
