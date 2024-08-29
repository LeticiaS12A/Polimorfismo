package principal;

import java.util.Scanner;

import entidade.Clt;
import entidade.Funcionario;
import entidade.Pj;
import entidade.enums.Cargo;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-- Funcionario PJ --");
		
		System.out.println("/nDigite o nome: ");
		String nome = s.next();
		System.out.print("Digite o salario: ");
		double salario = s.nextDouble();
		System.out.print("Digite o valor do adicional: ");
		double adicional = s.nextDouble();
		
		Funcionario x = new Pj(nome, salario, Cargo.CONTADOR, adicional);
		
		System.out.println("\nNome: " + x.getNome());
		System.out.println("Salario: " + x.getSalario());
		System.out.println("Cargo: " + x.getCargo());
		System.out.println("Valor para receber: " + x.receber());
		
		System.out.println("\n-- Funcionario CLT --");
		
		System.out.print("\nDigite o nome: ");
		String nome1 = s.next();
		System.out.print("Digite o salario: ");
		double salario1 = s.nextDouble();
		System.out.print("Digite o valor do convenio: ");
		double convenio = s.nextDouble();
		
		Funcionario y = new Clt(nome1, salario1, Cargo.PROFESSOR, convenio);
		
		System.out.println("\n\nNome: " + y.getNome());
		System.out.println("Salario: " + y.getSalario());
		System.out.println("Cargo: " + y.getCargo());
		System.out.println("Valor para receber: " + y.receber());

		
	}

}
