package com.example.restfulwebservice.resource;


import com.example.restfulwebservice.entity.Product;
import com.example.restfulwebservice.repository.InMemoryProductModel;
import com.example.restfulwebservice.repository.ProductModel;

import javax.ws.rs.*;
import java.util.List;

@Path("/products")
@Produces("application/json")
@Consumes("application/json")
public class ProductResource {
    ProductModel productModel;

    public ProductResource() {
        productModel = new InMemoryProductModel();
    }

    @GET
    public List<Product> findAll() {
        return productModel.findAll();
    }

    @Path("{id}")
    @GET
    public int findById(@PathParam("id") int id) {
        return id;
    }

    @POST
    public Product create(Product product) {
        return productModel.save(product);
    }

    @PUT
    @Path("{id}")
    public Product update(@PathParam("id") int id, Product updateProduct) {
        return productModel.update(updateProduct, id);
    }


}
