/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.models;

/**
 *
 * @author wilmer.mancera
 */
public class Cube {

    public int[] x;
    public int[] y;
    public int[] z;
    public int[] w;

    public int[] getX() {
        return x;
    }

    public void setX(int x) {
        this.x = new int[x];
    }

    public int[] getY() {
        return y;
    }

    public void setY(int y) {
        this.y = new int[y];
    }

    public int[] getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = new int[z];
    }

    public int[] getW() {
        return w;
    }

    public void setW(int w) {
        this.w = new int[w];
    }

}
