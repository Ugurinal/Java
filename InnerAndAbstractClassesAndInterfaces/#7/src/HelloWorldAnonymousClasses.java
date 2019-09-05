/**
 * @author UGURINAL
 * on 9/1/2019
 * at 6:05 PM
 * AnonymousClasses
 */

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    public void sayHello() {
        // Local class
        class EnglishGreeting implements HelloWorld {
            String name = "World";

            @Override
            public void greet() {
                greetSomeone("World");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        }

        // Anonymous class
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        };

        // Local class definition. Local class only visible within the block(method) that defines it.
        EnglishGreeting test = new EnglishGreeting();
        test.greet();
    }


}
