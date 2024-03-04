package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class AnimalCodigo {
    public static void main(String[] args){
        Cat gato1 = new Cat("bola de nieve");
        Dog perro1 = new Dog("Miguel");
        Dog perro2 = new Dog("Jose");
        perro1.greets();
        perro2.greets(perro1);
        System.out.println("Informacion del gato1: " + gato1.toString());
        System.out.println("Información del perro1: " + perro1.toString());
        Animal serpiente = new Animal("Juliana");
        //Serpiente no puede llamar a greets porque no es una función de esa clase, la herencia no es bilateral.
        System.out.println("Información general de la serpiente: " + serpiente.toString());
    }
}
