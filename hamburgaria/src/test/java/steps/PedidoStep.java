package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import static org.junit.Assert.assertEquals;
import com.hamburgaria.Pedido;

public class PedidoStep {

    private Pedido pedido;
    private String mensagem;

    @Dado("que o cardápio está carregado")
    public void queACardapioEstáInicializada() {
        pedido = new Pedido();
    }

    @Quando("o cliente pedir o hambúrguer {string}")
    public void pedirHambuguer(String hambuguer) {
        if ("success".equals(pedido.realizarPedido(hambuguer))) {
            mensagem = "Pedido confirmado: " + hambuguer;
        } else {
            mensagem = "Item não está disponível no cardápio: " + hambuguer;
        }
    }

    @Então("o sistema deve confirmar o pedido de {string}")
    public void oSistemaDeveConfirmarOPedidoDe(String hambuguer) {
        assertEquals("Pedido confirmado: " + hambuguer, mensagem);
    }

    @Então("o sistema deve informar que o hambúrguer não está disponível")
    public void oSistemaDeveInformarQueOHamburguerNaoEstaDisponivel(String hambuguer) {
        assertEquals("Item não está disponível no cardápio" + hambuguer, mensagem);
    }

}