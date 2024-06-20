package service;

import service.frete.Agendada;
import service.frete.Expressa;
import service.frete.Normal;

/**
 * Enum com design pattern Factory implementado,
 * assim cada enum retorna um objeto da classe associada.
 */
public enum TipoFrete {

    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    EXPRESSA {
        @Override
        public Frete obterFrete() {
            return new Expressa();
        }
    },
    AGENDADA {
        @Override
        public Frete obterFrete() {
            return new Agendada();
        }
    };

    public abstract Frete obterFrete();
}
