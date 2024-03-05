package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte6;

public class Codigo6 {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("Blanca");//constructor neceita name
        cat1.greets();
        Dog dog1 = new Dog("Craocky");//constructor neceita name
        dog1.greets();
        BigDog bigDog1 = new BigDog("Buldof");//constructor neceita name
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("Nieve");//constructor neceita name
        animal1.greets();
        Animal animal2 = new Dog("Bark");//constructor neceita name
        animal2.greets();
        Animal animal3 = new BigDog("Poseidon");//constructor neceita name
        animal3.greets();
        //Animal animal4 = new Animal();//No se puede instanciar

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;//animal2 es un perro
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
