import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите 1 для сотрудника, 0 для посетителя (через пробел):");
        String input = sc.nextLine();
        
        int count = 0;
        for (String s : input.split(" ")) {
            if (s.equals("1")) count++;
        }
        
        System.out.println("Сотрудников: " + count);
    }
}