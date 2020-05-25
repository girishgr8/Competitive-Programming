// Problem Link: https://codeforces.com/problemset/problem/551/A
#include <iostream>
#include <algorithm>
#include <vector>
#include <map>
#include <set>
using namespace std;
int main() {
  
  #ifdef ONLINE_JUDGE
  	freopen(fi, "r", stdin);
    freopen(fo, "w", stdout);
  #endif

  int n,num;
  cin>>n;
  map<int,int,greater<int>> m;
  set<int,greater<int>> v;
  vector<int> a;
  for(int i=0;i<n;i++){
    cin>>num;
    v.insert(num);
    a.push_back(num);
  }
  int c = 0;
  vector<int> f(v.begin(),v.end());
  for(int i=0;i<f.size();i++){
    if(i!=0)
      m.insert(make_pair(f[i],(i+1+c)));
    else
      m.insert(make_pair(f[i],(i+1)));
    c+= count(a.begin(),a.end(),f[i])-1;
    // cout<<"Count of "<<f[i]<<" is: "<<c<<endl;
  }
  for(int i=0;i<a.size();i++){
    auto it = m.find(a[i]);
    cout<<it->second<<" ";
  }
  cout<<endl;
  // for(auto itr = m.begin(); itr != m.end(); ++itr) { 
  //   cout << itr->first<< '\t' << itr->second << '\n'; 
  // } 
  // cout << endl; 
}