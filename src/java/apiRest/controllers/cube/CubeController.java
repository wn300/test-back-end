/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiRest.controllers.cube;

import core.models.Cube;
import core.services.cube.CubeService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author wilmer.mancera
 */
@Path("Cube")
public class CubeController {
    @GET
    @Path("GetCube")
    public Cube getCube() {
        return CubeService.GetCube();
    }

    @POST
    @Path("CreateCube/n/{n}")
    public void createCube(@PathParam("n") int n) {
        CubeService.CreateCube(n);
    }

    @PUT
    @Path("UpdateCube/x/{x}/y/{y}/z/{z}/w/{w}")
    public void updateCube(@PathParam("x") int x, @PathParam("y") int y, @PathParam("z") int z, @PathParam("w") int w) {
        CubeService.UpdateCube(x, y, z, w);
    }   
    
    @POST
    @Path("QueryCube/xOne/{xOne}/yOne/{yOne}/zOne/{zOne}/xTwo/{xTwo}/yTwo/{yTwo}/zTwo/{zTwo}")
    public void queryCube(@PathParam("xOne") int xOne, @PathParam("yOne") int yOne, @PathParam("zOne") int zOne, @PathParam("xTwo") int xTwo, @PathParam("yTwo") int yTwo, @PathParam("zTwo") int zTwo) {
        CubeService.QueryCube(xOne, yOne, zOne, xTwo, yTwo, zTwo);
    } 
    
    @GET
    @Path("GetSum")
    public Long getSum() {
        return CubeService.GetSum();
    }

}
