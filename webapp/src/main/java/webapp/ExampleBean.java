package webapp;


import javax.enterprise.context.RequestScoped;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ExampleBean implements Serializable {

    private String login;
    private String password;
    private boolean logged;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void doLogin() {
        logged = true;


    }
    //    private String text = "CDI example";
////
////    public String getText() {
////        return text;
////    }
////
////    public void setText(String text) {
////        this.text = text;
////    }



}
