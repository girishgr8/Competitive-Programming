x = int(input())
steps = 0
i = 5
while(x>0 and i>0):
	if not(x//i==0):
		steps+= x//i
		x-= (x//i)*i
	i-=1
print(steps)

