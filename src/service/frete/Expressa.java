package service.frete;

import service.Frete;

public class Expressa implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.3 + 15;
    }
}
