
package provaqustao1;

/**
 *
 * @author Mariana Gurgel
 */
public class ProvaQustao1 {

    public static void main(String[] args) {
        Endereco enderecoMariana = new Endereco("apartamento","Contagem"); 
        Endereco enderecoJorge = new Endereco("casa","BH"); 
        
        Alunos Mariana = new Alunos("Mariana","20203018688", "Engenharia da Computacao", enderecoMariana );
        Professores Jorge = new Professores("Jorge","Doutor", "Física", enderecoJorge );
        
        System.out.println(Mariana.toString());
        Mariana.praticasNoFreeTime();
        System.out.println("\n");
        System.out.println(Jorge.toString());
        Jorge.praticasNoFreeTime();
        
    }
    
}
