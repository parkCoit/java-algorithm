package 정렬;

import java.util.Random;

public class 버블정렬 {
    public static void main(String[] args) {
        new 버블정렬().solution();
    }
    void solution(){
        int[] arr = createArray();
        arr = sortArray(arr);
        printArray(arr);
    }
    int[] createArray(){ 
        int[] arr = new int[10];
        for(int i =0; i < arr.length;i++){
            arr[i] = createRandomNumber();
        }
        return arr;
    }
    int createRandomNumber(){
        return (int)(Math.random()*100)+1;
    }
    int[] sortArray(int[] arr){
        return arr;
    }
    void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
} 
