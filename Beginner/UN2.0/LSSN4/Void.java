package Beginner.UN2;

/*
 * Void Methods are used for actions to perform the behaviors 
 * -instructed in said methods
 * Ex:
 */

public class ObjectType {
    public void letter() {
        body();
    }

    public void body() {
        System.out.println("This is a body paragraph.");
    }

    public static void main(String[] args) { 
        ObjectType x = new ObjectType();
        x.letter();
    }
}
