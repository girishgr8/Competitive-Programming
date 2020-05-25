n = int(input())
ori = [int(i) for i in list(input())]
sec = [int(i) for i in list(input())]
c = 0
for i in range(n):
	c+= min(abs(ori[i]-sec[i]), 10-abs(ori[i]-sec[i]))
print(c)