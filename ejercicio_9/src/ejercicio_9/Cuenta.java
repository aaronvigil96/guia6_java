/*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
    Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
*/
package ejercicio_9;
public class Cuenta {
    
    //Atributos
    private int saldo;
    private String titular;
    private boolean existeCuenta = false;
    
    //Constructor
    Cuenta(){
        
    }
    
    //Métodos
    public int getSaldo(){
        return this.saldo;
    }
    public String getTitular(){
        return this.titular;
    }
    public boolean getExisteCuenta(){
        return this.existeCuenta;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setExisteCuenta(boolean cuenta){
        this.existeCuenta = cuenta;
    }
    public boolean existeCuenta(){
        if(saldo != 0 && titular != null){
            existeCuenta = true;
        }
        return existeCuenta;
    }
    public int retirar_dinero(int saldo){
        if(this.saldo > saldo){
            this.saldo = this.saldo - saldo;
            System.out.println("---------------------------------------------------");
            System.out.println("Extracción sastifactoria saldo disponible: " + this.saldo);
            System.out.println("---------------------------------------------------");
        }else {
            System.out.println("---------------------------------------------------");
            System.out.println("Lo siento, no puede retirar esa cantidad");
            System.out.println("---------------------------------------------------");
        }
        return this.saldo;
    }
}
