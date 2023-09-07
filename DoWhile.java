public class DoWhile {
    public static void main(String[] args) {
        //hampir sama dengan While, namun ada pengecekan kondisi
        //minimal ada 1 kali loop, KARENA
        //DoWhile --> kondisi dilakukan setelah Loop

        int angka = 1;

        do{
            System.out.println("Ini angka " + angka);
            angka++;
        } while (angka <= 5);
    }
}
