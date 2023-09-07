public class MembuatArray {
    //array bisa diibaratkan sebagai sebuah kotak-kotak
    public static void main(String[] args) {

//        cara membuat array
                String[] arrayNama;
                arrayNama = new String[3];
                arrayNama[0] = "Asep";
                arrayNama[1] = "Dwi";
                arrayNama[2] = "Saputra";
                    System.out.println(arrayNama[0]);
                    System.out.println(arrayNama[1]);
                    System.out.println(arrayNama[2]);

                int[] arrayAngka = new int[]{
                        1,2,3,4,5
                };
                    System.out.println(arrayAngka[0]);
                    System.out.println(arrayAngka[1]);
                    System.out.println(arrayAngka[2]);

                long[] arrayLong = {
                        10L, 20L, 30L
                };
                    System.out.println(arrayLong[0]);
                    System.out.println(arrayLong[1]);
                    System.out.println(arrayLong[2]);

//       cara mengubah nilai array
                arrayNama[0] = "Putra"; //isi diubah dari Asep --> Putra
                    System.out.println(arrayNama[0]);

//         cara mengetahui atau menghitung berapa jumlah isi dari array
//         isi array berarti total kotak
//         index adalah cara membaca array, dimulai dari 0 untuk kotak ke-1
//         index = total length - 1
                System.out.println(arrayAngka.length); //arrayAngka ada 5 kotak

//        menghapus array
//                di java tidak ada cara menghapus array
//                karena saat dibangun rumah sudah fix ada berapa kamar
//                cara yang mungkin digunaka adalah MENGOSONGKAN array
//                null untuk data Nonprimitif, 0 untuk Primitif
                arrayNama[0] = null; //Putra sudah dihilangkan
                arrayAngka[0] = 0; //1 dirubah menjadi 0
                    System.out.println(arrayAngka[0]); //0
                    System.out.println(arrayNama[0]); //null
    }
}
