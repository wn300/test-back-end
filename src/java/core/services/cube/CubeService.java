package core.services.cube;

import core.models.Cube;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wilmer.mancera
 */
public class CubeService {
    public static Cube cube;
    public static int[] W; 
    
    public CubeService(){
        this.cube = null;
    }

    public static Cube GetCube() {
        return cube;
    }

    public static void CreateCube(Integer N) {
        cube = new Cube();       
        
        int[] n = new int[N];

        W = n;
        cube.setX(n);
        cube.setY(n);
        cube.setZ(n);
    }
    
    public static void UpdateCube(Integer count, Integer x, Integer y, Integer z){
        cube.x[count] = x - 1;
        cube.y[count] = y - 1;
        cube.z[count] = z - 1;        
        
        for (int k = 0; k < count; k++) {
            if (cube.x[k] == cube.x[count] && cube.y[k] == cube.y[count] && cube.z[k] == cube.z[count]) {
                W[k] = 0;
            }
        }
    }

}
