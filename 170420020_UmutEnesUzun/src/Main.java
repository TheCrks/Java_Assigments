public class Main {
    public static void main(String[] args) {
        Dikdortgen  dikdortgen = new Dikdortgen(10,20);
        Daire daire = new Daire(5);
        EskenarUcgen eskenarUcgen = new EskenarUcgen(8,10,15,20);
        eskenarUcgen.yerDegistir(50,70);


        System.out.println("Dikdörtgen Alan:" + dikdortgen.alan() + ", Dikdötrgen cevre: " + dikdortgen.cevre()+"\n"+
                "Daire Alan:" + daire.alan() + ", Daire cevre: " + daire.cevre()+"\n"+
                "Eskenar Ucgen Alan:" + eskenarUcgen.alan() + ", Eskenar Ucgen cevre: " + eskenarUcgen.cevre()+"\n"+
                "Eskenar Ucgen posiyon: " + eskenarUcgen.getPosX() + "," + eskenarUcgen.getPosY());
    }
}
