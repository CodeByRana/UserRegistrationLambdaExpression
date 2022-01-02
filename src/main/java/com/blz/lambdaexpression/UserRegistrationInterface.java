package com.blz.lambdaexpression;

@FunctionalInterface
public interface UserRegistrationInterface {

    boolean validate(String value) throws UserRegistrationException;

}