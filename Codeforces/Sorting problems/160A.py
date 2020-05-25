#Problem Link: https://codeforces.com/problemset/problem/141/A

n = input()
arr = sorted([int(i) for i in input().split()], reverse=True)
total = sum(arr)
twin = 0
i = 0
while i<len(arr) and twin<=total/2:
  twin+=arr[i]
  i+=1
print(i)