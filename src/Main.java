import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int linesCount = console.nextInt();
        int maxUniqueLetters = 0;
        String mostVariableLine = "";
        Scanner console2 = new Scanner(System.in);
        for (int i = 0; i < linesCount; i++) {
            StringBuilder uniqueLetters = new StringBuilder();
            System.out.print("Строка " + (i + 1) + ": ");
            String currentLine = console2.nextLine();
            for (int j= 0; j < currentLine.length(); j++) {
                if (!uniqueLetters.toString().contains(String.valueOf(currentLine.charAt(j)))) {
                    uniqueLetters.append(currentLine.charAt(j));
                }
            }
            if (maxUniqueLetters < uniqueLetters.toString().length()) {
                maxUniqueLetters = uniqueLetters.toString().length();
                mostVariableLine = currentLine;
            }
        }
        System.out.println("Ответ: " + mostVariableLine);
    }
}