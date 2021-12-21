public class Test {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici();
        kullanici1.ad = "umut";
        kullanici1.soyad = "uzun";

        Bayi bayi1 = new Bayi();
        bayi1.ad = "bayi1";
        bayi1.kurulus_yili = "1900";

        Arac arac1 = new Arac();
        arac1.marka = "marka1";
        arac1.model = "model1";
        arac1.uretim_yili = 2000;
        arac1.maliyet = 5000;

        Arac arac2 = new Arac();
        arac2.marka = "marka1";
        arac2.model = "model2";
        arac2.uretim_yili = 2010;
        arac2.maliyet = 7000;

        bayi1.aracEkle(arac1);
        bayi1.aracEkle(arac2);
        bayi1.aracSat(arac1,kullanici1);
        bayi1.aracSat(arac2,kullanici1);
        kullanici1.aracListele();
    }
}
