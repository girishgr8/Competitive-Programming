// Problem Link: https://codeforces.com/problemset/problem/977/C

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int main() {
// #ifdef _DEBUG
// 	freopen("input.txt", "r", stdin);
//   freopen("output.txt", "w", stdout);
// #endif
  int n,k,ans,num;
  cin>>n>>k;
  vector<int> a;
  for(int i=0;i<n;i++){
    cin>>num;
    a.push_back(num);
  }
  a.resize(n);
  sort(a.begin(),a.end());
  if(k==0)
    ans = a[0]-1;
  else
    ans = a[k-1];
  int c=0;
  for(int i=0;i<n;i++)
    if(a[i]<=ans)
      c+=1;
  if(c!=k || ans<1)
    cout<<(-1)<<endl;
  else
    cout<<ans<<endl;
}