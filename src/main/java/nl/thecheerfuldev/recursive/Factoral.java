package nl.thecheerfuldev.recursive;

public class Factoral {

    public long fac(final int n) {
        if (n == 1) {
            return 1L;
        }
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        Factoral bla = new Factoral();
        bla.fac(1);
    }

}
