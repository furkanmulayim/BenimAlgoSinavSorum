
public class car {

    // MOTOR HACMİ--- ÖZELLİK 1.--- (PRİVATE ERİSİM BELİRLEYİCİSİ)/////
    private double motorHacmi;

    public void setMotor(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public double getMotor() {
        return motorHacmi;
    }

    // SİLİNDİR SAYISI ---ÖZELLİK 2.--- (PRİVATE)/////
    private int silindirSayisi;

    public void setSilindirSayisi(int silindirSayısı) {
        this.silindirSayisi = silindirSayısı;
    }

    public int getSilindirSayisi() {
        return silindirSayisi;
    }

    // BEYGİR GÜCÜ ---ÖZELLİK 3.--- (PRİVATE)/////
    private int beygir;

    public void setBeygir(int beygir) {
        this.beygir = beygir;
    }

    public int getBeygir() {
        return beygir;
    }

    // TORK GÜCÜ ---ÖZELLİK 4.--- (PRİVATE)/////
    private int tork;

    public void setTork(int tork) {
        this.tork = tork;
    }

    public int getTork() {
        return tork;
    }

    //////////// 1600CC DEN BÜYÜK MOTORUN NE KADAR YAKTIĞI (METOD 1.) /////
    public double yakit(double mhacmi, int ssayisi, int beygir, int torkk) {
        double yakits;
        yakits = ((beygir * tork) / (mhacmi * ssayisi)) / 5;
        String a = String.valueOf(yakits);
        yakits = Double.valueOf(a.substring(0, 4));
        System.err.println("1 km yaktığı yakıt: " + yakits + "tldir.");
        return yakits;
    }

    //////////// 1600CC DEN KÜÇÜK MOTORUN NE KADAR YAKTIĞI(METOD 2.) - OVERLOADİNG - /POLYMORPHİZM/  /////
    public double yakit(double mhacmi, int ssayisi, int beygir, int tork, int kg) {
        double yakits;
        yakits = (((beygir * tork) / (mhacmi * ssayisi)) / 5) - (108 / kg);
        String a = String.valueOf(yakits);
        yakits = Double.valueOf(a.substring(0, 4));
        System.err.println("1 km yaktığı yakıt: " + yakits + " tl'dir.");
        return yakits;

    }

    //////////// HAVAYI NE KADAR KİRLETTİĞİ (METOD 3.) /////
    public void kirlilik(double yakit) {
        double kirlilik = yakit * 9.23;
        String a = String.valueOf(kirlilik);
        kirlilik = Double.valueOf(a.substring(0, 4));
        System.err.println("Aracınız Havayı %" + kirlilik + " oranında kirletiyor..");
    }

    ///////CONSTRUCTOR ////////,
    public car(double motorHacmi, int silindirSayisi, int beygir, int tork) {
        this.motorHacmi = motorHacmi;
        this.silindirSayisi = silindirSayisi;
        this.beygir = beygir;
        this.tork = tork;

    }

    public void infoGoster() {
        System.out.println("arabanızın motor hacmi : " + this.motorHacmi);
        System.out.println("arabanızın silindir sayısı : " + this.silindirSayisi);
        System.out.println("arabanızın beygir gücü : " + this.beygir);
        System.out.println("arabanızın tork gücü : " + this.tork);
    }

    // INHERITANCE --- MİRAS ALMA --- ( KALITIM İÇİN KULLANACAĞIZ ) ///////////////////////////////
    public String tekerlekSayisi;
    private String aracTipi;

    public car(String tekerlekSayisi, String aracTipi) {
        this.tekerlekSayisi = tekerlekSayisi;
        this.aracTipi = aracTipi;
    }

    public void aracGenelOzellikleri() {
        System.out.println("arac tipi : " + this.aracTipi);
        System.out.println("tekerlek sayısı : " + this.tekerlekSayisi);
    }

}
