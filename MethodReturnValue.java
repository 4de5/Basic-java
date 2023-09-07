public class MethodReturnValue {

    //digunakan untuk mengembalikan value ke fungsi/metode lagi
    //disini void DIGANTI dengan tipe data apa yang akan dikembalikan
    //

    public static void main(String[] args) {
        int c = sum(1,4);
        int a = sum(100,200);

        System.out.println(a);
    }

    static int sum(int value1, int value2){ //kita gunakan <sum> jika ingin memanggil
        int total = value1 + value2;
        return total; //sum dibuat --> total dibuat --> jadi total --> jadi sum --> dipanggil
    }

}
