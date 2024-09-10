public class Lienzo {
    protected int size = 100;
    protected char[][] lienzo;

    public Lienzo() {
        this.lienzo = new char[this.size][this.size];
        this.clean(this.size);
    }

    public void clean(int size) {
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                this.lienzo[i][j] = ' ';
            }
        }

    }

    public void setPen(int x, int y, char c) {
        if (x >= 0 && y < this.size) {
            this.lienzo[this.size - 1 - y][x] = c;
        }
    }

    public void draw() {
        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                System.out.print(this.lienzo[i][j]);
            }

            System.out.println('\n');
        }

    }
}
