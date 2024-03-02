package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class PersonCodigo {
    public static void main(String[] args){
        Person Lucas = new Person("Lucas", "PuenteVideo");
        System.out.println("Nombre:" + Lucas.getName());
        System.out.println("Residencia antigua:" + Lucas.getAddress());
        Lucas.setAddress("Rio de Janeiro");
        System.out.println("Nueva residencia:" + Lucas.getAddress());
        System.out.println("Información general:" + Lucas.toString());
        Student pepe = new Student("pepe", "Cairo", "Bachillerato Ciencias", 1,57.95);
        System.out.println("Nombre: "+ pepe.getName() + "\nResidencia: " + pepe.getAddress()
                            + "\nEstudios: " + pepe.getProgram()
                            + "\nAño: " + pepe.getYear()
                            + "\nTarifa: " + pepe.getFee());
        pepe.setProgram("ESO");
        pepe.setYear(2);
        pepe.setFee(23.32);
        System.out.println("Información general: " + pepe.toString());
        Staff gema = new Staff("Gema", "O Porto", "CEIP San Pedro Apostol",1100);
        System.out.println("Nombre: " + gema.getName() +
                           "\nResidencia: " + gema.getAddress() +
                           "\nColegio: " + gema.getSchool() +
                           "\nSueldo: " + gema.getPay());
        gema.setPay(1200.99);
        gema.setSchool("CEIP Serracines");
        gema.setAddress("Sri Lanka");
        System.out.println("Información general: " + gema.toString());
    }
}
