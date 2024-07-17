package ru.gb.zhiganov;
/**
 * Decorator, apply decorates on result because it is important how result looks
 */
public class Decorator {
    /**
     * Decorate function for decorating number to console
     * @param a number needed decorates
     * @return formatted string 
     */
    public static String decorate(int a){
        /**
         * it decorates number by concatenating string by format function
         */
        return String.format("Here is your nuber %d",a);
    }
}
