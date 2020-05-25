from math import gcd
a,b,n = map(int,input().split())
while(True):
	r1 = gcd(a,n)
	if r1>n:
		print(1)
		break
	else:
		n-=r1
	r2 = gcd(b,n)
	if r2>n:
		print(0)
		break
	else:
		n-=r2
