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
public class ATM {

    double balance;
    String bankName;

    public ATM(String bank, double bal) {
        bankName = bank;
        balance = bal;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            return true;
        }
        return false;
    }
    
    public double interest(double per, int days){
        
        return balance;
    }

}
