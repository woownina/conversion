package com.tlglearning;

public class Conversion {
    public static int convertToDecimal(String binary) {
        int value = 0;
        for (char c : binary.toCharArray()) {
            value = (value << 1) + c- '0';
        }
        return value;
    }

    /**
     * @param representation
     * @param radix
     * @return
     * @throws IllegalArgumentException
     */
    public static int parse(String representation, int radix) throws IllegalArgumentException {
        int value = 0;
        for (char c : representation.toCharArray()) {
            value = (value* radix) + c- '0';

            if (representation == null) {
                throw new IllegalArgumentException("Input is null");
            }
        }
        return value;
    }
}

