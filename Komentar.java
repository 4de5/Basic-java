class Komentar {

    //ini Komentar pake //

    /**
     *
     *
     * ini komentar pake (/** ... *garing)
     */





    public static void main(String[] args) {
        int a = 0;
        System.out.println(a++);
        System.out.println(++a);

        ////////////////////////////////////////////////////////////////

        int x = 1;

        System.out.println("Nilai x awal: " + x); // 1

        // Menggunakan postfix increment
        System.out.println("Nilai x dengan postfix increment: " + x++); // 1

        // Nilai x sudah bertambah setelah postfix increment sebelumnya
        System.out.println("Nilai x setelah postfix increment: " + x); // 2

        // Menggunakan prefix increment
        System.out.println("Nilai x dengan prefix increment: " + ++x); // 3

        // Nilai x sudah bertambah setelah prefix increment sebelumnya
        System.out.println("Nilai x setelah prefix increment: " + x); //3
    }

}
