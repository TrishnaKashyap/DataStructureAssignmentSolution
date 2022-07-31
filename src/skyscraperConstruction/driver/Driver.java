package skyscraperConstruction.driver;

import skyscraperConstruction.floors.OrderOfConstruction;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> floors = new LinkedList();
        List<Integer> sortedFloors = new LinkedList<>();

        System.out.println("Enter the no. of floors in the building.");

        int noOfFloors = 0;
        if(in.hasNextInt()){
            noOfFloors = in.nextInt();
        }else{
            System.out.println("Enter a numeric value");
            main(args);
        }
        for (int i = 0; i < noOfFloors;i++) {
            System.out.println("Enter the floor size on day: " + (i + 1));
            int nextFloor = -1;
            try{
                nextFloor =  in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Enter a numeric value.");
                i--;
                in.nextLine();
            }
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
