Feature: Reserva de transporte

  Cenario: Reserva dentro da área de cobertura
    Dado que o usuário quer reservar um transporte para "Belo Horizonte" com endereço "Rua A"
    Quando a reserva for solicitada
    Entao o sistema deve responder "Motorista a caminho"

  Cenario: Reserva fora da área de cobertura
    Dado que o usuário quer reservar um transporte para "São Paulo" com endereço "Rua B"
    Quando a reserva for solicitada
    Entao o sistema deve responder "Área fora de cobertura"
