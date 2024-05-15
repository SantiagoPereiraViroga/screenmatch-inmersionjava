import java.util.Scanner;
import Model.Movie;
import Model.Series;

public class Principal {

    public void showMenu() {

        int option = 0;
        Scanner keyboard = new Scanner(System.in); //Could've been done inside the WHILE, but declaring variables together at the beginning is a good practice
        while(option != 9){

            String menu = """
                    
                    Welcome to Screenmatch
                    
                    
                    1) Register a new movie
                    2) Register a new series
                    
                    9) Exit
                    
                    """;
            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine(); //Prevents error with "nextInt" and makes sure to make a line break when ENTER is pressed

            switch (option) {

                case 1:
                    System.out.println("Enter a movie name");
                    String name = keyboard.nextLine();
                    System.out.println("Enter the release date of the movie");
                    int releaseDate = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter the runtime of the movie");
                    int runtime = keyboard.nextInt();
                    keyboard.nextLine();

                    Movie userMovie = new Movie();
                    userMovie.setName(name);
                    userMovie.setReleaseDate(releaseDate);
                    userMovie.setRuntime(runtime);
                    userMovie.showDataSheet();
                    break; //To not repeat Case 1 endlessly once successfully executed

                case 2:
                    System.out.println("Enter a series name");
                    String seriesName = keyboard.nextLine();
                    System.out.println("Enter the release date of the series");
                    int seriesReleaseDate = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter the number of seasons: ");
                    int seriesSeasonsNumber = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter the number of episodes: ");
                    int seriesEpisodesNumber = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter the runtime per episode: ");
                    int seriesEpisodesRuntime = keyboard.nextInt();
                    keyboard.nextLine();

                    Series userSeries = new Series();
                    userSeries.setName(seriesName);
                    userSeries.setReleaseDate(seriesReleaseDate);
                    userSeries.setSeasons(seriesSeasonsNumber);
                    userSeries.setEpisodesPerSeason(seriesEpisodesNumber);
                    userSeries.setRuntime(seriesEpisodesRuntime);
                    userSeries.showDataSheet();
                    break;

                case 9:
                    System.out.println("Exiting the program");
                    break;

                default:
                    System.out.println("This option is not valid");
                    break;
            }
        }
    }
}
