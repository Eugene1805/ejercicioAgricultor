public class Reimann {
    public static double reimann(double xInicial, double xFinal, int numeroDePasos, Terreno t) {
        double resultado = 0.0;
        double incremento = (xFinal - xInicial) / (double)numeroDePasos;
        double semiIncremento = incremento / 2.0;
        double x = xInicial;

        for(int i = 0; i < numeroDePasos; ++i) {
            resultado += incremento * Terreno.sobrante(x + semiIncremento);
            x += incremento;
        }

        return resultado;
    }
}
