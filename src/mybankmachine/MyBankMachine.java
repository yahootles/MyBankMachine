/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;

/**
 *
 * @author antho6229
 */
import javax.swing.JOptionPane;

public class MyBankMachine {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the name of the bank");
        double bal = 0;
        ATM account;
        
        try {
            bal = Double.parseDouble(JOptionPane.showInputDialog("Enter your starting balance(must be positive)"));
        }catch(NumberFormatException nfe){
            System.err.println("Invalid input. Try again.");
        }catch (NullPointerException npe){
            
        }
        
        account = new ATM(name, bal);
        
        int choice = 0;
        
        while(choice != 0){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Would you like to:"
                    + "1. Deposit\n2. Withdraw\n3. Check balance\n4. Invest\n 0.Exit"));
            switch(choice){
                case 1:
                    boolean valid = false;
                    while(!valid){
                        try{
                            account.deposit(Double.parseDouble(JOptionPane.showInputDialog("How much would you like to deposit?")));
                            valid = true;
                        }catch(NumberFormatException nfe){
                            System.err.println("Invalid input;");
                        }
                    }
                    break;
                case 2:
                    valid = false;
                    while(!valid){
                        try{
                            double value = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to withdraw?"));
                            if(account.withdraw(value)){
                                System.out.println("$" + value + " has been withdrawn");
                            }else{
                                
                            }
                            valid = true;
                        }catch(NumberFormatException nfe){
                            System.err.println("Invalid input;");
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}
