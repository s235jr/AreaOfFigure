public class RhombusDD implements Figure {

    public int d1;
    public int d2;

    public RhombusDD(String values) {
        String[] rhombus = values.split(" ");
        this.d1 = Integer.parseInt(rhombus[0]);
        this.d2 = Integer.parseInt(rhombus[1]);
    }

    public void countArea() {
        int area = this.d1 * this.d2 / 2;
        System.out.println("Pole powierzchni rombu wynosi: " + area);
    }
}

