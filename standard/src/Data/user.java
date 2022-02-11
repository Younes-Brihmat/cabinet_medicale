/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import dbase.bdd;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class user {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password + '}';
    }
    
    public boolean logIn() throws ClassNotFoundException, SQLException{
        
        bdd b=new bdd();
        
        return   b.Chekuserandpass(username, password);

    }
    
}
