package ro.siit.calculator;

import org.junit.jupiter.api.*;

import java.util.Random;

public class CalculatorTest{

    private static Calculator calculator;
    private static Random randomizer;
    private static double op1;
    private static double op2;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
        randomizer = new Random();
        op1 = randomizer.nextDouble();
        op2 = randomizer.nextDouble();
    }

    @Test
    public void testAdditionWorks(){
        double additionResult = calculator.addition(op1, op2);
        Assertions.assertEquals(op1 + op2, additionResult, 0.0000001, "Addition is failing");
    }

    @Test
    public void testSubtractionWorks(){
        double subtractionResult = calculator.subtraction(op1, op2);
        Assertions.assertEquals(op1 - op2, subtractionResult, 0.0000001, "Addition is failing");
    }

    @Nested
    class NestedCalcTest{
        @BeforeEach
        public void init(){
            do {
                op2 = randomizer.nextDouble();
            } while (op2 == 0);
        }
        @Test
        public void testDivisionWorks(){
            double subtractionResult = calculator.division(op1, op2);
            Assertions.assertEquals(op1 / op2, subtractionResult, 0.0000001, "Addition is failing");
        }
    }

}
