package trycatch;

import java.lang.Exception;
class Parent {
    void msg() throws Exception {
        System.out.println("parent");
    }
}
public class TestTryCatch extends Parent {
    public void getException() {
        try {
            int a = 5;
            int b = a / 0; // Sẽ ném ra ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Co loi xay ra");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task2 is completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        } finally {
            System.out.println("finally");
        }

    }
    public void testThrow(int value) {
        try {
            if (value < 10) {
                throw new ArithmeticException("Loi");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public void testThrows(int value) throws ArithmeticException {
        if (value < 10) {
            throw new ArithmeticException("Loi");
        }
    }
    public void msg() throws Exception {
        System.out.println("child");
    }
}
