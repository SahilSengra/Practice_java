package Intermidiate_Coding_java;



public class array_smallest {
    private static int getSmallest(int[] sahil){
        int min= sahil[0];
        int len= sahil.length;

        for(int i= 1;i<len;i++) {
            if (sahil[i] < min)
                min = sahil[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int sahil []={3,1,6,7,8};

        System.out.println(" the smallest numner is " +getSmallest(sahil));
    }
}
