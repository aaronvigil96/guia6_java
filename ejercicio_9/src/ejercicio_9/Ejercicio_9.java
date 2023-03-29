package ejercicio_9;
import java.util.Scanner;
import ejercicio_9.Cuenta;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        int opcion, subopcion;
        
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Ingresar nombre y saldo.");
            System.out.println("2)- Mostrar nombre y saldo.");
            System.out.println("3)- Ingresar...");
            System.out.println("4)- Mostrar...");
            System.out.println("5)- Retirar saldo.");
            System.out.println("0)- Salir.");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                        System.out.println("Ingresá nombre");
                        entrada.skip("\n");
                        cuenta.setTitular(entrada.nextLine());
                        System.out.println("Ingresá el saldo");
                        cuenta.setSaldo(entrada.nextInt());
                        cuenta.setExisteCuenta(true);
                        System.out.println("-----------------------");
                        System.out.println("Cuenta creada con éxito");
                        System.out.println("-----------------------");
                    break;
                }
                case 2: {
                    if(cuenta.getExisteCuenta()){
                        System.out.println("-----------------------------------------------------");
                        System.out.println("El titular es " + cuenta.getTitular() + " y tiene un saldo de " + cuenta.getSaldo());
                        System.out.println("-----------------------------------------------------");
                    }else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Debe ingresar un titular y saldo");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    }
                    break;
                }
                case 3: {
                    do{
                        System.out.println("Ingresar...");
                        System.out.println("1)- Ingresar nombre");
                        System.out.println("2)- Ingresar saldo");
                        System.out.println("0)- Volver al menú");
                        subopcion = entrada.nextInt();
                        switch(subopcion){
                            case 1: {
                                System.out.println("Ingresá el nombre del titular");
                                entrada.skip("\n");
                                cuenta.setTitular(entrada.nextLine());
                                System.out.println("-----------------");
                                System.out.println("Titular ingresado");
                                System.out.println("-----------------");
                                break;
                            }
                            case 2: {
                                System.out.println("Ingresá el saldo del titular");
                                cuenta.setSaldo(entrada.nextInt());
                                System.out.println("---------------");
                                System.out.println("Saldo ingresado");
                                System.out.println("---------------");
                                break;
                            }
                            case 0: {
                                break;
                            }
                            default: {
                                System.out.println("");
                                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                System.out.println("Debe ingresar un número válido");
                                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                System.out.println("");
                                break;
                            }
                        }
                    }while(subopcion != 0);
                    if(cuenta.getSaldo() != 0 && cuenta.getTitular() != null){
                        cuenta.setExisteCuenta(true);
                    }
                    break;
                }
                case 4: {
                    do{
                        System.out.println("Mostrar...");
                        System.out.println("1)- Mostrar nombre");
                        System.out.println("2)- Mostrar saldo");
                        System.out.println("0)- Volver al menú");
                        subopcion = entrada.nextInt();
                        switch(subopcion){
                            case 1: {
                                if(cuenta.getTitular() != null){
                                    System.out.println("--------------------------------------");
                                    System.out.println("El titular es: " + cuenta.getTitular());
                                    System.out.println("--------------------------------------");
                                }else {
                                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                    System.out.println("Primero debe ingresar un titular");
                                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                }
                                break;
                            }
                            case 2: {
                                if(cuenta.getSaldo() != 0){
                                    System.out.println("--------------------------------------");
                                    System.out.println("El saldo es de: " + cuenta.getSaldo());
                                    System.out.println("--------------------------------------");
                                }else {
                                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                    System.out.println("Primero debe ingresar un saldo");
                                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                }
                                break;
                            }
                            case 0: {
                                break;
                            }
                            default: {
                                System.out.println("------------------------------");
                                System.out.println("Debe ingresar un número válido");
                                System.out.println("------------------------------");
                            }
                        }
                    }while(subopcion != 0);
                    break;
                }
                case 5: {
                    if(cuenta.existeCuenta()){
                        System.out.println("Ingrese un monto a retirar...");
                        cuenta.retirar_dinero(entrada.nextInt());
                    }else{
                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                        System.out.println("Debe ingresar un titular y saldo para poder retirar dinero");
                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("------------------------------");
                    System.out.println("Debe ingresar un número válido");
                    System.out.println("------------------------------");
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar la aplicación");
    }
    
}
