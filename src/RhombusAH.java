public class RhombusAH implements Figure {

    public int a;
    public int h;

    public RhombusAH(String values) {
        String[] rhombus = values.split(" ");
        this.a = Integer.parseInt(rhombus[0]);
        this.h = Integer.parseInt(rhombus[1]);
    }

    public void countArea() {
        int area = this.a * this.h;
        System.out.println("Pole powierzchni rombu wynosi: " + area);
    }
}

