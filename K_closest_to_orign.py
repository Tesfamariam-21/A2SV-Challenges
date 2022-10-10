class Solution(object):
    def sorting_function(self, lst):
        return lst[0]**2 + lst[1]**2
    
    def kClosest(self, points, k):
        sorted_lst = sorted(points, key= self.sorting_function)
        return sorted_lst[0:k]
     
