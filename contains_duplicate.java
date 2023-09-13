class Solution
{
    public boolean containsDuplicate(int[] nums) 
    {
        
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            smallest=Math.min(smallest,nums[i]);
            largest=Math.max(largest,nums[i]);
        }
        int freq[]=new int [largest+1]; //kyuki largest number bhi as a index present hona chahiye.
        
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=2)
                return true;
        }
        return false;
    } 
  

}