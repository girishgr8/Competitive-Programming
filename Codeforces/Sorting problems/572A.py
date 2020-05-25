# Problem Link: https://codeforces.com/problemset/problem/572/A

def findOccurence(b,q,num):
  for i in range(q):
    if b[i]>num:
      return i
  return -1

p,q = map(int,input().split())
k,m = map(int,input().split())
a = sorted([int(i) for i in input().split()])
b = sorted([int(i) for i in input().split()])
index = findOccurence(b,q,a[k-1])

if index == -1:
  print("NO")
else:
  if q-index>=m:
    print("YES")
  else:
    print("NO")