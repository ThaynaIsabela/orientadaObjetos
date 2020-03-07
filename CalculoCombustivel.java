public class CalculoCombustivel
{
   public static void main(String[] args){       
       double alcool = 2.20;
       double gasolina = 3.20;
       double valorGasolina = gasolina * 0.7 ;
       
       //if
       if(valorGasolina < alcool){
          System.out.println("Melhor usar gasolina"); 
       }else{
          System.out.println("Melhor usar alcool");
       }
    }
}