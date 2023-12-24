import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\agent\\IdeaProjects\\untitled\\src\\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.perimeter());
        System.out.println(shape.longestSide());
    }
}