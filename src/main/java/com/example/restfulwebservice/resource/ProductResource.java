package com.example.restfulwebservice.resource;


import com.example.restfulwebservice.entity.Product;
import com.example.restfulwebservice.model.MysqlProductModel;
import com.example.restfulwebservice.model.ProductModel;

import javax.ws.rs.*;
import java.util.List;

@Path("/product")
@Produces("application/json")
@Consumes("application/json")
public class ProductResource {

    ProductModel productModel;

    public ProductResource() {
        productModel = new MysqlProductModel();
    }

    @GET
    public List<Product> fillAll(){
        return productModel.getProduct();
    }

    @POST
    public boolean addEmployees(Product product){
        return productModel.addProduct(product);
    }

    @PUT
    @Path("{id}")
    public boolean updateEmployee(@PathParam("id") int id, Product updateProduct){
        return productModel.updateProduct(updateProduct, id);
    }

}
