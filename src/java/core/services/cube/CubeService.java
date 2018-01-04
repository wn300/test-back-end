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

    public static long sum;
    public static Cube cube;
    public static int[] W;

    public CubeService() {
        this.cube = new Cube();
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

    public static void UpdateCube(Integer count, Integer x, Integer y, Integer z, Integer w) {
        cube.x[count] = x - 1;
        cube.y[count] = y - 1;
        cube.z[count] = z - 1;
        W[count] = w;

        for (int k = 0; k < count; k++) {
            if (cube.x[k] == cube.x[count] && cube.y[k] == cube.y[count] && cube.z[k] == cube.z[count]) {
                W[k] = 0;
            }
        }
    }

    public static void QueryCube(Integer count, Integer xOne, Integer yOne, Integer zOne, Integer xTwo, Integer yTwo, Integer zTwo) {

        sum = 0;
        xOne = xOne - 1;
        yOne = yOne - 1;
        zOne = zOne - 1;
        xTwo = xTwo - 1;
        yTwo = yTwo - 1;
        zTwo = zTwo - 1;

        for (int a = 0; a < count; a++) {
            if (cube.x[a] >= xOne && cube.y[a] >= yOne && cube.z[a] >= zOne && cube.x[a] <= xTwo && cube.y[a] <= yTwo && cube.z[a] <= zTwo) {
                sum += W[a];
            }
        }
    }
    
    public static long GetSum() {
        return sum;
    }

}
