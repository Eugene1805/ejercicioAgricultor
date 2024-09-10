public class Main {
    public static void main(String[] args) {

        Terreno t = new Terreno(100,100);
        System.out.println(t.areaEfectiva(10000));
        for(double i = 0.0; i < 100.0; ++i) {
            t.setPen((int)i, (int)Math.round(Terreno.inferior(i)), '*');
            t.setPen((int)i, (int)Math.round(Terreno.superior(i)), '*');
        }

        t.draw();
    }
}