public class UnaryOperator {
    // ! --> kebalikan (NOT)
    // ++ --> menambah +1 pada data variabel
    // -- ---> mengurangi -1 pada data variabel
    // + --> deklarasi data positif
    // - --> deklarasi data negatif

    public static void main(String[] args) {
        int a = +100;
        int b = -10;
        System.out.println(a);
        System.out.println(b);

        a++;
        System.out.println(a); //100=+1

        a--;
        System.out.println(a); //101-1

        System.out.println(!true); //false
    }
}
