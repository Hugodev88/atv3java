package steps;

import io.cucumber.java.pt.*;
import reserva.ReservaService;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReservaSteps {

    private String cidade;
    private String endereco;
    private String resultado;

    @Dado("que o usuário quer reservar um transporte para {string} com endereço {string}")
    public void definirDados(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Quando("a reserva for solicitada")
    public void realizarReserva() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        new ReservaService().reservar(cidade, endereco);

        System.out.flush();
        resultado = saidaCapturada.toString().trim();
    }

    @Então("o sistema deve responder {string}")
    public void verificarResposta(String respostaEsperada) {
        assertEquals(respostaEsperada, resultado);
    }
}
