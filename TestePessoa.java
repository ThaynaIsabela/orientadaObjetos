public class TestePessoa
{
    public static void main(String[] args){
        
        //int x = 10;
        //System.out.println(x);
        
        //Pessoa p = new Pessoa();
        //System.out.println(p);
        
        //Pessoa p2 = null;
        //System.out.println(p2);
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Thayna";
        p1.idade = 18;
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Henrique";
        p2.idade = 12;
        
        //p1 = p2; atribui o endereco
        
        System.out.println(p1.nome + ":" + p1.idade);
        System.out.println(p2.nome + ":" + p2.idade); 
    }
}