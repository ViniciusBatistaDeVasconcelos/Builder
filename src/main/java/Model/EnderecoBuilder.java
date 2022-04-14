package Model;

import java.util.Locale;

public class EnderecoBuilder {

    private Endereco endereco;

    public EnderecoBuilder() {
        endereco = new Endereco();
    }

    public Endereco build() {
        if (endereco.getCep().equals("")) throw new IllegalArgumentException("Cep inválido!");

        endereco.setEstado(endereco.getEstado().toUpperCase());
        if (endereco.getEstado().length() != 2) throw new IllegalArgumentException("Estado inválido!");

        return endereco;
    }

    public EnderecoBuilder setRua(String rua) {
        endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder setNumero(String numero) {
        endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        endereco.setCep(cep);
        return this;
    }

    public EnderecoBuilder setCidade(String cidade) {
        endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder setEstado(String estado) {
        endereco.setEstado(estado);
        return this;
    }

    public EnderecoBuilder setPais(String pais) {
        endereco.setPais(pais);
        return this;
    }
}
