package skyscraperConstruction.floors;

import java.util.List;

public class FindLargestFloor {
    public static int findLargest(List floors){
        int greatest=0;
        int g_index = 0;
        for(int i=0; i<floors.size(); i++){
            for(int j=0; j<floors.size(); j++){
                if((int) floors.get(i) > greatest){
                    greatest = (int) floors.get(i);
                    g_index=i;
                }
            }
        }
        return g_index;
    }
}
