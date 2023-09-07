public class MethodVariableArgument {
    //digunakan untuk menyederhanakan array yang nanti akan dipanggil dan dibuat di method
    public static void main(String[] args) {

        //TANPA Method Variable Argument
        int[] nilaiNilai = {30, 100, 100}; //disini Bedanya
        wisuda("Irma", nilaiNilai);

        //DENGAN Method Variable Argument
        wisudaKapan("Budi", 76,78, 90, 100, 27, 100); //disini Bedanya
    }

    //TANPA Method Variable Argument
    static void wisuda(String nama, int[] nilaiNilai){ //di parameter2 bedanya
        int totalNilai = 0;
        for (int nilai : nilaiNilai){
            totalNilai += nilai;
        }
        int finalNilai = totalNilai/nilaiNilai.length;

        if (finalNilai >= 75){
            System.out.println("Selamat " + nama + ", Kamu Lulus");
        } else {
            System.out.println("Tetap Semangat " + nama + ", Kamu kurang beruntung");
        }
    }

    //DENGAN Method Variable Argument
    static void wisudaKapan(String nama, int... semuaNilai){ //di parameter2 Bedanya
        int total = 0;
        for (int nilainya : semuaNilai){
            total += nilainya;
        }
        int ratarata = total/semuaNilai.length;

        if (ratarata >= 75){
            System.out.println("Selamat " + nama + ", Kamu Lulus");
        } else {
            System.out.println("Tetap Semangat " + nama + ", Kamu kurang beruntung");
        }
    }
}
