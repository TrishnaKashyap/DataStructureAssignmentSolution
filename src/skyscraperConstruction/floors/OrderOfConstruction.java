package skyscraperConstruction.floors;

import java.util.List;

public class OrderOfConstruction {
    public static void FindOrderOfConstruction(List floors,List sortedFloors){
        int g_i = FindLargestFloor.findLargest(floors);
        int k =0;

        for(int i=0; i<floors.size(); i++){
            System.out.println("Day: " + (i+1));
            if(i>=g_i){
                if(sortedFloors.get(k) == floors.get(i)){
                    System.out.println(sortedFloors.get(k));
                    k++;
                    try{
                        for(int d=0; d<=i;d++){
                            if (sortedFloors.get(k) == floors.get(d)) {
                                System.out.println(sortedFloors.get(k));
                                k++;
                                d = -1;
                            }
                        }
                    }catch (IndexOutOfBoundsException e){
                        continue;
                    }
                }
                else{
                    for(int j=0; j<= i; j++){
                        try{
                            if(floors.get(j) == sortedFloors.get(k)){
                                System.out.println(sortedFloors.get(k));
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
                System.out.println("No construction for the day.");
            }
        }
    }
}
