import java.util.ArrayList;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int [] arr =new int[2];
    //    for(int i=0 ;i<nums.length;i++){
    //     for(int j=i+1 ;j<nums.length;j++){
    //         if(nums[i]+nums[j]==target){
    //             arr[0]=i;
    //             arr[1]=j;

    //         }
    //     }
    //    }
    //    return arr;
    // }

//     int[] array = nums.clone;    // copy the array 
//     Arrays.sort(array);
//     int [] result =new int[2];
//     int left =array[0];
//     int right =array[array.length -1];
//     int sum = right + left ;
//     while(left<right){
//         if(sum==target){

//         }
//     }
// }






        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (list.contains(target - nums[i])) {

                result[0] = list.indexOf(target - nums[i]);
                result[1] = i;
                break;
            }

            list.add(nums[i]);
        }

        return result;


    }
}