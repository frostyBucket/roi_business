import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class MoviePicker{
  public static void main(String[] args){
    ArrayList<String> movies = new ArrayList<String>();
    boolean loop = true;
    while(loop){
      System.out.print("Put movie here: ");
      Scanner keyboard = new Scanner(System.in);
      String movie = keyboard.nextLine();
      if(movie.equals("stop")){
        loop = false;
      }
      else{
          movies.add(movie);
      }
    }
    int movInt = ((int)(Math.random()*movies.size()));
    System.out.println(movies.get(movInt));
  }
}
