// package Beginner.UN2;

/*
* Comments are marked by the green highlights: this and everything else between "/+ +/" is an example.
*   - Comments, defined by some standard english and NOT different in pc context, give explanations for whatever
*   - code syntax they're in-between.
* 
* Objects are instances of classes (you will learn more information about them in UN3.0). 
*   - They can carry at least 5 methods or more (they can carry much more or less, 
* -but most efficient programs carry this amount). 
*   - They are considered a data field that has unqiue attributes and behaviors, some of which are 
* -inherited by the parent class
*/

public class Object {
    private String tea;
    private String maker;
    private boolean isMilk;

    public Object(String mk, String t, Boolean isml) {
        maker = mk;
        tea = t;
        isMilk = isml;
    }

    public static void main(String[] args) {
        Object x = new Object("Indian East Company", "Vanilla Mixture", false);
        System.out.println(x.maker);
        System.out.println(x.tea);
        System.out.println(x.isMilk);
    }

}