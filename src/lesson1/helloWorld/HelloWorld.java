package lesson1.helloWorld;

import lesson1.helloWorldLibrary.WorldLibrary;

public class HelloWorld {

    public static void main(String[] args) {

        WorldLibrary theWorld = new WorldLibrary();
        theWorld.setPlanetName("Earth");

        System.out.println("Hello world!" + WorldLibrary.getName());
        System.out.println("I live on a planet named " + theWorld.getPlanetName());

        theWorld.setPlanetName("Mars");
        System.out.println("But now I live on " + theWorld.getPlanetName());
    }
}
