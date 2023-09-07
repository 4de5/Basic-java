public class Continue {
    public static void main(String[] args) {

        //continue --> SKIP
        //continue; digunakan untuk menghentikan alur code secara sementara,
        //tidak seperti break yang langsung menghentikan
        //continue bisa dibilang mem-pouse code yang sedang berjalan

        for (int a = 1; a <=10; a++){
            if (a == 3){
            continue; //pada Loop ke-3 code dihentikan, lalu di Loop ke-4 akan dilanjurkan
            }
            System.out.println("Ini angka " + a);
        }


        for (int b = 0; b <= 100; b++){
            if (b % 2 == 0){ //bila b habis dibagi 2, maka SKIP
                continue;
            }
            System.out.println("Ini angka " + b); //disini akan dicetak b, yang tidak habis dibagi 2
        }
    }
}
