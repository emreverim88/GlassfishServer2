package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Emrecan on 9.04.2017.
 */
@ManagedBean
@SessionScoped
public class User {

    private String userName;
    private String password;
    private String outcome_text;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOutcome_text() {
        return outcome_text;
    }

    public void setOutcome_text(String outcome_text) {
        this.outcome_text = outcome_text;
    }

    public String login(){

        if(userName.equals("emre") && password.equals("000003"))
            outcome_text = "correct username and password";
        else
            outcome_text = "wrong username or password";

        return outcome_text;
    }
}
