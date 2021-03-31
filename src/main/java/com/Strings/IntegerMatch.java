package com.Strings;

public class IntegerMatch {

    /**
     *
     * @param args ? means zero or one .... + mean one or more
     */
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("+1234".matches("-?\\d+"));
        System.out.println("-1".matches("-?\\d+"));
        System.out.println("+1234".matches("(-|\\+)\\d+"));
    }
    // grouping ()... then | OR ..... \\ meaning it conveys a special character meaning
}
