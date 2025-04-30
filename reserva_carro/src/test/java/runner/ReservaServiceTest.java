package runner;

import org.junit.Test;
import reserva.ReservaService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ReservaServiceTest {

    @Test
    public void deveRetornarMotoristaACaminhoParaBH() {
        ReservaService service = new ReservaService();
        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        service.reservar("Belo Horizonte", "Rua A");

        System.out.flush();
        assertEquals("Motorista a caminho", saida.toString().trim());
    }

    @Test
    public void deveRetornarMotoristaACaminhoParaContagem() {
        ReservaService service = new ReservaService();
        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        service.reservar("Contagem", "Rua B");

        System.out.flush();
        assertEquals("Motorista a caminho", saida.toString().trim());
    }

    @Test
    public void deveRetornarForaDeCoberturaParaCidadeNaoAtendida() {
        ReservaService service = new ReservaService();
        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        service.reservar("São Paulo", "Rua C");

        System.out.flush();
        assertEquals("Área fora de cobertura", saida.toString().trim());
    }
}
