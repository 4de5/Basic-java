public class ForEach {
    public static void main(String[] args) {

        //ForEach adalah perulangan yang digunakan untuk mengakses SELURUH array

        String names[] = {
                "Asep", "Dwi", "Saputra"
        }; //TUTUP karena ini sebuah Statement

        //TANPA ForEach

        for (int a = 0; a < names.length; a++){
            System.out.println(names[a]); //mencetak seluruh indeks a, yang sesuai dengan Loop
        }

        //DENGAN ForEach
        for (String nama : names){ //nama adalah amggota dari nama-nama
            System.out.println(nama); //print --> nama --> anggota dari nama-nama
        }
    }
}
