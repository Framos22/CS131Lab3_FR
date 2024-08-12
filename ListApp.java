package arraylist;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.addItem("Felix");
        stringList.addItem("Ramos");

        ArrayList<Square> squareList = new ArrayList<>();
        squareList.addItem(new Square(22.0));
        squareList.addItem(new Square(15.0));

        ArrayList<PointThreeD> pointList = new ArrayList<>();
        pointList.addItem(new PointThreeD(5.0, 9.0, 6.0));
        pointList.addItem(new PointThreeD(2.0, 7.0, 8.0));

        System.out.println("String List: " + stringList.toString());
        System.out.println("Square List: " + squareList.toString());
        System.out.println("Point List: " + pointList.toString());
    }
}

