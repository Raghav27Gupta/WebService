/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author H.P
 */
@WebService(serviceName = "clcweb")
public class clcweb {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public String addition(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        
        float res=i+j;//TODO write your implementation code here:
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplication")
    public String multiplication(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
        float res=i*j;//TODO write your implementation code here:
        return (Float.toString(res));
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public String division(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
        float res=i/j;//TODO write your implementation code here:
        return (Float.toString(res));    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public String subtract(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        float res=i-j;//TODO write your implementation code here:
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    
    
    
   /*-------------------------------------
    
    
    @WebMethod(operationName = "Palindrome")
    public String Palindrome(@WebParam(name = "i") int i) {
        String res =""; 
        int r,sum=0,temp;    //It is the number variable to be checked for palindrome  
  
  temp=i;    
  while(i>0){    
   r=i%10;  //getting remainder  
   sum=(sum*10)+r;    
   i=i/10;    
  }    
  if(temp==sum)    
   res = "palindrome number ";    
  else    
   res = "not palindrome";
        return res;
    }
    
    */
}
