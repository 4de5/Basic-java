public class DataPrimitifNonPrimitif {
    //data primitif adalah daya yang akan memiliki nilai meski tak di deklarasikan
    //contoh boolean akan bernilai 0 ketika tak diisi
    //data non primitif akan bernilai null ketika tidak dideklarasi
    //data non P. biasanya diawali huruf besar, String Integer Long
    public static void main(String[] args) {
        //di java setiap data primitif memiliki pasangan data non primitif
        //int --> Integer //char --> Character //boolean --> Boolean
        //long --> Long //double --> Double
        //byte --> Byte //float --> Float

        int a = 100;
        Integer a2 = a;
        
        System.out.println(a2);
        System.out.println(a);

        //sekarang kira coba ubah ke tipe byte dan Byte
        byte b = a2.byteValue();
        Byte b2 = b;

        System.out.println(b);
        System.out.println(b2);

        //sekarang kita coba proses cor atau casting seperti baris 18
        int angka = 200;
        byte angka2 = (byte) angka;

        System.out.println(angka);
        System.out.println(angka2);

        //hati-hati apabila kita menurunkan tipe data, bisa terjadi pengisian ulang karena tipe data
        //tidak sanggup menampung semua data yang ada
        //cek di hasil run kode di atas
    }
}
