package tasks;

public class Arrays {
    public static void main(String[] args) {

        int[] nums={1,3,5,7,9};
        nums[0]=9;
        nums[4]=1;

        int num_1 = nums[nums.length-5];
        int num_middle=nums[nums.length-3];
        int sum=num_1+num_middle;

        System.out.println(sum);

    }

}
