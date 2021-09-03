import java.util.Scanner;
public class main {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);

        String secenek="Cıkıs icin q'ya basın\n"+
                       "1-Kare alanı hesaplama\n"+
                       "2-Ucgen alanı hesaplama\n" +
                       "3-Daire alanı hesaplama";

        System.out.println(secenek);


        while(true){
            System.out.println("--------------------------------");
            System.out.println("Bir islem seciniz: ");
            String islem=scanner.nextLine();
            sekil sekil=null;

           if(islem.equals("q") ){
               System.out.println("Uygulama sonlanıyor...");
               break;
           }
            else if(islem.equals("1")){

                System.out.println("Bir kenar değeri giriniz: ");
                int kenar=scanner.nextInt();
               scanner.nextLine();
                sekil=new kare("kare1",kenar);
                sekil.alanHesapla();
            }
            else if(islem.equals("2")){
               System.out.println("A değeri giriniz: ");
               int a1=scanner.nextInt();
               System.out.println("B değeri giriniz: ");
               int b1=scanner.nextInt();
               System.out.println("C değeri giriniz: ");
               int c1=scanner.nextInt();
               scanner.nextLine();
               sekil=new ucgen("ucgen1",a1,b1,c1);
               sekil.alanHesapla();

            }
            else if(islem.equals("3")){
               System.out.println("Yarıcap giriniz: ");
               int r=scanner.nextInt();
               scanner.nextLine();
               sekil=new daire("daire1",r);
               sekil.alanHesapla();
           }
            else{
               System.out.println("Gecersiz islem");
           }
        }

    }
}
