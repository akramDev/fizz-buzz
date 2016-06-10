package com.olbati.fizzbuzz;

/**
 * Created by amoncer on 10/06/16.
 */
public class Fizzbuzz {


    public String perfom(int input) {

        if(input < 0 ){
            throw new IllegalArgumentException("The input should be positive");
        }else if(isDivisibleBy3(input) && isDevisibleBy5(input)) {
            return "fizzbuzz";
        }else if(isDivisibleBy3(input)){
            return "fizz";
        }else if(isDevisibleBy5(input)){
            return "buzz";
        }else {
            return String.valueOf(input);
        }

    }

    private boolean isDevisibleBy5(int input) {
        return input % 5 == 0;
    }

    private boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }
}
