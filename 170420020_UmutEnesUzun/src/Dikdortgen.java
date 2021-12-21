public class Dikdortgen extends Sekil{
    Dikdortgen(){}
    Dikdortgen(int kisaKenar,int uzunKenar){
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }
    private int kisaKenar;
    private int uzunKenar;
    @Override
    public double cevre() {
        return (kisaKenar+uzunKenar)*2;
    }
    @Override
    public double alan() {
        return kisaKenar*uzunKenar;
    }
}
