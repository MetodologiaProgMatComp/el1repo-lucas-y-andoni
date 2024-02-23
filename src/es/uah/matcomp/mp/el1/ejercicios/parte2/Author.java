package es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String toString(){
        return "Author[ name= "+name+", email= "+email+", gender= "+gender+"]";
    }
}
