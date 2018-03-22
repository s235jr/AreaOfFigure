public class Triangle implements Figure {

    public int a;
    public int h;

    public Triangle(String values) {
        String[] triangle = values.split(" ");
        this.a = Integer.parseInt(triangle[0]);
        this.h = Integer.parseInt(triangle[1]);
    }

    public void countArea() {
        int area = this.a * this.h / 2;
        System.out.println("Pole powierzchni trójkąta wynosi: " + area);
    }
}
