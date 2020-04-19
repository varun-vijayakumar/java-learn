package com.lambda.unit1;

public class Learn {

    public void greeter() {
        System.out.println("Hello world! this is lambda");
    }

    public void printStringLenghtLambda(MyLambdaString lambda, String s) {
        System.out.print(s+" :");
        System.out.println(lambda.numChars(s));
    }

    /*public static void main(String... args) {
        Learn test = new Learn();
        test.greeter();

        MyLambda lam1 = () -> System.out.println("Hello, this is lambda");
        lam1.foo();
        MyLambdaAdd lam2 = (int a, int b) -> a + b;
        System.out.println(lam2.add(3, 4));
        MyLambdaString lam3 = (String s) -> s.length();
        System.out.println(lam3.numChars("testLambda"));
        MyLambdaString lam4 = s->s.length();
        System.out.println(lam4.numChars("typeinterface"));
        test.printStringLenghtLambda(s->s.length(), "passing_lambda_as_argument");


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 : this is anonymous class implememtation");
            }
        });

        Thread thread2 = new Thread(()->System.out.println("Thread2 : this is lambda implementation"));

        thread1.run();
        thread2.run();

    }*/
}

