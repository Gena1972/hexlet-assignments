package exercise;

public class App {
    public static void main(String[] args) {
        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        System.out.println(midPoint.getX());
        System.out.println(midPoint.getY());
        midPoint.getX(); // 5
        midPoint.getY(); // 2
    }
}
