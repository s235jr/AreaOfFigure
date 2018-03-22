public class Area {
    public static void main(String[] args) {

        String square = "15";           // a
        String reactangle = "10 20";    //a h
        String triangle = "12 18";      // a h
        String rhombusAH = "15 22";     // a h
        String rhombusDD = "13 17";   //d1 d2
        String deltoid = "15 25";       // d1 d2
        String trapeze = "12 8 12";      // a b h

        count(new Square(square));
        count(new Reactangle(reactangle));
        count(new Triangle(triangle));
        count(new RhombusAH(rhombusAH));
        count(new RhombusDD(rhombusDD));
        count(new Deltoid(deltoid));
        count(new Trapeze(trapeze));

    }

    public static void count(Figure value) {
        value.countArea();
    }
}
