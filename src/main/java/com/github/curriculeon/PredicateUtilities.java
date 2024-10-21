package com.github.curriculeon;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        boolean result = x > y;
        return result;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean result = x < y;
        return result;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean result = x >= y;
        return result;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        boolean result = x <= y;
        return result;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        boolean result = true;
        return result;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        boolean result = false;
        return result;
    }

}