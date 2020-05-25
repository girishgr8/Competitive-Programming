# Problem Link: https://codeforces.com/problemset/problem/456/A

class Laptop:
  def __init__(self, price, quality):
    self.price = price
    self.quality = quality

def custom_key(obj):
  return obj.price


n = int(input())
laptops = []
for i in range(n):
  price, quality = map(int, input().split())
  laptops.append(Laptop(price,quality))

found = False
laptops.sort(key=custom_key)

for i in range(n-1):
  if laptops[i].price != laptops[i+1].price and laptops[i].quality>laptops[i+1].quality:
      print('Happy Alex')
      found = True
      break
      
if not(found):
  print('Poor Alex')
