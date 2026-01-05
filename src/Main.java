import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSheets = scanner.nextInt();
        int height = 0;
        int width = 0;
        int requiredPieces = 0;
        while (totalSheets --> 0) {
            width = scanner.nextInt();
            height = scanner.nextInt();
            requiredPieces = scanner.nextInt();
            int sheets = countSheets(width) * countSheets(height);
            System.out.printf("%s\n",(requiredPieces<=sheets)?"YES":"NO" );
        }
    }
    public static int countSheets(int side){
        int result = 1;
        while (side % 2 == 0) {
            side /= 2;
            result *= 2;
        }
        return result;
    }
}