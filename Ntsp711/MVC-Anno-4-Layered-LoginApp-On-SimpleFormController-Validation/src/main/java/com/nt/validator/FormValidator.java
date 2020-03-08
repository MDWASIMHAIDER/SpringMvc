package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.EmployeeCommand;

@Component
public class FormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("support ()");
		return clazz.isAssignableFrom(EmployeeCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		EmployeeCommand cmd=null;
		cmd=(EmployeeCommand) target;
		if(cmd.getUname()==null || cmd.getUname().length()==0 ||cmd.getUname().equals("")) {
			errors.rejectValue("uname","uname.required");
		}
		if(cmd.getPassword()==null || cmd.getPassword().equals("") || cmd.getPassword().length()==0) {
			errors.rejectValue("password","password.required");
		}

	}

}
