package service.frete;

import service.Frete;

public class Agendada implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.1 + 50;
    }
}
