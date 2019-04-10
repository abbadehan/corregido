
package pkg008_bancariocorregido;

/**
 *
 * @author SISTEMAS
 */
public class TestAcount {
    
    
    public static void main(String[] args) {
        Account acct = new Account(500.0);
       
        Customer c = new Customer("Juan", "Herrera");
         Customer c1 = new Customer("Alvaro", "Castilla");
     Customer c2 = new Customer("Juan", "Antonio");
         Customer c3 = new Customer("Carlos", "fernandez");
     Customer c4 = new Customer("Jaime", "Carmina");

Bank b= new Bank();
        b.addCustomer("Alvaro", "Castilla");
        b.getCustomer(0);
        System.out.println(b.getCustomer(0));
     
     
 /*       c.setAccount(acct);
        
    System.out.println( c.getName()+" tiene un saldo inicial de "+acct.getBalance());
    acct.withdraw(150.00);
    System.out.println( c.getName()+" tiene un saldo  de "+acct.getBalance());
    acct.deposit(22.50);
   System.out.println( c.getName()+" tiene un saldo  de "+acct.getBalance());
   acct.withdraw(47.62);
      acct.withdraw(400.00);

   System.out.println( c.getName()+" tiene un saldo final  de "+acct.getBalance());
*/
   
   
 
    }
}
