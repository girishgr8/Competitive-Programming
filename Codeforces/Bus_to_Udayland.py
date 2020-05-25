n = int(input())
a = []
for i in range(n):
	a.append(input())

present = False
for i in range(len(a)):
	if not(a[i].count('OO')== 0):
		a[i] = a[i].replace('OO','++',1)
		present = True
		break

if(present==True):
	print('YES')
	for s in a:
		print(s)
else:
	print('NO')
