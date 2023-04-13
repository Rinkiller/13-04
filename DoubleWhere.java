import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//  необходимо повторно запросить у пользователя ввод данных


class DoubleWhere{
    private static float dropFloat() {
        System.out.print("Ввудите число: ");
        Scanner Scaner = new Scanner(System.in,"cp866");
        float count = 0;
        boolean end = true;
        while(end){
            
            String s = Scaner.nextLine();
            try{
                count  = Float.parseFloat(s.trim());
                end = false;
                
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Введенные данные не коректны, пожалуйста введите  число" );
                end = true;
            }
            
        }
        Scaner.close();
        return count;
    }
    public static void main(String[] args) {
        System.out.println(dropFloat());
    }
}