import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args) 
	{
        Scanner keyboard = new Scanner(System.in);
        
        boolean wantAnother;
        
        do
        {
	        Movie movie = new Movie();
	        
	        System.out.println("Enter the name of the movie: ");
	        String title = keyboard.nextLine();
	        movie.setTitle(title);
	
	        System.out.println("Enter rating of the movie: ");
	        String rating = keyboard.nextLine();
	        movie.setRating(rating);
	
	        System.out.println("Enter the number of tickets sold for this movie: ");
	        int ticketsSold = keyboard.nextInt();
	        movie.setSoldTickets(ticketsSold);
	
	        System.out.println(movie.toString());
	        
	        System.out.println("Do you want to enter another movie? (y/n): ");
            String answer = keyboard.next();
            keyboard.nextLine();
            wantAnother = answer.equals("y");
            
        } while (wantAnother);
        
        keyboard.close();
    }
}
