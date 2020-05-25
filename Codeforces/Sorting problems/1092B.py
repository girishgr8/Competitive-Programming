# Problem Link: https://codeforces.com/problemset/problem/1092/B

n = int(input())
a = sorted([int(i) for i in input().split()])
diff = 0

for i in range(0,n-1,2):
  diff+=a[i+1]-a[i]

print(diff)