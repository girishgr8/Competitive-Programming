n = int(input())
a = [[1]*n]*n
for i in range(n):
	for  j in range(n):
		if i == 0 or j == 0:
			a[i][j] = 1
		else:
			a[i][j] = a[i-1][j] + a[i][j-1]
print(a[n-1][n-1])