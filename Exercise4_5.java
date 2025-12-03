/* 
AD SOYAD:HASAN KARA
OGRENCI NUMARA:250541015
Proje: EXERCİSE 4.5
Tarih: 03.12.2025
*/
public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*

    1. Stack Diyagramı (zoop metodu 2. kez çalıştığında):
    -----------------------------------------------------
    (En üstteki metot şu an aktif olandır)

    [ zoop  ]  fred = " breakfast ", bob = 4
    [ clink ]  fork = 4
    [ main  ]  bizz = 5, buzz = 2

    2. Programın Çıktısı:
    -----------------------------------------------------
     just for 
     any  not  more 
    It ’s  breakfast 
    !
*/
