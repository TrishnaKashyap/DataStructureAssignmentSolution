package skyscraperConstruction.floors;

import java.util.List;

public class OrderOfConstruction {
    public static void FindOrderOfConstruction(List floors,List sortedFloors){
        int g_i = FindLargestFloor.findLargest(floors);
        int k =0;
        int NoOfFloors = floors.size();
        for(int i=0; i<NoOfFloors; i++){
            System.out.println("Day: " + (i+1));
            if(i>=g_i){
                if(sortedFloors.get(k) == floors.get(g_i)){
                    System.out.println(sortedFloors.get(k));
                    k++;
                    for(int d=0; d<=i;d++){
                        if(sortedFloors.get(k) == floors.get(d)){
                            System.out.println(sortedFloors.get(k));
                            k++;
                            d=0;
                        }
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
                System.out.println();
            }
        }
    }
}
