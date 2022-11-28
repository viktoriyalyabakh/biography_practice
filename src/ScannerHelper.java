import java.util.Scanner;

public class ScannerHelper {

    public static Scanner scan(){
        return new Scanner(System.in);
    }

    public static String getQuestionStirng(String question){
        System.out.println(question);
        return scan().nextLine();
    }

    public static String getQuestionInt(String question){
        System.out.println(question);
        return scan().nextLine();
    }
}
