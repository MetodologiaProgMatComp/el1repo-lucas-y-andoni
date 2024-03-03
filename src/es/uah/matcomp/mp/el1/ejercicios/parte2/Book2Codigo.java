package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Book2Codigo {
        public static void main(String[] args) {
            // Test Author class
            Author2 a1 = new Author2("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println(a1);
            a1.setEmail("ahteck@somewhere.com");
            System.out.println(a1);
            System.out.println("name is: " + a1.getName());
            System.out.println("email is: " + a1.getEmail());
            // Test Book class
            Book2 b1 = new Book2("12345", a1,8.8,88,"Java for dummies");
            System.out.println(b1);
            b1.setPrice(9.9);
            b1.setQty(99);
            System.out.println(b1);
            System.out.println("isbn is: " + b1.getIsbn());
            System.out.println("name is: " + b1.getName());
            System.out.println("price is: " + b1.getPrice());
            System.out.println("qty is: " + b1.getQty());
            System.out.println("author is: " + b1.getAuthor()); // Author's toString()
            System.out.println("author's name: " + b1.getAuthorName());
            System.out.println("author's name: " + b1.getAuthor().getName());
            System.out.println("author's email: " + b1.getAuthor().getEmail());
        }
}


