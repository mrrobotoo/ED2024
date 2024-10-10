

import java.util.Stack;
import java.util.Scanner;


    class Cliente {
    private int numeroCliente;
    private long tiempoLlegada;
    private double kilosTortillas;

    public Cliente(int numeroCliente, long tiempoLlegada, double kilosTortillas) {
        this.numeroCliente = numeroCliente;
        this.tiempoLlegada = tiempoLlegada;
        this.kilosTortillas = kilosTortillas;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    public double getKilosTortillas() {
        return kilosTortillas;
    }

    @Override
    public String toString() {
        return "Cliente " + numeroCliente + " llegó en " + tiempoLlegada + "ms y compró " + kilosTortillas + " kg de tortillas";
    }
}

public class tortilleria {
    public static void main(String[] args) {
      
        Stack<Cliente> pilaClientes = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int numeroCliente = 1;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese 1 para agregar un cliente, 2 para atender al cliente más reciente, 3 para salir:");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    long tiempoActual = System.currentTimeMillis();
                    System.out.println("Ingrese la cantidad de kilos de tortillas que lleva el cliente:");
                    double kilosTortillas = scanner.nextDouble();

                    Cliente cliente = new Cliente(numeroCliente++, tiempoActual, kilosTortillas);
                    pilaClientes.push(cliente);
                    System.out.println("Se ha agregado " + cliente);
                    break;

                case 2:
                    
                    if (!pilaClientes.isEmpty()) {
                        Cliente atendido = pilaClientes.pop();
                        System.out.println("Atendiendo a " + atendido);
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    break;

                case 3:
                 
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}