import java.util.Scanner;

class RemoveVowels { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        
        if (input == null || input.isEmpty()) {
            System.out.println("Введена пустая строка");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }
        
        System.out.println("Результат: " + result.toString());
    }
}