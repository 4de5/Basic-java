public class Switch {
    public static void main(String[] args) {
        //ini hampir sama dengan IF Statement tapi untuk pengkondisian == (samadengan), mksudnya bernilai true
        String nama = "Asep";

        switch (nama){ //nama ini sebagai acuan komputer menentukan nilai T/F
            case "Asep":
                System.out.println("Uhuuuy");
                break; //pake break biar kodenya ga kebablas ke bawah
            case "Dwi": //kalo case ini sesuai maka program akan dicetak
                System.out.println("Lah kok");
                break;
            default: //kalo program tidak ada yang cocok maka ini yang dicetak
                System.out.println("Kayanya aku salah orang");
        }
    }
}
