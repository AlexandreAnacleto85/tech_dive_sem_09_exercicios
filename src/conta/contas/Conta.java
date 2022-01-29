package conta.contas;

import conta.cliente.Cliente;

public abstract class Conta {
    Cliente titular;

    public Conta() {
        this.titular = new Cliente();
    }


    public Cliente getTitular() {
        return titular;
    }

}