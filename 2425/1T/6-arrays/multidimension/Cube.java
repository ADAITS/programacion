package multidimension;

import java.util.Arrays;

public class Cube {
    public static String cubeToString(int[][][] cube){
        String cubeString = "";
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                for (int k = 0; k < cube.length; k++) {
                    cubeString += cube[i][j][k];
                }
                cubeString += "\n";
            }
            cubeString += "\n";
        }
        return cubeString;
    }
    public static void printCube(int[][][] cube){
        // * Print cube
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {   
                for (int k = 0; k < cube.length; k++) {
                    System.out.print(cube[i][j][k]);
                }
            System.out.println();
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = args.length > 0 ? Integer.parseInt(args[0]) : 4;

        int[][][] cube = new int[size][size][size];

        // * Build cube
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                for (int k = 0; k < cube.length; k++) {
                    //cube[i][j][k] = 0;
                    cube[0][j][k] = 1;
                    cube[cube.length-1][j][k] = 1;
                    cube[i][0][k] = 1;
                    cube[i][cube.length-1][k] = 1;
                    cube[i][j][0] = 1;
                    cube[i][j][cube.length-1] = 1;
                }
            }
        }

        printCube(cube);




        


        /*for (int j = 0; j < cube.length; j++) {   
            for (int i = 0; i < cube.length; i++) {
                System.out.print("1");
            }
            System.out.println();
        }
        
        for (int k = 0; k < cube.length-2; k++) {
            System.out.println();
            
            for (int i = 0; i < cube.length; i++) {
                System.out.print("1");
            }
            System.out.println();
            
            for (int i = 0; i < cube.length-2; i++) {
                
                System.out.print("1");
                for (int j = 0; j < cube.length-2; j++) {
                System.out.print("0");
            }
            System.out.print("1");
            System.out.println();
        }
        
        for (int i = 0; i < cube.length; i++) {
            System.out.print("1");
        }
        System.out.println();

        } 
        System.out.println();
        
        for (int j = 0; j < cube.length; j++) {   
            for (int i = 0; i < cube.length; i++) {
                System.out.print("1");
            }
        System.out.println();

        }*/
        
    }
}
