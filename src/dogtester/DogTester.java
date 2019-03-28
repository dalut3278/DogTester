/*
 * David Lutelmowski
 * 20/03/19
 * DogTester
 */

package dogtester;

/**
 *
 * @author dalut3278
 */
public class DogTester {
  public static void main(String [] args){
    Dog dog1 = new Dog("Rover", "Spaniel", 3, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");

    //Print out the details of each dog
    System.out.println(dog1);
    System.out.println("--------------------------");
    System.out.println(dog2);
    System.out.println("--------------------------");
    //Print using the accessor methods
    System.out.println("Dog1's hunger is now: " 
      + dog1.getHunger());
    //Change dog1's hunger and print again
    dog1.setHunger(9);
    System.out.println("Dog1's hunger is now: " 
      + dog1.getHunger());

    //Change dog1's name and print again
    dog1.setName("Lassie");
    System.out.println("Dog1's name is now: " + dog1.getName());
  }
}
