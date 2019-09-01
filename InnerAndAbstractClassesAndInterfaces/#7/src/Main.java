/**
 * @author UGURINAL
 * on 9/1/2019
 * at 6:04 PM
 * AnonymousClasses
 */

public class Main {
    public static void main(String[] args) {

        // Anonymous class
        HelloWorldAnonymousClasses.HelloWorld frenchGreeting = new HelloWorldAnonymousClasses.HelloWorld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        };

        frenchGreeting.greet();

        HelloWorldAnonymousClasses test = new HelloWorldAnonymousClasses();
        test.sayHello();



    }
}
