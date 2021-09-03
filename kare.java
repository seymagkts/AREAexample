public class kare extends sekil{
    private int kenar;

    public kare(String isim,int kenar){
        super(isim);
        this.kenar=kenar;
    }

    void alanHesapla(){
        System.out.println(getIsim()+" in alanı " +(kenar*kenar)+" dır");
    }
}
