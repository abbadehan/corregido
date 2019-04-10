
package pkg008_bancariocorregido;

/**
 *
 * @author SISTEMAS
 */
class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amt) {
        boolean result = false;
      if ( amt <= balance ) {
             balance = balance - amt;
             result = true;
    }
      return result;
}
     public boolean deposit(double amt) {
            balance = balance + amt;
            return true;
}
   
}
