
public class Conta {
    private double saldo;
    private int numero;

    public Conta(){

    }
    public Conta(int numero,double saldo) {
        this.saldo = saldo;
        this.numero = numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

}
