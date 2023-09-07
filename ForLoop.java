public class ForLoop {
    public static void main(String[] args) {
        //for(init statement; kondisi; post statement){block perulangan}
        //init statement --> akan dibaca dan digunakan sekali di awal
        //kondisi --> dijalankan selagi kondisi bernilai T
        //post statement --> dijalankan di akhir setelah kondisi dan block perulangan dijalankan

        //Cara 1
        int angka = 1; //sebenaarnua init statement tidak wajib diisi, tergantung penggunaan
        for ( ; angka <= 5; ) {
            System.out.println("Ini Angka " + angka);
            angka++; //sebenarnya post statement tidak wajib diisi,
                    // jika memang tak ada keperluan di akhir loop
                    // jika Kondisi tak diisi maka akan di anggap TRUE
        }

        //Cara 2
        for (int nomer = 1; nomer <= 5; ) {
            System.out.println("Ini Nomer " + nomer);
            nomer++;
        }


        //Cara 3 - Paling Umum dan Sering dipake
        for (int a = 1; a <= 5; a++) {
            System.out.println("Halo ges " + a);
        }

        //Percobaan
        for (;;){
            System.out.println("Ini Percobaan"); //unlimited loop
        }
    }
}
