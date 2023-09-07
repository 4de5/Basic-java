public class OperasiBoolean {
    //operasi untuk membandingkan dua buah data berjenis true/false

    // && --> And
    // || --> Or
    // ! --> Not

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        System.out.println(a && b); //true
        System.out.println(a || b); //true
        System.out.println(!a); //false

        int KKM = 75;
        int nilaiTugas = 86;
        int nilaiAbsen = 90;

        boolean lulus = nilaiAbsen >= KKM && nilaiTugas >= KKM;

        if (lulus){
            System.out.println("Kamu Lulus");
        };
    }
}
