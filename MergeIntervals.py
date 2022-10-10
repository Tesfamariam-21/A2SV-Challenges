class Solution(object):
    def merge(self, intervals):
        intervals.sort(key = lambda i : i[0])
        result = [intervals[0]]
        
        for start, end in intervals[1:]:
            lastEnd = result[-1][1]
            if start <= lastEnd:
                result[-1][1] = max(lastEnd, end)
            else:
                result.append([start, end])
        
        return result      
        
