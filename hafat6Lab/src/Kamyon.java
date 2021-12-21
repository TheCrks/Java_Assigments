public class Kamyon extends Arac{

    Kamyon(){
    }

    public int toplam_agirlik;

     public int satisFiyatıHesapla(){
          return maliyet+(uretim_yili*2)+toplam_agirlik*6;
     }
}
