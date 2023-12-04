package Beginner.UN2;
/*

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