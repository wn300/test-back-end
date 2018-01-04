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
    @Path("Test/x/{x}/y/{y}")
    public String test(@PathParam("x") Integer x, @PathParam("y") Integer y) {

        return String.valueOf(x * y);
    }

    @GET
    @Path("GetCube")
    public Cube getCube() {
        return CubeService.GetCube();
    }

    @POST
    @Path("CreateCube/n/{n}")
    public void createCube(@PathParam("n") Integer n) {
        CubeService.CreateCube(n);
    }

    @PUT
    @Path("UpdateCube/count/{count}/x/{x}/y/{y}/z/{z}/w/{w}")
    public void updateCube(@PathParam("count") Integer count, @PathParam("x") Integer x, @PathParam("y") Integer y, @PathParam("z") Integer z, @PathParam("w") Integer w) {
        CubeService.UpdateCube(count, x, y, z, w);
    }   
    
    @POST
    @Path("QueryCube/count/{count}/xOne/{xOne}/yOne/{yOne}/zOne/{zOne}/xTwo/{xTwo}/yTwo/{yTwo}/zTwo/{zTwo}")
    public void queryCube(@PathParam("count") Integer count, @PathParam("xOne") Integer xOne, @PathParam("yOne") Integer yOne, @PathParam("zOne") Integer zOne, @PathParam("xTwo") Integer xTwo, @PathParam("yTwo") Integer yTwo, @PathParam("zTwo") Integer zTwo) {
        CubeService.QueryCube(count, xOne, yOne, zOne, xTwo, yTwo, zTwo);
    } 
    
    @GET
    @Path("GetSum")
    public Long getSum() {
        return CubeService.GetSum();
    }

}
