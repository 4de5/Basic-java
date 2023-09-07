public class TernaryOperator {
    public static void main(String[] args) {
        //TERNARY adalah if else versi singkat
        //di dalam Ternary Statement terdapat kemungkina T/F
        //Bila hasilnya T maka Ternary Operator akan mencetak "case 1-Kiri"
        //Bila hasilnya F maka Ternary Opwerator akan mencetak "case 2-Kanan"
        //silahkan simak code berikut, SIMPULKAN Patternnya!

        String nama = "Asep";
        String ucapan = nama == "Asep" ? "Uhuuuy" : "Maaf ka salah orang";

        String nama2 = "Asep Dwi Saputra";
        String ucapan2 = nama2 == "Asep" ? "Uhuuuy" : "Maaf ka salah orang";

        System.out.println(ucapan);
        System.out.println(ucapan2);
    }
}
