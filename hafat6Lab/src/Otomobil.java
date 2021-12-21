public class Otomobil extends Arac{
     Otomobil(){}
     static int silindir_hacmi;

     public int satisFiyatıHesapla(){
          return maliyet+(uretim_yili*2)+silindir_hacmi*3;
     }
}
