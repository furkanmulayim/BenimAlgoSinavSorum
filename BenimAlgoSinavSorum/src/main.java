
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        calistir();
        
        
        main m = new main();// private olan metoda direk erişemeyiz bu yüzden nesnesini oluşturduk.. 
        m.aracCalisti();
    }

    public static void calistir() {
        Scanner giris = new Scanner(System.in);

        System.out.print("Arabanın motor hacmini giriniz (500-10.000) : ");
        double mhacim = giris.nextDouble();
        int kg = 0;
        if (mhacim < 1601) {
            System.out.print("Arabanın ağırlığı kaç kgdir : ");
            kg = giris.nextInt();
        }

        System.out.print("Arabanın silindir sayısını giriniz : ");
        int ssayisi = giris.nextInt();

        System.out.print("Araba kaç beygir (hp) : ");
        int beygirs = giris.nextInt();

        System.out.print("Arabanın tork'u (nM): ");
        int torks = giris.nextInt();

        System.out.println("");
        car araba = new car(mhacim, ssayisi, beygirs, torks);
        double yakit;
        if (kg > 0) {
            yakit = araba.yakit(mhacim, ssayisi, beygirs, torks, kg);
        } else {
            yakit = araba.yakit(mhacim, ssayisi, beygirs, torks);
        }

        araba.kirlilik(yakit);

        aracOzellik ozellik = new aracOzellik(" 4 ", " genel arac ");
        ozellik.aracGenelOzellikleri();

        araba.infoGoster();

    }
    
    
    ///// fonksiyonun bir tanesi private olacak diye /////
    private void aracCalisti(){
        System.out.println("....araç çalıştı....");
    }

}
