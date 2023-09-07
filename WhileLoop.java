public class WhileLoop {
    public static void main(String[] args) {
        //seperti for loop tapi tak ada init statement dan post statement
        int i = 1; //init Statement

        while (i <= 3){ //kondisi
            System.out.println(i + "-" + i + " Aku Sayang Kamu "); //salah 1 statement dalam block kode

            i++; //post statement
        }
        System.out.println("1, 2, 3 Aku Sayang Kamu");
    }
}