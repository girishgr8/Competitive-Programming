# Problem Link: https://codeforces.com/problemset/problem/768/A

n = int(input())
a = sorted([int(i) for i in input().split()])
minimum = min(a)
maximum = max(a)
c = 0
for i in a:
  if i>minimum and i<maximum:
    c+=1
    
print(c)