
package trabajopractico02;
public class cuentaBancaria {
    private String nombreTitular;
    private String tipoDeCuenta;
    private int saldo;
    
    public cuentaBancaria(String nombre, String cuenta, int saldo){
        this.nombreTitular=nombre;
        this.tipoDeCuenta=cuenta;
        this.saldo=saldo;
    }

    cuentaBancaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void extraer(int monto){
        if(this.saldo>=monto){
            this.saldo= this.saldo-monto;
        }
        
    }
    public void setTitular(String titular){
        this.nombreTitular=titular;
    }
    public String getTitular(){
        return nombreTitular;
    }
    public void setTipoCuenta(String tipo){
        this.tipoDeCuenta=tipo;
    }
    public String getTipoCuenta(){
        return tipoDeCuenta;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }
}
