
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

import java.util.ArrayList;

/**
 *
 * @author gab12
 */
public class BankAccount {
    
    private String accNumber;
    private int accType;
    
    public boolean equals(BankAccount ba){
        if(ba != null){
            return (this.accNumber.equals(ba.accNumber) && this.accType == ba.accType);
        }
        else return false;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof BankAccount){
            BankAccount ba = (BankAccount)obj;
            return (this.accNumber.equals(ba.accNumber) && this.accType == ba.accType);
        }
        else return false;
    }
    
    static{
        BankAccount ba1 = new BankAccount();
        ba1.accNumber = "a001";
        ba1.accType = 4;
        
        BankAccount ba2 = new BankAccount();
        ba2.accNumber = "a001";
        ba2.accType = 4;
        
        BankAccount ba3 = new BankAccount();
        ba3.accNumber = "a001";
        ba3.accType = 4;
        
        ArrayList<BankAccount> baList = new ArrayList<BankAccount>();
        baList.add(ba1);
        baList.add(ba2);
        
        // baList.add(ba2);
        
        System.out.println("ARE BANKS ACC EQUAL? "+ba1.equals(ba2));
        System.out.println("IS BANK ACC CONTAINED? "+baList.contains(ba3));
        
    }
}