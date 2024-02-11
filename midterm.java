public class midterm{
    final static int V = 4;
    public static void main(String[] args){
        
        String[] availableColors = {"RED", "GREEN", "BLUE"};
        int[] territoryColors;
        boolean neighbors[][] = {
            {false, true, true, true},
            {true, false, true, false},
            {true, true, false, true},
            {true, false, true, false},
        };

        territoryColors = generateColorMap(availableColors, neighbors);

        if (territoryColors != null){
            displaySolution(availableColors, territoryColors);
        }
        else{
            System.out.println("No solution exists");
        }

    }

    //This function will create an array and call the recursive function to fill it and then
    // return it if theres a solution. Otherwise it will return NULL.
    public static int[] generateColorMap(String[] allColors, boolean[][] neighbors){
        int[] arr = {5, 5, 5, 5};
        int v = 0;
        
       if(graphColors(arr, allColors, v, neighbors)){
           return arr;
       }
       else{
           return null;
       }

    }

    //This is a recursive function that will go through and add colors to each of the cities following
    // the requirements of not having two neighbors with the same color.
    public static boolean graphColors(int[] arr, String[] allColors, int v, boolean[][] neighbors){
        //Array limit
        if (v == V){
            return true;
        }

        for (int i = 0; i < allColors.length; i++){ // Loop and try every color. 
            if(safeToColor(arr, allColors, v, i, neighbors)){ //if safetocolor
                arr[v] = i;

                if (graphColors(arr, allColors, v + 1, neighbors)){ //Recursive call to check the next city.
                    return true;
                }
            } 
        }
        return false;
    }

    //This function checks if the slot that we are about to color can be colored based on the restriction.
    public static boolean safeToColor(int[] arr, String[] allColors, int v, int color, boolean[][] neighbors){

        for (int i = 0; i < V; i++){
            // If cities are neighbors and they have the same color then city cannot be colored.
            if (neighbors[v][i] && arr[i] == color){ 
                return false;
            }
        }
        return true;
    }

    public static void displaySolution(String[] availableColors, int[] territoryColors){
        System.out.println("The terretory colors are: ");
        for (int i = 0; i < V; i++){
            System.out.print("Territory ");
            System.out.print(i);
            System.out.print(" = " + availableColors[territoryColors[i]]);
            System.out.println();
            
        }
    }
}