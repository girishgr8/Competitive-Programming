n = int(input())
a = [int(i) for i in input().split()]
gr = max(a)
a.sort()
burles = 0
for i in range(len(a)):
	burles+= (gr-a[i])
print(burles)