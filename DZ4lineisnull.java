import java.util.Scanner;

public class DZ4lineisnull {
    public static void main(String[] args) {
        System.out.print("Ввудите число: ");
        Scanner Scaner = new Scanner(System.in,"cp866");       
        String s = Scaner.nextLine();
        if(s.length() == 0) throw new RuntimeException("Пустые строки вводить нельзя!!!! Наверное...");
        Scaner.close();
    }
}
