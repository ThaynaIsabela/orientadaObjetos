package com.thayna;

public class Calculadora {

	public double calculaSalarioBruto(int horasTrabalhadas, float valorHora, int numDependentes) {
		// horasTrabalhadas * valorHora + (50 * numDependentes)
		double resultado = horasTrabalhadas * valorHora + (50*numDependentes);
		System.out.print("Valor Salário Bruto: ");
		System.out.println(resultado);
		return resultado;
	}
	
	public double calculaDescontoINSS(double valorBruto) {
		// Se valorBruto <= 1000, INSS = valorBruto * 8.5/100
		// Se valorBruto > 1000, INSS = valorBruto * 9/100
		double resultado = 0;
		if (valorBruto <= 1000) {
			resultado = (valorBruto * 8.5/100);
		} else {
			resultado = valorBruto * 9/100;
		}
		System.out.print("Desconto do INSS: ");
		System.out.println(resultado);
		return resultado;	
	}
	
	public double calculaDescontoImpostoRenda(double valorBruto) {
		// Se valorBruto <= 500, IR = 0
		// Se valorBruto > 500 e <= 1000, IR = valorBruto * 5/100
		// Se valorBruto > 1000, IR = valorBruto * 7/100
		double resultado = 0;
		if (valorBruto <= 500) {
			resultado = 0;
		}
		else if (valorBruto > 500 && valorBruto <=1000) {
			resultado = valorBruto * 5/100;
		}
		else {
			resultado = valorBruto * 7/100;
		}
		System.out.print("Desconto Imposto Renda: ");
		System.out.println(resultado);
		return resultado;
	}
	
	public double calculaSalarioLiquido(int horasTrabalhadas, float valorHora, int numDependentes) {
		double valorBruto = this.calculaSalarioBruto(horasTrabalhadas, valorHora, numDependentes);
		double descontoINSS = this.calculaDescontoINSS(valorBruto);
		double descontoImpostoRenda = this.calculaDescontoImpostoRenda(valorBruto);
		double salarioLiquido = valorBruto - descontoINSS - descontoImpostoRenda;
		System.out.print("Salario líquido: ");
		System.out.println(salarioLiquido);
		return salarioLiquido;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		calculadora.calculaSalarioLiquido(176, 50, 2);
	}

}
