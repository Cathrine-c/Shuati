package InterviewImportant.Shuati;

import java.util.Arrays;

public class Day7 {

    public static void main(String[] args) {
//        int[] arr = {1,4,2,5,3,8,7,0};
//        System.out.println(Arrays.toString(arr));
//        quickSort(arr);
//        System.out.println(Arrays.toString(arr));

//        orderList(arr);
//        System.out.println(Arrays.toString(arr));

        String str ="abc";

        String s = "dsabcjww";
//        String s1 = s.substring(2,5);
//        System.out.println(s1);
        System.out.println(searchString(str, s));


    }


    public static void quickSort(int[] arr){
        //辅助方法
        quickHelper(arr,0,arr.length-1);

    }

    public static void quickHelper(int[] arr,int left,int right){
        //截止条件
        if(left>=right)return;

        int mid = partition(arr,left,right);

        quickHelper(arr,left,mid-1);
        quickHelper(arr,mid+1,right);
    }


    //找基准值的下标
    public static int partition(int[] arr,int left,int right){
        int i = left;
        int j = right;
        int value = arr[left];

        while(i<j){
            while(i<j&&arr[j]>=value){
                j--;
            }

            while(i<j&&arr[i]<=value){
                i++;
            }
            swap(arr,i,j);
        }

        swap(arr,i,left);
        return i;
    }

    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j]= t;
    }



    public static void orderList(int[] list){
        for(int i=1;i<list.length;i++){
            int cur = i-1;
            int current = list[i];

            for(;cur>=0;cur--){
                //放进去的数比前面的小，就把前面的数往后移动
                if(current<list[cur]){
                    list[cur+1] = list[cur];
                }else {
                    break;
                }

            }

            list[cur+1] = current;
        }
    }


    public static int searchString(String str,String s){

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==str.charAt(0)){
                String s1 = s.substring(i,i+str.length());
                if(s1.equals(str)){
                    return i;
                }else{
                    continue;
                }

            }else{
                continue;
            }
        }

        return -1;
    }
}
