package.Classes.UN3;

public Class Classes() {
/*
* Classes are the main makeup of multiple languages, relying on such to execute 
simple codes - such as C++ and Java
* It is a template for objects with similar attributes and properties, ex:
    - A class "Student" has objects named "Raj" & "Taj,"
    - They are both in the same 'grade,' something that can be defined as an atribute, and are, at base, students
    - However, they are NOT in the same 'track', Raj in II and Taj in I
*/

    public static void main(Strings[] args) {
        IT newIt = new IT();
        /* You could also set variables to methods within other classes. */
        IT newIt2 = new IT.message2();

        System.out.println(newIt.message());
        System.out.println(newIt2);

    }
}

public Class IT() {
/*
* Notice how it isn't named after the Java file? It's important to note which 
classes are not categorized as the "main" class i.e. where everything is executed
*/
    public message() {
        System.out.println("Hello World!")
    }

    public message2() {
        System.out.pritln("Back to you.")
    }
} 