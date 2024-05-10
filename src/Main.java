import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Immersion");
        //System.out.println("Matrix movie");

        //Declaring variables
        int releaseDate = 1999;
        double rating = 4.5;
        boolean includedInBasicPlan = true;
        String nameOfTheMovie = "Matrix";
        String synopsis = """
                
                The best movie of the end of the millennium.
                Neo discovers the secret behind everything
                he swore to be true.
                
                """;

        double averageRatingMatrix = 0;

        System.out.println("Name of the movie: " + nameOfTheMovie);
        System.out.println("Synopsis: " + synopsis);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Is it included on the Basic Plan? " + includedInBasicPlan);

        double averageRating = (4.5 + 4.8 + 3) / 3;
        System.out.println("Average movie rating: " + averageRating);

        if (releaseDate >= 2023 && releaseDate <= 2024) {
            System.out.println("This movie is on fire right now");
        }
        else{
            System.out.println("This is an old gem you must watch");
        }

        int counter = 0;
        while (counter < 3) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a rating for Matrix: ");
            double ratingMatrix = keyboard.nextDouble();
            averageRatingMatrix = averageRatingMatrix + ratingMatrix;
            counter++;
        }

        System.out.println("The average rating for " +
                "Matrix is: " + averageRatingMatrix / 3);
    }
}
