/*
 * Copyright (c) 2020. Amazeful. All rights reserved!
 */

package com.amazefulbot.WebServer.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class PrefixValidation implements ConstraintValidator<Prefix, String> {
    private List<String> prefixes = Arrays.asList("%", "#", "$", "%", "^", "&", "*", "?");
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return prefixes.contains(s);
    }
}
