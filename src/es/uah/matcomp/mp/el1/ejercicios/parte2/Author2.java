package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Author2 {
    private String name;
    private String email;

    public Author2(String n, String e) {
        this.name = n;
        this.email = e;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String toString(){
        return "Author[ name= "+name+", email= "+email+"]";
    }
}
