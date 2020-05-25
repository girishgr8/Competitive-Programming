# Problem Link: https://codeforces.com/problemset/problem/1220/A

letters = int(input())
a = input()
z = a.count('z')
e = a.count('e')
r = a.count('r')
o = a.count('o')
n = a.count('n')
m = min(e,o)
ones = 0
if n>=m:
  ones = m
  o-=m
  e-=m
else:
  ones = min(m,n)
  o-=ones
  e-=ones
zeroes = min(z,min(e,min(r,o)))

for i in range(ones):
  print(1, end=' ')
for i in range(zeroes):
  print(0, end=' ')
print()