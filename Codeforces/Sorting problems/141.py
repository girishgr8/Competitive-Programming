#Problem Link: https://codeforces.com/problemset/problem/141/A

a = input()
b = input()
w = sorted(list((a+b)))
c = sorted(list(input()))
if w == c:
  print('YES')
else:
  print('NO')
