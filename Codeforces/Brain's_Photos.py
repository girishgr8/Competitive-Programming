n, m = map(int,input().split())
colors = {'C':0, 'M':0, 'Y':0, 'W':0, 'B':0, 'G':0}
for i in range(n):
	x = [str(c) for c in input().split()]
	for c in x:
		colors[c]+=1

if(colors['C']==0 and colors['Y']==0 and colors['M']==0):
	print('#Black&White')
else:
	print('#Color')
