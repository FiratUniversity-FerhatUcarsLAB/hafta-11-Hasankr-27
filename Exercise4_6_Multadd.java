/* 
AD SOYAD:HASAN KARA
OGRENCI NUMARA:250541015
Proje: EXERCİSE 4.6
Tarih: 03.12.2025
*/
public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // a * b + c işlemini döndür
        return a * b + c;
    }

    public static double expSum(double x) {
        // x * e^-x + sqrt(1 - e^-x) işlemini multadd kullanarak yap
        // Formüle göre: a = x, b = e^-x, c = karekök(...)
        
        double eNegX = Math.exp(-x); // e üzeri -x ifadesini hesapladık
        return multadd(x, eNegX, Math.sqrt(1 - eNegX));
    }

    public static void main(String[] args) {
        // 1. Basit Test (1 * 2 + 3 = 5.0 olmalı)
        System.out.println("Basit Test: " + multadd(1.0, 2.0, 3.0));

        // 2. Sinüs/Kosinüs Sorusu: sin(pi/4) + cos(pi/4)/2
        // multadd formatına uydurma: (0.5 * cos) + sin
        double angle = Math.PI / 4.0;
        double resultSinCos = multadd(0.5, Math.cos(angle), Math.sin(angle));
        System.out.println("Sin/Cos Sonucu: " + resultSinCos);

        // 3. Log Sorusu: log10 + log20
        // multadd formatına uydurma: (1.0 * log10) + log20
        double resultLog = multadd(1.0, Math.log10(10), Math.log10(20));
        System.out.println("Log Sonucu: " + resultLog);

        // 4. expSum Testi
        System.out.println("expSum(1.0) Sonucu: " + expSum(1.0));
    }
}
