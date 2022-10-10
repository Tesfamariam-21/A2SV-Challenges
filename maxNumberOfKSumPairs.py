class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        c = Counter(nums)
        output = 0
        counted = set()
        
        for x in c:
            if x not in counted and (k-x) in c:
                if x == (k-x):
                    output += c[x]//2
                else:
                    output += min(c[x], c[k-x])
                    counted.add(x)
                    counted.add(k-x)
                
        return output
