package com.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {

   
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(){
        super(" Resource not found on server !!! ");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    //extra properties that you want manage

}
