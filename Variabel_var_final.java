public class Variabel_var_final {
    public static void main(String[] args) {
        //var digunakan untuk membuat variabel yang bisa diubah-ubah isinya
        //kelebihannya kita ga perlu repot  menuliskan tipe data
        //syarat penggunaan--> harus langsung memberi nilai pada variabel
        //syarat penggunaan-->java minimal v10
        var nama = "Asep";
        System.out.println(nama);

//        var age; //eror
//        age=17;
//          System.out.println(age);

        //kita akan meng-update data nama alias merubahnya
        nama = "putra";
        System.out.println(nama);

//        sekarang kita bedakan dengan variabek final
//        ternyata kita harus menentukan tipe data juga
        final String alamat = "Indonesia";
        System.out.println(alamat);
    }
}
