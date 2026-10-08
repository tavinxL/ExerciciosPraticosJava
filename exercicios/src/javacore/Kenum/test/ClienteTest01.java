package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente01 = new Cliente("Otavio", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Thiago", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente03 = new Cliente("Rosemia", TipoCliente.PESSOA_FISICA, TipoPagamento.DINHEIRO);
        Cliente cliente04 = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.DINHEIRO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DINHEIRO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(tipoCliente2);


    }

}
