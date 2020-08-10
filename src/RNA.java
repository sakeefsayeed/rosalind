import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class RNA {
    public static void main(String[] args) throws FileNotFoundException {
        File dataset = new File("rosalind_rna.txt");
        Scanner scanner = new Scanner(dataset);
        while (scanner.hasNextLine()){
            String nucleotidesOriginal = scanner.nextLine();
            String nucleotidesReplaced = nucleotidesOriginal.replace('T', 'U');
            System.out.println(nucleotidesReplaced);
        }
    }
}
