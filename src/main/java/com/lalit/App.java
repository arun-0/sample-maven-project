package com.lalit;

import org.apache.commons.lang3.StringUtils;

import java.io.Console;

public class App
{
    public static void main( String[] args ) {
        Console console = System.console();
        String firstInput = console.readLine("Enter first input: ");

        while(StringUtils.isBlank(firstInput)) {
            System.out.println("You have provided no input. Please provide input again");
            firstInput = console.readLine("Enter first input: ");
        }

        if(StringUtils.isAlpha(firstInput)) {
            System.out.println("Alphabetic input");
            if(StringUtils.isAllUpperCase(firstInput)) {
                System.out.println("All UPPER case input");
            } else if(StringUtils.isAllLowerCase(firstInput)) {
                System.out.println("All lower case input");
            } else if(StringUtils.isMixedCase(firstInput)) {
                System.out.println("MiXeD case input");
            }
        }
    }

}
