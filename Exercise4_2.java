/* 
AD SOYAD:HASAN KARA
OGRENCI NUMARA:250541015
Proje: EXERCİSE 4.2
Tarih: 03.12.2025
*/
public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 5
        zippo("ping", -5); // 6,7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 2
            System.out.println(quince + " zoop"); // 8
        } else { // 3
            System.out.println("ik");
            baffle(quince); // 4
            System.out.println("boo-wa-ha-ha"); // 9
        }
    }
}
