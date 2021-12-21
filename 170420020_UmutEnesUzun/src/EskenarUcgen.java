public class EskenarUcgen extends Sekil implements Hareketli{
    private double kenar;
    private double yukseklik;
    private double posX;
    private double posY;
    EskenarUcgen(){}
    EskenarUcgen(double kenar, double yukseklik, double posX, double posY){
        this.kenar = kenar;
        this.yukseklik = yukseklik;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public double cevre() {
        return 3*kenar;
    }

    @Override
    public double alan() {
        return (kenar*yukseklik)/2;
    }
    @Override
     public void yerDegistir(double newPosX, double newPosY){
        this.posX = newPosX;
        this.posY = newPosY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
