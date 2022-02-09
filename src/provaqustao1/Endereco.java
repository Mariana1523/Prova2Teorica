
package provaqustao1;

/**
 *
 * @author Mariana Gurgel
 */
public class Endereco {
    private String casaApartamento;
    private String bairro;
    public Endereco(String casaApartamento, String bairro)
    {
        this.casaApartamento=casaApartamento;
        this.bairro=bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "casaApartamento=" + casaApartamento + ", bairro=" + bairro + '}';
    }

    public String getCasaApartamento() {
        return casaApartamento;
    }

    public void setCasaApartamento(String casaApartamento) {
        this.casaApartamento = casaApartamento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
