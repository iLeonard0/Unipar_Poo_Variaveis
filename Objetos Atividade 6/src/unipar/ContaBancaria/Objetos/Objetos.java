package unipar.ContaBancaria.Objetos;

public class Objetos {

    private double saldo;
    private String numeroConta;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    // Método para depositar
    public void depositar(double valor){
        this.saldo += valor; // Atualizar o saldo após o depósito
    }

    // Método para sacar
    public void sacar(double valor){
        this.saldo -= valor; // Atualizar o saldo após o saque
    }
}