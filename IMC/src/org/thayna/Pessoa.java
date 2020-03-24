package org.thayna;

public class Pessoa {
	private int peso;
	private double altura;
	
	
	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private double calculaIndice() {
		return this.peso / (this.altura * this.altura);
	}
	
	private void exibePessoa()
	{
		String dump = "A pessoa possuí " + String.format("%d", this.peso) +
				"kg e " + String.format("%.2f", this.altura) + " metros de altura";
		System.out.println(dump);
	}
	
	private void exibeSituacao()
	{
		double indice = this.calculaIndice();
		String classificacao = "não definido", risco = "não definido";
		System.out.println("Indice:" + String.format("%.2f", indice));
		if (indice < 18.5) {
			classificacao = "Defict de massa corporal";
			risco = "Baixo (com risco de outras doenças";
		} else if (indice >= 18.5 && indice < 24.9) {
			classificacao = "Massa coporal normal";
			risco = "Normal";
		} else if (indice >= 25.0 && indice < 29.9) {
			classificacao = "Sobrepeso";
			risco = "Elevado";
		} else if (indice >= 30.0 && indice < 34.9) {
			classificacao = "Obesidade leve";
			risco = "Alto";
		} else if (indice >= 35.0 && indice < 39.9) {
			classificacao = "Obesidade média";
			risco = "Muito alto";
		}  else {
			classificacao = "Obesidade mórbida";
			risco = "Iminente";
		}
		System.out.println("Classificação: " + classificacao);
		System.out.println("Risco: " + risco);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setAltura(1.72);
		pessoa1.setPeso(86);
		// pessoa1.exibePessoa();
		pessoa1.exibeSituacao();
		
		
	}

}
