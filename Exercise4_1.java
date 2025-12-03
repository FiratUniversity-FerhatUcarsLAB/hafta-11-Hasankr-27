public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // 1. Metot: Amerikan Formatı
        System.out.println("Amerikan Formatı");
        // Beklenen çıktı: Monday, July 22, 2019
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // 2. Metot: Avrupa Formatı
        System.out.println("Avrupa Formatı");
        // Beklenen çıktı: 22 July 2019, Monday
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        // Değerleri doğrudan kodun içinde tanımlıyoruz
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        // Metotları bu değerlerle çağırıyoruz
        printAmerican(day, date, month, year);

        System.out.println(); // Araya bir satır boşluk ekler

        printEuropean(day, date, month, year);
        
    }
}
