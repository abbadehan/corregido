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
public class Customer {
    String name;
    String apellido;
    Account  account;


    public Customer(String n, String a) {
        this.name = n;
        this.apellido = a;
    }
    
    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    
}
