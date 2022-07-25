package skyscraperConstruction.driver;

import skyscraperConstruction.sort.SortFloors;

import java.util.*;

public class DriverArray {

    static int index;
    public static int findLargest(int[] floors){
        int greatest=0;
        int g_index = 0;
        for(int i=0; i<floors.length; i++){
            for(int j=0; j<floors.length; j++){
                if(floors[j] > greatest){
                    greatest = floors[j];
                    g_index=j;
                }
            }
        }
        return g_index;
    }
    public static void removeGreatest(int[] floors, int g_i) {
        if (floors == null || g_i < 0 ) {
            return;
        }
        int[] newArray = new int[floors.length - 1];

        for (int i = 0, k = 0; i < floors.length; i++) {
            if (i == g_i) {
                continue;
            }
            newArray[k++] = floors[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of floors in the building.");
        int NoOfFloors = in.nextInt();
        int[] floors = new int[NoOfFloors];
        int[] sortedFloors = new int[floors.length];

        for( int i = 0; i<NoOfFloors; i++){
            System.out.println("Enter the floor size on day: " + (i+1));
            floors[i] = sortedFloors[i] = in.nextInt();
        }
        SortFloors sort = new SortFloors();
        sort.mergesort(sortedFloors, 0, sortedFloors.length-1);

        System.out.println("The order of construction is as follows: ");
        int g_i = findLargest(floors);
        int k =0;
        for(int i=0; i<NoOfFloors; i++){
            System.out.println("Day: " + (i+1));
            if(i>=g_i){
                if(sortedFloors[k] == floors[g_i]){
                    System.out.println(sortedFloors[k]);
                    k++;
                    for(int d=0; d<=i;d++){
                        if(sortedFloors[k] == floors[d]){
                            System.out.println(sortedFloors[k]);
                            k++;
                            d=0;
                        }
                    }
                }
                else{
                    for(int j=0; j<= i; j++){
                        try{
                            if(floors[j] == sortedFloors[k]){
                                System.out.println(sortedFloors[k]);
                                j=0;
                                k++;
                            }
                        } catch (IndexOutOfBoundsException e){
                            break;
                        }
                    }
                }
            }
            else{
                System.out.println();
            }
        }


    }
}
