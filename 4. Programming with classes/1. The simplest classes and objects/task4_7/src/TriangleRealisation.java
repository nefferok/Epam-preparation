public class TriangleRealisation {
    public static void main(String[] args) {
        Triangle.Point pointA = new Triangle.Point(1,1);
        Triangle.Point pointB = new Triangle.Point(1,5);
        Triangle.Point pointC = new Triangle.Point(5,1);

        Triangle triangle1 = new Triangle(pointA, pointB, pointC);
        Triangle triangle2 = new Triangle(3, 1, 3, 7.5, 6, 1);

        System.out.println(triangle1.TriangleSq()); // area of triangle
        System.out.println(triangle2.TriangleSq());

        System.out.println(triangle1.perimeter());  // perimeter
        System.out.println(triangle2.perimeter());

        System.out.println((triangle1.mediana()).toString()); //coordinates of the median intersection
        System.out.println((triangle2.mediana()).toString());
    }
}
