package com.BridgelabsW2.R;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr  =new int[]{6,5,5,4,3};
        int[]vistedArr=new int[arr.length];
        int visted=-1;
        for(int i=0;i< arr.length;i++){
            int count=1;
            for(int j=0;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    vistedArr[j]=visted;
                }
            }
            if (vistedArr[i]!=visted){
                vistedArr[i]=count;
            }
        }
        for (int i=0;i<vistedArr.length;i++){
            if(vistedArr[i]!=visted){
                System.out.println("Frequecy of"+args[i]+":"+vistedArr[i]);
            }
        }
    }
}
