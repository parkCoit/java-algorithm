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
        for(int i = 0; i < arr.length;i++){
            arr[i] = createRandomNumber();
            for(int j = 0; j < i;j++){
                if(arr[i] == arr[j]){i--;}
            }
        }
        return arr;
    }
    int createRandomNumber(){
        return (int)(Math.random()*10)+1;
    }
    int[] sortArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
                }
            }
        }
        return arr;
    }
    void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print( arr[i]+"\t" );
        }
    }
} 
