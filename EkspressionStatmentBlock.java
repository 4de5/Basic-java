public class EkspressionStatmentBlock {

//    expression --> statment --> block

    public static void main(String[] args) {

        //EXPRESSION sebuah kode yang bernilai tunggal, komponen utama statment

        int a; // ini adalah ekspression
        a = 10; // ini adalah ekspression

        System.out.println(a = 100); //ini STATEMENT yang terdiri dari 2 expression
        //System.out.println(); ini expression
        //a = 100; ini expression

        //STATEMENT adalah kalimat lengkap bahasa dan diakhiri semicolon ";"
        //STATEMENT adalah kumpulan expression, seperti contoh di atas!

            //Assigment Statement
                int c = 10;
            //Increment Statement
                c++;
            //Method Invocation Statement
                System.out.println("Halo");
            //Object Creation Statement
                //Date date = new Date(); //akan dijelaskan saat OOP

        //BLOCK adalah sebuah grouping, kupulan 0 statement atau lebih
        //BLOCK diawali { dan diakhiri }
    }

}
