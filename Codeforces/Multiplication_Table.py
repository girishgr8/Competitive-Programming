from functools import reduce
from math import sqrt, floor
def findFactors(n):    
    return list(set(reduce(list.__add__, ([i, n//i] for i in range(1, int(n**0.5) + 1) if n % i == 0))))

n,x = map(int,input().split())
fac = sorted(findFactors(x))
final_fac = []
i = 0
j =len(fac)-1
while(i<j):
	if fac[j] <= n:
		final_fac.append(fac[i])
		final_fac.append(fac[j])
	j-=1
	i+=1
c = len(final_fac)
if((sqrt(x)-floor(sqrt(x))) == 0 and int(sqrt(x))<=n):
	c+=1
print(c)