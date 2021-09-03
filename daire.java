public class daire extends sekil{
    int yariCap;

    public daire(String isim, int yariCap){
        super(isim);
        this.yariCap=yariCap;
    }

    void alanHesapla(){
        System.out.println(getIsim()+" in alanı "+(Math.PI*yariCap*yariCap)+" dır");
    }
}
