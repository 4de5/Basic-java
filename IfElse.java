public class IfElse {
    public static void main(String[] args) {
        //If Else adalah kode yang digunakan untuk pengkondisian

        String nama = "Asep";
        String alamat = "Indo";
        Boolean kenalSaya = true;

        //IF
        if (nama == "Irma"){
            System.out.println("Kamu Baik"); //apabila kondisi terpenuhi maka akan di cetak
        }

        //IF-ELSE
        if (nama == "Asep" && alamat == "Indo"){
            System.out.println("Kamu Baik");
        } else { //else harus berada di luar block dari IF atasnya
            System.out.println("Kamu Siapa?");
        };

        //IF-ELSE IF
        if (nama == "Asep" && alamat == "Indo" && kenalSaya == true){
            System.out.println("Kamu Baik");
        } else if (nama == "Asep" && alamat == "Indo" && kenalSaya == false) {
            System.out.println("Salam kenal ka");
        } else { //else harus berada di luar block dari IF atasnya
            System.out.println("Kamu Siapa?");
        };
    }
}
