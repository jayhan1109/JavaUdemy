package jay.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 ||extraBuckets<0)
            return -1;

        double result = (width*height) / (areaPerBucket+extraBuckets);
        return (int)Math.ceil(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0)
            return -1;

        double result = width*height / areaPerBucket;
        return (int)Math.ceil(result);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0)
            return -1;

        double result = area / areaPerBucket;
        return (int)Math.ceil(result);
    }
}
