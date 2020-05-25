# Problem Link: https://codeforces.com/problemset/problem/479/C

class Exam:
  def __init__(self, actual, early):
    self.actual = actual
    self.early = early

exams = []
n = int(input())
for i in range(n):
  a,e = map(int,input().split())
  exams.append(Exam(a,e))

exams.sort(key=lambda x: (x.actual, x.early))

minimum = -1
for i in range(n):
  if minimum<=exams[i].early:
    minimum = exams[i].early
  else:
    minimum = exams[i].actual

print(minimum)