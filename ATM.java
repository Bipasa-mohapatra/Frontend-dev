public class ATM{
        static double Balance1=30000;
        double Balance2=30000;
        public double Balance(double deposit,double Withdrawl){
        // Write a Condition that satisfy logic of ATM Deposit and Withdrawl
        Balance=Balance+deposit;
          if(Balance<=withdrawl){
          Balance=Balance-withdrawl;
          System.out.println("Balance is in "+" + "+" value");
        }
          else{
          System.out.println("Balance in"+" - "+" Value");
          }
        return Balance;
        }
        public static void main(String[]args){
        ATM a=new ATM();
          // Deposit and WithDrawl Amount should be taken in scanner;
          // Print the Balance here
          a.Balance(3400,45000);
        }
}