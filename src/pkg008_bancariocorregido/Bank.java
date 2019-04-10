/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg008_bancariocorregido;

/**
 *
 * @author SISTEMAS
 */
public class Bank {
    private Customer [] customer;
    private int numeroClientes;//indice
    static int NUM_MAX_CLIENTES =5;

    public Bank( ) {
        customer = new Customer[NUM_MAX_CLIENTES];
        numeroClientes = 0;
       
    }
    public void addCustomer(String n, String a){
        int i=numeroClientes++;
        customer[i]= new Customer(n,a);
               
    }

    public Customer getCustomer(int posicion) {
        if (posicion >0 && posicion<5){
            
            return this.customer[posicion];
             
        }
        else {
            return null;
        }
       
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }
    
    
}
