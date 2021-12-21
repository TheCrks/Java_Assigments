public class Daire extends Sekil{
    private final double PI = 3.14;
    Daire(){}
    Daire(int yariCap){
        this.yariCap = yariCap;
    }
    private int yariCap;

    @Override
    public double alan() {
        return PI*yariCap*yariCap;
    }
    @Override
    public double cevre() {
        return 2*PI*yariCap;
    }
}
