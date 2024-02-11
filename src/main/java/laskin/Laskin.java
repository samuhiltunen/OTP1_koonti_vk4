package laskin;

public class Laskin {

    private double tulos;  // Change the type to double

    public void nollaa() {
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos += n;
    }

    public void vahenna(double n) {
        tulos -= n;
    }

    public void kerro(int n) {
        tulos *= n;
    }

    public void kerro(double n) {
        tulos *= n;
    }

    public void jaa(double n) {
        if (n == 0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos /= n;
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if (n < 0) throw new ArithmeticException("Negatiivisella luvulla ei ole neliöjuurta");
        tulos = Math.sqrt(n);
    }

    public void virtaON() {
        // Initialization steps
        tulos = 0;
    }

    public void virtaOFF() {
        // Cleanup steps
    }
}
