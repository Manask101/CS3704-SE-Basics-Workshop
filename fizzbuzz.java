package practice;

public class fizzbuzz {

    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        
        printFB(array);
    }
    
    public static void printFB(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i]%3 == 0 && nums[i]%5 != 0)
            {
                System.out.println("Fizz");
            }
            else if (nums[i]%5 == 0 && nums[i]%3 != 0)
            {
                System.out.println("Buzz");
            }
            else if (nums[i]%3 == 0 && nums[i]%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(nums[i]);
            }
        }
        
    }

}
