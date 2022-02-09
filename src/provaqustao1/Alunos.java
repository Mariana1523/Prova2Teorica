
package provaqustao1;

/**
 *
 * @author Mariana Gurgel
 */
public class Alunos extends Pessoa{
    private String matricula;
    private String curso;

    public Alunos(String nome, String matricula, String curso,  Endereco endereco)
    {
        this.curso=curso;
        this.matricula=matricula;
        this.nome = nome;
        this.endereco = endereco;
        /*Nessa linha de código em que é utilizado o Endereço, temos um exemplo de composição,
        pois foi utilizado o tipo Endereco que é um outra classe que foi criada neste mesmo projeto e 
        está sendo utilizada na composição de outra classe, no caso Alunos*/
    }

    @Override
    public String toString() {
        return "Alunos{"+"\n"+ "nome= "+ nome +"\n" + "endereco= "+ endereco+"\n" + "matricula= " 
                + matricula+"\n" + "curso =" + curso + '}';
    }
    
    @Override
    public void praticasNoFreeTime() {
        System.out.println("Adiantar a matéria atrasada e beber cerveja");
    }
    /*Neste método praticasNoFreeTime é utilizado o polimorfismo, pois uma mesma assinatura
    foi utilizada diferentes maneiras, ou seja, obedece o conceito do polimorfismo
    que é basicamente "Um mesmo nome com vários comportamentos"*/
    
    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
