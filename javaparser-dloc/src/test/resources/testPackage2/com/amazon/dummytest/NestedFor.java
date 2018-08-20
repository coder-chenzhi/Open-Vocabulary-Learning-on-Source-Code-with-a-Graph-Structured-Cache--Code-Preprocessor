package com.amazon.dummytest;

public class NestedFor {

    public static int main() {
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum += i;
            for (int j=0; j<i; j++) {
                sum += j - i;
                sum -= 1;
            }
        }
        return sum;
    }

}