class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        res = []
        for i in range(1, n+1):
            list = ""
            if( i%3 == 0) and (i%5 == 0):  
                list +="FizzBuzz"
            elif( i%3 != 0) and (i%5 != 0):
                list +=f'{i}'
            elif i% 3 == 0:
                list +="Fizz"
               
            elif i%5 == 0:
                # return "Buzz"
                list +="Buzz"    
            res.append(list)
        return res
