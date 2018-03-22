public class Reactangle implements Figure {

    public int a;
    public int h;

    public Reactangle(String values) {
        String[] reactangle = values.split(" ");
        this.a = Integer.parseInt(reactangle[0]);
        this.h = Integer.parseInt(reactangle[1]);
    }

    public void countArea() {
        int area = this.a * this.h;
        System.out.println("Pole powierzchni prostokąta wynosi: " + area);
    }
}

