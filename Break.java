public class Break {
    public static void main(String[] args) {

        //Break; digunakan untuk menghentikan alur code

        int a = 1;

        while (true) {
            System.out.println("Ini angka " + a);
            a++;

            if (a > 5) {
                break; //break digunakan untuk menghentikan Loop "a" yang tidak ada henti
            }
        }
    }
}
