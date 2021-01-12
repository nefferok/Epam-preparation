

public class Triangle {
    public Point point1;
    public Point point2;
    public Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
    }

    public double TriangleSq(){
        return Math.abs(((point2.x - point1.x) * (point3.y - point1.y))
                - ((point3.x - point1.x) * (point2.y - point1.y)))/2;
    }

    public double sideLength (Point point1, Point point2){
       return Math.sqrt(Math.pow((point1.x-point2.x),2)+Math.pow((point1.y-point2.y),2));
    }

    public double perimeter(){
        return sideLength(point1, point2)+sideLength(point2, point3) +sideLength(point3, point1);
    }

    public Point mediana(){
        double x_m = (point1.x + point2.x + point3.x)/3;
        double y_m = (point1.y + point2.y + point3.y)/3;
        return new Point(x_m, y_m);
    }


    static class Point{
        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{x=" + x + ", y=" + y + '}';
        }
    }
}
