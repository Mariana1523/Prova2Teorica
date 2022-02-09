
package provaqustao1;

/**
 *
 * @author Mariana Gurgel
 */
public class Professores extends Pessoa {
    
    private String formacao;
    private String curso;

    public Professores(String nome, String formacao, String curso, Endereco endereco)
    {
        this.formacao=formacao;
        this.curso=curso;
        this.nome = nome;
        this.endereco = endereco;
                /*Nessa linha de código em que é utilizado o Endereço, temos um exemplo de composição,
        pois foi utilizado o tipo Endereco que é um outra classe que foi criada neste mesmo projeto e 
        está sendo utilizada na composição de outra classe, no caso Professores*/
    }

    @Override
    public String toString() {
        return "Professores{"+"\n"+ "nome = "+ nome+"\n" + "endereco ="+ endereco +"\n"+ "formacao =" 
                + formacao +"\n"+ "curso =" + curso +  '}';
    }
    
    @Override
    public void praticasNoFreeTime() {
        System.out.println("Ler livros e ver filmes");
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
 
