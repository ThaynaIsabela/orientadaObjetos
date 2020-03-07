public class OlaMundoJava
{
   public static void main(String[] args){
       
       // variaveis vermelhas tipo primitivas (depende espaço em memória)
       // variaveis pretas tipo classes 
       
       //Float = Double
       double valorSalario1 = 1300.46;
       float valorSalario = 1300.45f; // valores decimais
       
       int numeroDependente = 5; // valores inteiros
       
       //String trabalha com texto
       String nomeCidade = "Bauru"; // valores string
       
       //char trabalha com um único caracter
       char letra = 'B'; // valores caracteres
       
       //boolean
       boolean temSaldo =  true; // true ou false
       
       System.out.println("Meu primeiro codigo Java na Fib");
       
       double valor1 = 10.20;
       double valor2 = 30.20;
       double soma = valor1 + valor2;
       System.out.println("A soma é " + soma);
       
       //if
       if(soma > 100){
          System.out.println("A soma é maior que 100"); 
       }else{
          System.out.println("A soma é menor que 100");
       }
       
       //for
       for(int i=0; i<10; i++){
          System.out.println(i);
       }
    }
}
