import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class launcher_csv {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/persons.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+" ");
        }
        scanner.close();
    }
}
