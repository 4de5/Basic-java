public class SwitchYield {
    //yield -> hasil
    //digunakan untuk mempermudah dalam memanggil variabel di Switch statement
    //syarat minimal java v14

    public static void main(String[] args) {

        //cara biasa
        String nama = "Putra";
        String ucapan;

        switch (nama){
            case "Putra" -> ucapan = "Uhuuuy";
            case "Asep" -> ucapan = "Lah ini gw";
            default -> ucapan = "Maap salah orang";
        }
        System.out.println(ucapan);


        //cara YIELD
        ucapan = switch (nama){
            case "Putra": yield "Uhuuuy"; //ingat untuk menggunakan ": yield"
            case "Asep": yield "Lah ini gw";
            default: {
                yield "Maap salah orang"; //bisa juga menggunakan block untuk statement yang panjang
            }
        }; //HATI-HATI setiap statement perlu menambahkan semicolon ";"
        System.out.println(ucapan);
    }
}
