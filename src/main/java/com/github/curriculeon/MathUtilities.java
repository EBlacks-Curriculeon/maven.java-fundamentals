package com.github.curriculeon;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer addIntegers(int baseValue, int difference) {
        return baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long addLongs(long baseValue, long difference) {

      long result = baseValue + difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short addShorts(short baseValue, short difference) {

       short result = (short) (baseValue + difference);
        return (short) result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte addBytes(byte baseValue, byte difference) {
        byte result = (byte) (baseValue + difference);
        return (byte) result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float addFloats(float baseValue, float difference) {
        float result = baseValue + difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double addDoubles(double baseValue, double difference) {
        double result = baseValue + difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtractDoubles(int baseValue, int difference) {
        int result = baseValue - difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtractLongs(long baseValue, long difference) {
        long result = baseValue - difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtractShorts(short baseValue, short difference) {
        short result = (short) (baseValue - difference);
        return  result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtractBytes(byte baseValue, byte difference) {
        byte result = (byte) (baseValue - difference);
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtractFloats(float baseValue, float difference) {
        float result = baseValue - difference;
        return result;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtractDoubles(double baseValue, double difference) {
        double result = baseValue - difference;
        return result;
    }


    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divideIntegers(int dividend, int divisor) {
        Integer result = dividend / divisor;
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divideLongs(long dividend, long divisor) {
        long result = dividend / divisor;
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divideShorts(short dividend, short divisor) {
        short result = (short) (dividend /divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divideBytes(byte dividend, byte divisor) {
        byte result = (byte) (dividend / divisor);
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divideFloats(float dividend, float divisor) {
        float result = dividend / divisor;
        return result;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divideDoubles(double dividend, double divisor) {
        double result = dividend / divisor;
        return result;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiplyIntegers(int multiplicand, int multiplier) {
        Integer result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiplyLongs(long multiplicand, long multiplier) {
        long result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiplyShorts(short multiplicand, short multiplier) {
        short result = (short) (multiplicand * multiplier);
        return result;
    }
    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiplyBytes(byte multiplicand, byte multiplier) {
        byte result = (byte) (multiplicand * multiplier);
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiplyFloats(float multiplicand, float multiplier) {
        float result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiplyDoubles(double multiplicand, double multiplier) {
        double result = multiplicand * multiplier;
        return result;
    }
}
