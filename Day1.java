import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Day1{
  public static void main(String[] args) throws FileNotFoundException{
    File file = new File("inputs/day1.txt");
    Scanner fileReader = new Scanner(file);
    int maxElf = 0;
    int currentElf = 0;
    while(fileReader.hasNextLine()){
      String line = fileReader.nextLine();
      if(line.equals("")){
        if(currentElf > maxElf){
          maxElf = currentElf;
        }
        currentElf = 0;
      }
      else{
        currentElf += Integer.parseInt(line);
      }
    }
    System.out.println(maxElf);
    }
}
