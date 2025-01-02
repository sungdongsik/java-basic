package class1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleData rectangleData = new RectangleData();
        rectangleData.width = 5;
        rectangleData.height = 8;

        System.out.println("넓이: " + rectangleData.calculateArea());

        System.out.println("둘레 길이: " + rectangleData.calculatePerimeter());

        System.out.println("정사각형 여부: " + rectangleData.isSquare());
    }

}
