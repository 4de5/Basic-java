public class Scope {

    //di Java variabel hanya bisa diakses di dalam area yang di buat --> Scope
    //Di JS --> Parents --> Scope utama biasanya di block method
    //Di JS --> Child --> Sub bab/anak Scope/sub Block/sub Bracket dari Scope Utama

    public static void main(String[] args) {

        String ucap = "Halo, Gess";
        System.out.println(ucap); //program ini berada dan dipanggil di Scope Utama

        CobaScope(""); //blank name

    }

    static void CobaScope(String nama){
        String panggil = "Halo gess"; //variabel berada di scope utama
        if (nama.isBlank()){
            String tanya = "Maaf nama kamu siapa?"; //variabel berada di sub scope
            System.out.println(tanya); //kita coba panggil variabel di 1 scope ini
            System.out.println(panggil); //kita coba panggil dari parents scope
        }

        System.out.println(panggil);
        //System.out.println(tanya); //variabel di panggil dari luar Scope //EROR
    }
}
