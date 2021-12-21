import java.util.ArrayList;

public class Bayi {
     Bayi(){}

     String ad;
     String kurulus_yili;
     int uretilenAracSayisi;
     static ArrayList<Arac> araclar = new ArrayList<Arac>();


     public  void aracEkle(Arac arac){
          araclar.add(arac);
     }
     public void aracSat(Arac arac,Kullanici kullanici){
          arac.kullanici = kullanici;
          kullanici.satinAlinanlar.add(arac);
          araclar.remove(arac);
     }
}
