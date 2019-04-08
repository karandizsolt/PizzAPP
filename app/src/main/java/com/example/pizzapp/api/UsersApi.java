package com.example.pizzapp.api;

import com.example.pizzapp.model.Menu;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UsersApi {
  
  /**
   * login
   * Login to the application
   * @param email 
   * @param password 
   * @return Call<Boolean>
   */
  
  @POST("login")
  Call<Boolean> login(
          @Query("email") String email, @Query("password") String password
  );

  
  /**
   * get menu
   * Get pizzas
   * @return Call<Menu>
   */
  
  @GET("menu")
  Call<Menu> menu();
    

  
  /**
   * order
   * order pizza
   * @param email 
   * @param names 
   * @param price 
   * @return Call<Boolean>
   */
  
  @POST("order")
  Call<Boolean> order(
          @Query("email") String email, @Query("names") String names, @Query("price") Integer price
  );

  
  /**
   * register
   * Register to the application
   * @param email 
   * @param password 
   * @return Call<Boolean>
   */
  
  @POST("register")
  Call<Boolean> register(
          @Query("email") String email, @Query("password") String password
  );

  
}
