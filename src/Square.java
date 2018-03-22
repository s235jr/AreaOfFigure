public class Square implements Figure {

   public int a;

    public Square(String values) {
        String[] squere = values.split(" ");
        this.a = Integer.parseInt(squere[0]);
    }

    public void countArea () {
        int area = this.a*this.a;
        System.out.println("Pole powierzchni kwadratu wynosi: " + area);
    }
}
