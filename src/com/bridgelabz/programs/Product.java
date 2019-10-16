package com.bridgelabz.programs;

public class Product {
	Product(){};
  
         private String prodName; // product name
         private String unitsTotal; // total units in stock
         private double unitPrice; // price per unit 
         // initialize four-argument constructor
         public Product(String name, String total, double price)
         {
              prodName = name;
              setUnitsTotal (total); // validate and store total of cars
              setUnitPrice (price); // validate and store price per car
             
          } // end four-argument constructor        
         

         public void setProdName( String name)
         {
              prodName = name;
         } 
         public String getProdName()
         {
              return prodName;
         } 
         public void setUnitsTotal( String total )
         {
              unitsTotal = total;    
         } 
         public String getUnitsTotal()
         {
              return unitsTotal;
         }
         public void setUnitPrice( double price )
         {
              unitPrice = price;
         }
         public double getUnitPrice()
         { 
              return unitPrice;
         } 
         // calculate value of total inventory
         public String inventory()
         {
              return (unitsTotal + unitPrice)+"\n";
         } // end method value
         
    } // end class

