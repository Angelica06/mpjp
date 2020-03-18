package s034;

public class Simple {
    public static String h() { //il metodo h posso chiamarlo anche senza chiamarlo
        return "Hi"; //metodo statico
    }

    /*static*/ int f(int a, int b) {//metodo a istanza, potrei mettere tutto statico
        return a * b;
    }

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
}