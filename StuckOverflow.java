public class StuckOverflow {

    //Kondisi dimana method di ulang terlalu dalam sehingga membebani memory dan terjadi eror
    //FaktorialRecursive

    public static void main(String[] args) {

        loop(10000); //terlalu dalam Eror stuck

    }

    static void loop(int nilai){
        if (nilai == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop "+nilai);
            loop(nilai - 1);
        }
    }

}
