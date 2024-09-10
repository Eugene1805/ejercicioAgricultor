public class Terreno extends Lienzo{

    private  double alto;
    private  double ancho;

    public Terreno(double alto, double ancho) {
         this.ancho = ancho;
         this.alto = alto;
         paintTerreno();
    }

    private void paintTerreno(){
        for(int x = 0; x < ancho; x++){
            setPen(x, (int) superior(x), '*');
            setPen(x, (int) inferior(x), '*');
        }
    }

    public static double inferior(double x) {
        return 50.0 + 5.0 * Math.cos(x / 10.0) * Math.sin(x / 15.0);
    }

    public static double superior(double x) {
        return 70.0 + 8.0 * Math.sin(x / 35.0) * Math.cos(x / 20.0);
    }

    public static double sobrante(double x) {
        return superior(x) - inferior(x);
    }

    public  double areaEfectiva(int p) {
        return (ancho * alto) - Reimann.reimann(0.0, ancho, p, this);
    }
}
