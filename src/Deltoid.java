public class Deltoid implements Figure {

    public int d1;
    public int d2;

    public Deltoid(String values) {
        String[] deltoid = values.split(" ");
        this.d1 = Integer.parseInt(deltoid[0]);
        this.d2 = Integer.parseInt(deltoid[1]);
    }

    public void countArea() {
        int area = this.d1 * this.d2 / 2;
        System.out.println("Pole powierzchni deltoidu wynosi: " + area);
    }
}

