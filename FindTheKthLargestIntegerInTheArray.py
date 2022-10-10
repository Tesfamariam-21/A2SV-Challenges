class Solution(object):
    def kthLargestNumber(self, nums, k):
        heap = [-int(n) for n in nums]
        heapq.heapify(heap)
        
        while k > 1:
            heapq.heappop(heap)
            k -=1
        
        return str(-heap[0])
        
