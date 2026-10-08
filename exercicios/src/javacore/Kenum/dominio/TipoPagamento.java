package javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    DINHEIRO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.2;
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
    }
}
