package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distance = origin.distanceFrom(origin);

        assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);

        double distance1 = origin.distanceFrom(point1);

        assertEquals(1, distance1);


        Point point2 = new Point(0, 1);

        double distance2 = origin.distanceFrom(point2);

        assertEquals(1, distance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distance = point1.distanceFrom(point2);

        assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        assertEquals(0, origin.direction(point1));
        assertEquals(0, origin.direction(point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        assertEquals(Math.PI, origin.direction((point1)));
        assertEquals(Math.PI, origin.direction((point2)));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        assertEquals(Math.PI / 2, origin.direction(point1));
        assertEquals(Math.PI / 2, origin.direction(point2));
    }
}
