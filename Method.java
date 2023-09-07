public class Method {

    //Method --> sebuah cara menggunakan sebuah fungsi code secara berulang --> Reusable
    //DI JAVASCRIPT disebut Function
    //println juga termasuk method
    //kebiasaan orang java --> awal nama kecil lanjutnya besar(sayHelloWorld)
    //Cara Pake --> void <nama method>(<tipe data>parameter1, <tipe data>parameter2, ... atau kosong){}
    //tiap parameter DIAWALI dengan tipe data kemudian DIAKHIRI dengan koma untuk memisah antar parameter
    //kalo tempat memanggil pake STATIC, sebelum void <nama Method> juga pake STATIC --> lanjut OOP

    public static void main(String[] args) { //Pake STATIC void

        sayHello(); //Kita coba memanggil fungsi/metode sayHello
        sayHai("Asep Dwi Saputra");

    }

    static void sayHello(){ //METHOD sayHello dengan awalan STATIC karena diatasnya pake STATIC
        System.out.println("Halo, gimana kabarnya?");
    }

    //Method PARAMETER
    static void sayHai(String nama){ //nama adalah parameter1
        System.out.println("Halo " + nama +", gimana kabarnya?");
    }

    //parameter lebih banyak bisa di improf
}
