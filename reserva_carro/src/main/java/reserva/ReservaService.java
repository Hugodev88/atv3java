package reserva;

public class ReservaService {
    
    public void reservar(String cidade, String endereco) {
        if (cidade == "Belo Horizonte" || cidade == "Contagem") {
            System.out.println("Motorista a caminho");
        } else {
            System.out.println("Área fora de cobertura");
        }
    }

}
