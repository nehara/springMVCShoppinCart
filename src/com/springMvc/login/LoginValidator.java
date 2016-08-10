package com.springMvc.login;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return LoginBean.class.equals(arg0);
	}	

	@Override
	public void validate(Object obj, Errors errors) {
		LoginBean user=(LoginBean) obj;
		
		LoginBean login = (LoginBean) obj;  
		  if (login.getUserName() == null || login.getUserName().length() == 0) {
		  errors.rejectValue("userName","error.empty.field", "Please Enter User Name");
		  }
		  else if (!login.getUserName().equals("rathore")) {
			  errors.rejectValue("userName", "unknown.user", "Unknown User");
		  }
		  if (login.getPassword() == null || login.getPassword().length() == 0) {
		  errors.rejectValue("password","error.empty.field", "Please Enter Password");
		  } 
		  else if (!login.getPassword().equals("neha52")) {
		  errors.rejectValue("password", "wrong.password", "Wrong Password");
		  }
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.userName", "UserName is required");
		//ValidationUtils.rejectIfEmpty(errors, "password", "error.password", "Password is required");
		}

}
