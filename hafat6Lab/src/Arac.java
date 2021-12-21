public class Arac {

 Arac(){
 }

 public  String marka ;
 public  String model;
 public  int maliyet;
 public  int uretim_yili;
 public  Kullanici kullanici = new Kullanici();

 public int satisFiyatıHesapla(){
  return maliyet+(uretim_yili*2);
 }

}
