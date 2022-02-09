
package provaqustao1;

/**
 *
 * @author Mariana Gurgel
 */
public abstract class Pessoa {
    protected String nome;
    Endereco endereco;
     
    public abstract void praticasNoFreeTime();
    /*Nesta parte acima, pode-se observar o pilar do encapsulamento. Ele ocorre devido 
    a utilização da interface Pessoa e do método implementado Freetime. Isso ocorre pois a criação desse
    método funciona de fato como uma capsula, porém uma capsula vazia, ou seja, é criado esse molde que já tem um
    objetivo definido no caso o de atribuir a todas pessoas alguma prática em seu tempo livre, porém cada pessoa pode preencher
    o conteúdo dessa capsula da maneira que desejar, contato que atinja o objetivo e funcione corretamente. Além disso
    é impoprtante ressaltar que toda pessoa é obrigada a ter uma pratica no seu tempo livre, essa é uma caracteristica
    relevante da utilização de interfaces.*/
}

    
    

