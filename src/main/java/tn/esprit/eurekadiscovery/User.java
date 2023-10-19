package tn.esprit.eurekadiscovery;

public class User {
    private int id;
    private String userName;
    private String email;

    public final static String WELCOME = "welcome";
    public User(){}
    public User(String email,String userName){
        this.userName=email;
        this.email=userName;
    }

}
