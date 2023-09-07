public class RecursiveMethod {

    //Recursive Method adalah method yang digunakan secara berulang
    //apa bila RAM tidak kuat untuk menampung Loop Method yang berulang maka akan EROR StuckOverflow

    public static void main(String[] args) {

        System.out.println(falktorial(3));
        System.out.println(faktorialRecursive(3));
    }

    //Cara biasa --> FAKTORIAL LOOP
    static int falktorial(int angka){
        int result = 1;

        for (int i=1; i <= angka; i++){
            result *= i;
        }
        return result;
    }

    //FAKTORIAL RECURSIVE
        //faktorial recursive didunakan untuk membuat method di dalam method, sering digunakan untuk
        //membuat fungsi yang digunakan dalam fungsi atau masih dalam 1 block
    static int faktorialRecursive(int angka){
        if (angka == 1){
            return 1;
        } else {
            return angka * faktorialRecursive(angka -1);
        }
    }
}
