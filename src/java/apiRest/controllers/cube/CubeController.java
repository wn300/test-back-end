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
public class CubeController  {
    
    @GET
    @Path("Test/x/{x}/y/{y}")
    public String test (@PathParam("x") Integer x, @PathParam("y") Integer y){
    
        return String.valueOf(x * y);
    }
    
    @GET
    @Path("GetCube")
    public Cube getCube (){    
        return CubeService.GetCube();
    }
    
    @POST
    @Path("CreateCube/n/{n}")
    public void createCube (@PathParam("n") Integer n){
        CubeService.CreateCube(n);
    }
    
    @PUT
    @Path("UpdateCube/x/{x}/y/{y}/z/{z}/w/{w}")
    public void updateCube (@PathParam("x") Integer x,@PathParam("y") Integer y,@PathParam("z") Integer z){
        CubeService.UpdateCube(1,x,y,z);
    }

}
