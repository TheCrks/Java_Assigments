abstract class Veri {
    private String tur;
    private int boyut;
    public abstract int boyutHesapla();

    public int getBoyut() {
        return boyut;
    }

    public String getTur() {
        return tur;
    }

    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
