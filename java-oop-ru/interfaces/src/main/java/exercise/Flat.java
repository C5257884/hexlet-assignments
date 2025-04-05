package exercise;

// BEGIN
//import java-oop-ru.

class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public boolean compareTo(Flat obj1, Flat obj2) {
        return false;
    }

    @Override
    public String toString() {
        return "Квартира площадью " +
            getArea() + " метров на " + floor + " этаже";
    }
}
// END
