public class Variabel {
    public static void main(String[] args) {

        String name;
        name = "Asep Dwi Saputra";

        System.out.println(name);

        int age=16;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        //apabila ingin mengubah variabel nama kita bisa tulis ulang
        //karena Java di run dari atas -> bawah, jadi kode dibawah akan mengupdate
        //mengupdate kode yang ada di atasnya
        name = "putra";

        System.out.println(name);
    }
}
