package edu.dmacc.codedsm.hw5;

public class Calculator {
    public static void main(String[] args) {
        int number = 27;
        double squareRoot = Math.sqrt(number);

        double a = 28.0;
        double b = 5.0;
        double round = Math.round(a / b);
        double mathFloor = Math.floor(a / b);

        int random = (int) (Math.random() * 10 + 1);

        double pow = Math.pow(2.2, 4);

        System.out.println("number : " + number);
        System.out.println("Square Root : " + squareRoot);

        System.out.println("division : " + (a / b));
        System.out.println("Division Rounded up : " + round);
        System.out.println("Division rounds down : " + mathFloor);

        System.out.println("2.2 to the 4th power : " + pow);

        System.out.println("Random int : " + random);


    }
}
