public class Main {
    public static void main(String[] args) {
        Goruntu goruntu = new Goruntu(15, 25, "mavi");
        goruntu.setBoyut(goruntu.boyutHesapla());
        goruntu.setTur("Goruntu");
        System.out.println("Goruntu Alani: " + goruntu.alan() + "\n" +
                "Goruntu Cevresi: " + goruntu.cevre() + "\n" +
                "Goruntu boyutu: " + goruntu.getBoyut()
        );
        goruntu.setBoyut((int) (goruntu.boyutAzalt()));
        System.out.println("Goruntu Azaltilmis Boyut: " + goruntu.getBoyut());
    }
}
