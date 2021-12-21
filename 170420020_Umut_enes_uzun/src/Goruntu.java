public class Goruntu extends Veri implements Kucuktulebilir{
    private double kisaKenar;
    private double uzunKenar;
    private String renk;
    Goruntu(){}
    Goruntu(double kisaKenar, double uzunKenar, String renk){
        this.kisaKenar=kisaKenar;
        this.uzunKenar = uzunKenar;
        this.renk = renk;
    }

    public int alan(){
        return (int)(kisaKenar*uzunKenar);
    }
    public int cevre(){
        return (int)(kisaKenar+uzunKenar)*2;
    }
    @Override
    public double boyutAzalt(){
        return boyutHesapla()*3/4;
    }
    @Override
    public int boyutHesapla(){
        return alan()*cevre()*10;
    }
}
