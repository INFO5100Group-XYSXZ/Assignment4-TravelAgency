/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

/**
 *
 * @author zhaoxi
 */
public class Admin {
   private String username;
   private String password;
   private AccountDirectory accountDir;
   
   public Admin(){
       username = "Admin";
       password = "Admin";
       accountDir = new AccountDirectory();
   }

    public AccountDirectory getAccountDir() {
        return accountDir;
    }

    public void setAccountDir(AccountDirectory accountDir) {
        this.accountDir = accountDir;
    }
   
}
