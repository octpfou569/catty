package org.catty.cat;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CatValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Cat.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if (target != null) {
			Cat cat = (Cat) target;
			if (cat.getName() != null) {
				//errors.rejectValue(field, errorCode, defaultMessage);
			}
		}
		
	}

}
