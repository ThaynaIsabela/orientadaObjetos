/**
 * 
 */
package org.thayna;

/**
 * @author thayna
 *
 */
public class Documentos {
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	private boolean checaSeContem(String[] arr, String valor) {
		boolean encontrou = false;
		for (String noArray: arr) {
			encontrou = encontrou || noArray.equals(valor);
//			System.out.println("Comparando: "+ noArray + 
//					" - " + valor + " - Resposta:" +
//					(encontrou ? "Sim" : "Não")
//			);
		}
		return encontrou;
	}
	
	private int cpfSequencia(String parteCpf)
	{
		int acumulador = 0;
		for (int x = 0; x < parteCpf.length(); x++) {
			String pedaco = parteCpf.substring(x, x+1);
//			System.out.println("Pedaco: "+ pedaco + 
//					" - Multiplicador: " +
//					String.format("%d", parteCpf.length()+1-x)
//				);
			int numero = Integer.parseInt(pedaco);
			acumulador = acumulador + (numero * ((parteCpf.length()+1)-x));
		}
		int resultado = (int)((acumulador * 10.0) % 11.0);
//		System.out.println(
//				"Acumulador: " + String.format("%d", acumulador) + " - " +
//				"Resultado: "+ String.format("%d", resultado));
		return resultado == 10 ? 0 : resultado;
	}

	// Baseado no site: https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
	public void setCpf(String cpf) throws Exception {
		String cpfsInvalidos[] = {
				"11111111111",
				"22222222222",
				"33333333333",
				"44444444444",
				"55555555555",
				"66666666666",
				"77777777777",
				"88888888888",
				"99999999999",
				"00000000000"
		};
		String limpaCpf = cpf.replaceAll("\\.", "")
				.replaceAll("\\ ", "")
				.replaceAll("-", "");
//		System.out.println("CPF Limpo: " + limpaCpf);
		if (limpaCpf.length() != 11) throw new Exception("Tamanho inválido");
		if (this.checaSeContem(cpfsInvalidos, limpaCpf))
			throw new Exception("CPFs já conhecidos como inválidos!");
		int primeiroDigito = this.cpfSequencia(limpaCpf.substring(0, 9));
		int segundoDigito = this.cpfSequencia(limpaCpf.substring(0, 10));
//		System.out.println("Digitos:" + 
//				String.format("%d", primeiroDigito*10+segundoDigito));
		if (!limpaCpf.substring(9, 11).equals(
				String.format("%d", primeiroDigito*10+segundoDigito)))
			throw new Exception("O CPF informado não é valido. Está incorreto.");
		this.cpf = cpf;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documentos documentosPessoa1 = new Documentos();
		try {
//			documentosPessoa1.setCpf("111.111.111-11");
//			documentosPessoa1.setCpf("275.204.488-94");
			documentosPessoa1.setCpf("475.204.488-94");
			System.out.println("O CPF informado é valido!");
		} catch (Exception ex) {
			System.out.println("Erro no CPF: " + ex.getMessage());
		}
		
	}

}
