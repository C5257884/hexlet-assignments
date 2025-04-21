package exercise;

// BEGIN
class Circle {
    Point center;
    int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    int getRadius() {
        return radius;
    }
    double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return Math.PI * radius * radius;
    }


}
// END
