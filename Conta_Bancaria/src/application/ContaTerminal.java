package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO Conhecer e importar a classe Scanner
		//TODO Exibir as mensagens para o nosso usuario
		//TODO Obter pela scanner os valores digitados no terminal
		//TODO Exibir a mensagem da conta criada
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;
	
	
		 System.out.println("Por favor, digite o número da Conta!");
		 numero = sc.nextInt();	 	 
		 
		 System.out.println("Por favor, digite o número da Agência !");
		 agencia = sc.next();
		 
		 System.out.println("Por favor, digite o seu nome !");
		 nomeCliente = sc.next();
		 
		 System.out.println("Por favor, digite o saldo desejado !");
		 saldo = sc.nextDouble();
		 
		 System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é = " + agencia + ", conta de numero " + numero + " e o seu saldo de "+ "R$" + saldo + 
				 " já esta disponível para saque");
		 
		 sc.close();

	}

}
