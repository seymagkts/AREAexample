public class ucgen extends sekil{
    int a, b, c;

     public ucgen(String isim, int a, int b, int c){
         super(isim);
         this.a=a;
         this.b=b;
         this.c=c;
     }
     void alanHesapla(){
          double f=(a+b+c)/2.0;
          double alan=Math.sqrt(f * (f-a) * (f-b) * (f-c));

         System.out.println(getIsim()+" in alanı "+alan+" dır");
      }

}
