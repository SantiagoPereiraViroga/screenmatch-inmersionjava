import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Immersion");
        //System.out.println("Matrix movie");

        //Declaracion de variables
        int releaseDate = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombreDePelicula = "Matrix";
        String sinopsis = """
                
                La mejor pelicula de fin de milenio.
                Neo descubrira el secreto detras de todo
                aquello que juraba ser verdadero.
                """;
        double mediaNotaMatrix = 0;

        System.out.println("Nombre de pelicula: " + nombreDePelicula);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + releaseDate);
        System.out.println("Rating: " + evaluacion);
        System.out.println("¿Se incluye en el plan basico? " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (releaseDate >= 2023) {
            System.out.println("This is movie is hot right now");
        }
        else{
            System.out.println("This is an old gem you must watch");
        }

        for (int i = 0; i < 3; i++) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = keyboard.nextDouble();
            mediaNotaMatrix = mediaNotaMatrix + notaMatrix;
        }

        System.out.println("La media de la pelicula" +
                "Matrix calculada es: " + mediaNotaMatrix / 3);
    }
}