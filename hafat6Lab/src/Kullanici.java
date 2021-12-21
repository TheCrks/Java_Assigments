import java.util.ArrayList;

public class Kullanici {
     Kullanici(){}

     String ad;
     String soyad;
     static int aracSayisi;
     static ArrayList<Arac> satinAlinanlar = new ArrayList<Arac>();

     public void aracListele(){
          aracSayisi = satinAlinanlar.size();
          for(int i=0;i<aracSayisi;i++){
          System.out.println(
                          "-------------------------------\n"+
                                  (i+1)+". Arac:"+
                          "\nmarka: "+ satinAlinanlar.get(i).marka+
                          "\nmodel: "+ satinAlinanlar.get(i).model+
                          "\nmaliyet: "+satinAlinanlar.get(i).maliyet+
                          "\nuretim yili: "+satinAlinanlar.get(i).uretim_yili+
                          "\n-------------------------------\n\n"
          );}
     }

}
