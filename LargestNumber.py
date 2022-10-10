class Solution(object):
    def largestNumber(self, nums):
        for i, n in enumerate(nums):
            nums[i] = str(n)
            
        def order(l1, l2):
            if l1 + l2 > l2 + l1:
                return -1
            else:
                return 1
            
        nums = sorted(nums, key = cmp_to_key(order))
        
        return str(int("".join(nums)))
        
