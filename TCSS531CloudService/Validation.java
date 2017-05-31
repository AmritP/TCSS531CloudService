package com.process;

public class Validation {
 private String message;
 private Boolean validate;
 
 Validation(){
	 message= "";
	 validate = false;
 }
 Validation(String message, Boolean validate){
	 this.message = message;
	 this.validate = validate;
 }

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public Boolean getValidate() {
	return validate;
}

public void setValidate(Boolean validate) {
	this.validate = validate;
}
}
