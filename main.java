public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int myNum = 7;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);


        if (myNum > 0) {
            System.out.println("myNum is positive");
        } else {
            System.out.println("myNum is not positive");
        }


        if(myNum% 2 == 0) {
            System.out.println("myNum is even");
        } else {
            System.out.println("myNum is odd");
        }

        switch (myLetter) {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("number is 1");
                break;
            case 'E':
                System.out.println("number is 2");
                break;
            default:
                System.out.println("Letter is not A, B, or C");
        }
}