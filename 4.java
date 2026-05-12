/*Airport security officials have confiscated several item of the passengers at the security check point. 
All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. 
Here, the risk severity of the items represent an array[] of N number of integer values. 
The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.
Example :
Input :
7  -> Value of N
[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
Output :
0 0 0 1 1 2 2  -> Element after sorting based on risk severity */

import java.util.*;
public class Main{
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    void sortedNumbers(int []nums){
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Main obj = new Main();

        obj.sortedNumbers(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}
