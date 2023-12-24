package models;

import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> point;
    public Shape() {
        this.point = new ArrayList<>();
    }
    public void addPoint(Point point) {
        point.add(point);
    }

    public double perimeter() {
        double perimeter = 0.0;
        int numPoints = point.size();

        for (int i = 0; i < numPoints; i++) {
            Point currentPoint = point.get(i);
            Point nextPoint = point.get((i + 1) % numPoints); // Connects the last point with the first point

            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }
    public double averageSide() {
        double totalLength = 0.0;

        for (int i = 0; i < point.size(); i++) {
            Point currentPoint = point.get(i);
            Point nextPoint = point.get((i + 1) % point.size()); // Connects the last point with the first point

            totalLength += currentPoint.distanceTo(nextPoint);
        }

        return totalLength / point.size();
    }

    public double longestSide() {
        double longestSide = 0.0;

        for (int i = 0; i < point.size(); i++) {
            Point currentPoint = point.get(i);
            Point nextPoint = point.get((i + 1) % point.size()); // Connects the last point with the first point

            double sideLength = currentPoint.distanceTo(nextPoint);
            longestSide = Math.max(longestSide, sideLength);
        }

        return longestSide;
    }

}