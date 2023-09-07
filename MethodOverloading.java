public class MethodOverloading {
    //artinya method yang bernama sama digunakan lagi
    //ini tidak masalah, dengan S&K
        //parameter tiap method BERJUMLAH atau BERJENIS berbeda

    public static void main(String[] args) {
        sayHello();
        sayHello("Asep");
        sayHello("Asep", "Indo");
        sayHello("Asep", 16);
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String nama){
        System.out.println("Hello " + nama);
    }

    static void sayHello(String nama, String alamat){
        System.out.println("Hello " + nama + ", anak " + alamat);
    }

    static void sayHello(String nama, int angka){
        System.out.println("Hello " + nama + ", nomer " + angka);
    }
}
