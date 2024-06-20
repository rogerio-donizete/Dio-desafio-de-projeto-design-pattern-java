package service.frete;

import service.Frete;
import service.TipoFrete;

public class Normal implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.1 + 15;
    }
}
