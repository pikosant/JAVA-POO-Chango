
package EJ5;


public class Entidades {
 
    
    private int cuentaBank;
    private long DNI;
    private int saldo;

    public Entidades() {
    }

    public Entidades(int cuentaBank, long DNI, int saldo) {
        this.cuentaBank = cuentaBank;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getCuentaBank() {
        return cuentaBank;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setCuentaBank(int cuentaBank) {
        this.cuentaBank = cuentaBank;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Entidades{" + "cuentaBank=" + cuentaBank + ", DNI=" + DNI + ", saldo=" + saldo + '}';
    }
    
    
}
