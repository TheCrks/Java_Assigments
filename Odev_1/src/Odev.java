// Umut Enes Uzun 11.10.2021 Tarihli Ödevi


import java.util.Scanner;

public class Odev {
    public static double Bolunen;
    public static int Fiyat;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Soru 1 Fonksiyonu Çağırma ve Yazdırma
        System.out.print("Ogrenci Notunu Giriniz: ");
        double OgrenciNot = input.nextDouble();
        String Harf = HarfNotuHesapla(OgrenciNot);
        System.out.println("Ogrencinin Harf Notu : " + Harf);

       //Soru 2 Fonksiyonu Çağırma ve Yazdırma
        System.out.print("Bolunecek Sayi : ");
        Bolunen = input.nextInt();
        int BolumSayisi = BolunmeSayisi(Bolunen);
        System.out.println(Bolunen + " Sayısı 2'ye " + BolumSayisi + " Kez tam Bölünür");

        //Soru 3 Fonksiyonu Çağırma ve Yazdırma
        System.out.print("Urun Fiyatı : ");
         Fiyat = input.nextInt();
        double IndirimliFiyat = IndirimHesapla(Fiyat);
        System.out.println("Indirimli Fiyat: "+ IndirimliFiyat);

        //Soru 4 Fonksiyonu Çağırma ve Yazdırma
        MinFinalNotu();

        //Soru 5 Fonksiyoun Çağırma Ve Yazdırma
        int a,b,c=0; a=3 ; b=4 ; c=5;
        if ((UcgenKontrol(a, b, c))) {
            System.out.println(a + " " + b + " " + c + " " + "Sayilari ile ucgen olusturulur");
        } else {
            System.out.println(a + " " + b + " " + c + " " + "Sayilari ile ucgen olusturulmaz");
        }

        //Soru 6 Fonksiyoun Çağırma Ve Yazdırma
        Bolunme5ve2();
        //Soru 7 Fonksiyoun Çağırma Ve Yazdırma
        Bolen5denKucuk();
        //Soru 8 Fonksiyoun Çağırma Ve Yazdırma
        BolenSayisi5denKucuk();
    }

// Soru 1 :(Öğrenci Harf Notu Hesaplama) fonksiyonu
    public static String HarfNotuHesapla(double Ogrenci_Notu) {
        if (Ogrenci_Notu >= 85 && Ogrenci_Notu <= 100) {
            return "AA";
        } else if (Ogrenci_Notu >= 75 && Ogrenci_Notu < 100)
            return "BB";
        else if (Ogrenci_Notu >= 65 && Ogrenci_Notu < 100)
            return "CC";
        else if (Ogrenci_Notu >= 55 && Ogrenci_Notu < 100)
            return "DD";
        else if (Ogrenci_Notu < 55 && Ogrenci_Notu >= 0 && Ogrenci_Notu < 100)
            return "FF";
        else {
            System.out.print("Gecerli Bir Not Giriniz: ");
            Scanner input = new Scanner(System.in);
            double GecerliNot = input.nextDouble();
            return HarfNotuHesapla(GecerliNot);
        }
    }

//Soru 2 Fonksiyonu
    public static int BolunmeSayisi(double BolunenSayi) {
        if (BolunenSayi <= 5 || BolunenSayi >= 15) {
            double GecerliSayi = 0;
            System.out.print("5-15 araliginda bir sayi giriniz: ");
            Scanner input = new Scanner(System.in);
            GecerliSayi = input.nextInt();
            Bolunen = GecerliSayi;
          return BolunmeSayisi(GecerliSayi);
        }
        int Counter = 0;
        while (BolunenSayi != 0) {
            if (BolunenSayi % 2 == 0)
                Counter++;
            BolunenSayi /= 2;
        }
        return Counter;
    }
//Soru 3 Fonksiyonu
    public static double IndirimHesapla(double Ucret){
        if(Ucret<=200 && Ucret>0){
            Ucret-=Ucret*10/100;
        }
        else if (Ucret<=400 && Ucret>200){
            Ucret-=Ucret*15/100;
        }
        else if (Ucret>400){
            Ucret-=Ucret*20/100;
        }
        else{
            double GecerliFiyat = 0;
            System.out.print("Gecerli Bir Fiyat Giriniz: ");
            Scanner input = new Scanner(System.in);
            GecerliFiyat = input.nextInt();
            return IndirimHesapla(GecerliFiyat);
        }
        return Ucret;
    }
//Soru 4 Fonksiyonu
    public static void MinFinalNotu(){
        double Vize=47;
        double Proje=54;
        double Ortalama=70;
        int MinFinal=(int)(Ortalama-(Vize*3/10 + Proje/5))*2+1;
    System.out.println("Ogrencinin Gecmesi icin Minumum Final Notu: "+MinFinal);
    }

//Soru 5 Fonksiyonu
    public static boolean UcgenKontrol(int a , int b ,int c){
        if(a+b<=c || a+c<=b || b+c<=a)
            return false;
        else
            return true;
    }

//Soru 6 Fonksiyonu
    public static void Bolunme5ve2(){
            int Number = 28;
        if (Number%5==0 && Number%2==0){
            System.out.println("Sayi 5 ve 2'ye Bölünebilir");
        }
        else if (Number%5==0 && Number%2!=0){
            System.out.println("Sayi 5'e bölünür 2'ye bölünmez");
        }
        else if (Number%5!=0 && Number%2==0){
            System.out.println("Sayi 2'ye bölünür 5'e bölünmez");
        }
        else if (Number%5!=0 && Number%2!=0){
            System.out.println("Sayi 5'e ve 2'ye bölünmez");
        }
    }

//Soru 7 Fonksiyonu
    public static void Bolen5denKucuk() {
        int BolunenSayi = 16;
        int Bolen = 1;
        for (int i = 4; i >= 1; i--) {
            if (BolunenSayi % i == 0) {
                Bolen = i;
                break;
            }
        }
        System.out.println(BolunenSayi + " Sayısının 5'den kücük en buyuk tam böleni: " + Bolen);
    }

//Soru 8 Fonksiyonu
public static void BolenSayisi5denKucuk() {
    int BolunenSayi = 16;
    int counter = 0;
    for (int i = 4; i >= 1; i--) {
        if (BolunenSayi % i == 0) {
            counter++;
        }
    }
    System.out.println(BolunenSayi + " Sayısının 5'den kücük tam Bolen Sayisi: " + counter);
}
}