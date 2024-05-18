package org.example.calcProject;

public class SumCalculator {
    //Sum2
    public int sum(int n){
        if(n==0|| n<0){
            throw new IllegalArgumentException("Use numbers higher than zero ");
        }
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
}
