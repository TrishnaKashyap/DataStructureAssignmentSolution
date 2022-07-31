package skyscraperConstruction.driver;

import skyscraperConstruction.floors.OrderOfConstruction;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> floors = new LinkedList<>();
        List<Integer> sortedFloors = new LinkedList<>();

        //Taking input for floor count
        int floorCount = 0;
        boolean invalidInput = false;
        do {
            if(invalidInput) {
                System.out.println("That's not a valid positive number, please enter the total no. of floors in the building.");
            }else {
                System.out.println("Enter the total no. of floors in the building.");
            }

            while (!in.hasNextInt()) {
                System.out.println("That's not a number, please enter the total no. of floors in the building.");
                in.next();
            }

            floorCount = in.nextInt();
            if(floorCount <= 0) {
                invalidInput = true;
            } else {
                invalidInput = false;
            }
        } while (invalidInput);

        //Taking floor sizes
        for (int i = 0; i < floorCount;i++) {
            System.out.println("Enter the floor size on day " + (i + 1) + ":");
            int nextFloor = -1;
            try{
                nextFloor =  in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Enter a numeric value.");
                i--;
                in.nextLine();
            }
            //validating unique floor sizes
            if(floors.contains(nextFloor)){
                System.out.println("Size " +nextFloor + " already exists in the building. Please enter a different size.");
                i--;
            }
            else if(nextFloor != -1){
                floors.add(nextFloor);
            }
        }
        sortedFloors.addAll(floors);
        Collections.sort(sortedFloors);
        Collections.reverse(sortedFloors);
        System.out.println("The order of construction is as follows: ");
        OrderOfConstruction.FindOrderOfConstruction(floors, sortedFloors);
        in.close();
    }
}
