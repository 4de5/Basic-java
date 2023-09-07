public class SwitchLambda {
    //Lambda "-> {}"
    //cara menulis Switch dengan versi simpel
    //minimal java v14

    public static void main(String[] args) {

        String nama = "Putra";

        switch (nama){
            case "Putra" -> System.out.println("Uhuuuy");
            case "Asep" -> System.out.println("Ini gw njir");
            default -> System.out.println("Salah orang maaf");
        }

    }

}
