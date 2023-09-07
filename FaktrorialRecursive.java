public class FaktrorialRecursive {
    //deskripsi bisa di cek di file Recursive Method
    public static void main(String[] args) {

        System.out.println(faktorial(2));

    }

    static int faktorial(int angka){
        if (angka == 1){
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}
