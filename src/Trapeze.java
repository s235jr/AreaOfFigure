public class Trapeze implements Figure {

    public int a;
    public int b;
    public int h;

    public Trapeze(String values) {
        String[] trapeze = values.split(" ");
        this.a = Integer.parseInt(trapeze[0]);
        this.b = Integer.parseInt(trapeze[1]);
        this.h = Integer.parseInt(trapeze[2]);
    }

    public void countArea() {
        int area = (this.a + this.b) * this.h / 2;
        System.out.println("Pole powierzchni trapeza wynosi: " + area);
    }
}

