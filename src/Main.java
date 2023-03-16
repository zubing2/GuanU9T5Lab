import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // DO NOW: Here are some objects
        Animal animal = new Animal("some animal");
        Cow cow = new Cow("Mr. Moo Cow");
        Dog dog = new Dog("Fido");
        Puppy puppy = new Puppy("Lil Rascal");

        // PREDICT which, if any, of the following will print "false"?
        System.out.println(animal instanceof Animal); // a
        System.out.println(cow instanceof Animal);    // b
        System.out.println(cow instanceof Cow);       // c
        System.out.println(dog instanceof Animal);    // d
        System.out.println(dog instanceof Dog);       // e
        System.out.println(puppy instanceof Animal);  // f
        System.out.println(puppy instanceof Dog);     // g
        System.out.println(puppy instanceof Puppy);   // h
        System.out.println(animal instanceof Object); // i
        System.out.println(cow instanceof Object);    // j
        System.out.println(dog instanceof Object);    // k
        System.out.println(puppy instanceof Object);  // l
        System.out.println(dog instanceof Puppy);     // m

        // ----------------------- WARM UP -----------------------------
        // Exercise 1: Create an empty ArrayList of Animal objects
        // (name it whatever you want); you will need to import ArrayList.
        // then add the four objects from the Do Now (animal, cow, dog, puppy)
        // to the ArrayList, in any order, using the "add" ArrayList method.
        ArrayList<Animal> list = new ArrayList<>();
        list.add(animal);
        list.add(cow);
        list.add(dog);
        list.add(puppy);

        // Exercise 2: use an ENHANCED for loop to loop through the
        // arraylist and call the talk() method on each object.
        for (Animal speech : list) {
            speech.talk();
        }

        // Exercise 3: use a standard INDEX-BASED for loop to again
        // call the talk() method on each object.
        for (int i = 0; i < list.size(); i ++) {
            list.get(i).talk();
        }

        // Exercise 4: same as Exercise 1, except use an array of type Animal.
        Animal[] list2 = new Animal[4];
        list2[0] = animal;
        list2[1] = cow;
        list2[2] = dog;
        list2[3] = puppy;

        // Exercise 5: modify either of the loops from 2 or 3 above to attempt
        // to call the fetch() method on each object instead of talk().
        // does the code compile when you do this?  if not, why not?
        // can you figure out a way to get it to compile and run?
        for (Animal speech : list) {
            if (speech instanceof Dog) {
                Dog temp = (Dog) speech;
                temp.fetch();
            }
        }

    }
}
