package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;


@DisplayName("TDD shape collector test suite")
public class ShapeCollectorTestSuite {

    private static int testsCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Finished all tests");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testsCounter++;
        System.out.println("Executing test #" +testsCounter);
    }
    @Nested
    @DisplayName("Testing shape collector")
    class ShapeTester {

        @Test
        void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square();
            //when
            shapeCollector.addFigure(square);
            //then
            Assertions.assertEquals(1, shapeCollector.getCollectionSize());

        }

        @Test
        void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //when
            shapeCollector.removeFigure(triangle);
            //then
            Assertions.assertEquals(2, shapeCollector.getCollectionSize());
        }

        @Test
        void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //when
            Shape shape = shapeCollector.getFigure(2);
            //then
            Assertions.assertEquals(triangle, shape);
        }

        @Test
        void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Square square = new Square();
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //then
            shapeCollector.showFigures();
        }

    }
}
