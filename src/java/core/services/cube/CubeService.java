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

    private static long sum;
    private static int count = 0;
    public static Cube cube = new Cube();

    public CubeService() {
        cube = new Cube();
    }

    public static Cube GetCube() {
        return cube;
    }

    public static void CreateCube(int N) {
        cube = new Cube();

        cube.setW(N);
        cube.setX(N);
        cube.setY(N);
        cube.setZ(N);

    }

    public static void UpdateCube(int x, int y, int z, int w) {
        cube.x[count] = x - 1;
        cube.y[count] = y - 1;
        cube.z[count] = z - 1;
        cube.w[count] = w;

        for (int k = 0; k < count; k++) {
            if (cube.x[k] == cube.x[count] && cube.y[k] == cube.y[count] && cube.z[k] == cube.z[count]) {
                cube.w[k] = 0;
            }
        }
        count ++;
    }

    public static void QueryCube(int xOne, int yOne, int zOne, int xTwo, int yTwo, int zTwo) {
        sum = 0;
        
        xOne = xOne - 1;
        yOne = yOne - 1;
        zOne = zOne - 1;
        xTwo = xTwo - 1;
        yTwo = yTwo - 1;
        zTwo = zTwo - 1;

        for (int a = 0; a < count; a++) {
            if (cube.x[a] >= xOne && cube.y[a] >= yOne && cube.z[a] >= zOne && cube.x[a] <= xTwo && cube.y[a] <= yTwo && cube.z[a] <= zTwo) {
                sum += cube.w[a];
            }
        }
    }

    public static long GetSum() {
        return sum;
    }

}
