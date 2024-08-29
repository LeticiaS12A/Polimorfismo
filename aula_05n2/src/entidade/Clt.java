package entidade;

import entidade.enums.Cargo;

public class Clt extends Funcionario{

	private double convenio;
	
	public Clt(String nome, double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}
	

	@Override
	public double receber() {
		return salario * 0.90 - convenio;
	}
}
