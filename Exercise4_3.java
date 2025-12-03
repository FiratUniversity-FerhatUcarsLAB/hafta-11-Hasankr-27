public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
    Exercise 4.3 Cevaplar

    1. Stack Diyagramı (ping ilk çalıştığında):
    -------------------------------------------
    (En üstteki metot şu an çalışandır)
    
    [ ping   ] 
    [ baffle ]
    [ zoop   ]
    [ main   ]

    2. Programın Çıktısı:
    -------------------------------------------
    No , I  wug.
     You wugga  wug.
    I  wug.
*/
