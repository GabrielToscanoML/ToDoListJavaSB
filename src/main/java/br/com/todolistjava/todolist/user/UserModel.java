package br.com.todolistjava.todolist.user;

public class UserModel {
    private String username;
    private String name;
    private String password;

    // getters
    public String getName() {return name;}
    public String getPassword() {return password;}
    public String getUsername() {return username;}

    // setters
    public void setName(String name) {this.name = name;}
    public void setPassword(String password) {this.password = password;}
    public void setUsername(String username) {this.username = username;}

}
