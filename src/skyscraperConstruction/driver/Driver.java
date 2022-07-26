package skyscraperConstruction.driver;

import skyscraperConstruction.floors.OrderOfConstruction;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> floors = new LinkedList();
        List<Integer> sortedFloors = new LinkedList<>();

        System.out.println("Enter the no. of floors in the building.");

        int NoOfFloors = in.nextInt();

        for (int i = 0; i < NoOfFloors;i++) {
            System.out.println("Enter the floor size on day: " + (i + 1));
            floors.add(in.nextInt());
        }

        sortedFloors.addAll(floors);
        Collections.sort(sortedFloors);
        Collections.reverse(sortedFloors);
        System.out.println(sortedFloors);
        System.out.println("The order of construction is as follows: ");
        OrderOfConstruction.FindOrderOfConstruction(floors, sortedFloors);
        in.close();
    }
}
