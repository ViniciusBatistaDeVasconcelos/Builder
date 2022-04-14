package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoBuilderTest {

    @Test
    void deveRetornarExcecaoParaCepNulo() {
        try {
            EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
            Endereco endereco = enderecoBuilder
                    .setRua("Rua Aroeira")
                    .setNumero("945")
                    .setCidade("Porto Velho")
                    .setEstado("RO")
                    .setPais("Brasil")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cep inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEstadoInvalido() {
        try {
            EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
            Endereco endereco = enderecoBuilder
                    .setRua("Rua Aroeira")
                    .setNumero("945")
                    .setCep("76808-290")
                    .setCidade("Porto Velho")
                    .setEstado("ROI")
                    .setPais("Brasil")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estado inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEnderecoValido() {
        EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
        Endereco endereco = enderecoBuilder
                .setRua("Rua Aroeira")
                .setNumero("945")
                .setCep("76808-290")
                .setCidade("Porto Velho")
                .setEstado("RO")
                .setPais("Brasil")
                .build();
        assertNotNull(endereco);
    }
}