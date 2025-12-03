public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // CEVAP: Kod sorunsuz çalışır. Metot 42 sayısını getirir ama biz onu 
        // bir değişkene atamadığımız (veya yazdırmadığımız) için bu değer boşa gider (kaybolur).

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP: Derleme Hatası (Compile Error) verir. 
        // Çünkü void bir metot geriye "sayı" veya "değer" döndürmez. 
        // Olmayan bir şeyle 7'yi toplamaya çalıştığınız için Java hata verir.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
