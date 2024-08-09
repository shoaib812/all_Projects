package com.hotel.hotel.exception;

public class ResourceNotFoundeEcxeption extends RuntimeException{

    public ResourceNotFoundeEcxeption(String s){
        super(s);
    }

    public ResourceNotFoundeEcxeption() {
        super(" Resource Not Found !! ");
    }

}
