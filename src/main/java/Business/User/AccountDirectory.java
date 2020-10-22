/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhaoxi
 */
public class AccountDirectory {
    private List<Account> accountDir;

    public AccountDirectory(){
        this.accountDir = new ArrayList<Account>();
    }

    public List<Account> getAccountDir() {
        return accountDir;
    }

    public void setAccountDir(List<Account> accountDir) {
        this.accountDir = accountDir;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountDir.add(account);
        return account;
    }
    
    public void deleteAccount(Account account){
        accountDir.remove(account);
    }
}
