// Problem Link: https://codeforces.com/problemset/problem/230/B

#include <iostream>
#include<bits/stdc++.h> 

using namespace std; 
const long long MAX_SIZE = 1000001; 
vector<long long>isprime(MAX_SIZE , true); 
vector<long long>prime; 
vector<long long>SPF(MAX_SIZE); 

void segmented_seive(int N) { 
	isprime[0] = isprime[1] = false ; 
	for (long long int i=2; i<N ; i++){ 
		if (isprime[i]) { 
			prime.push_back(i); 
			SPF[i] = i; 
		} 
		for (long long int j=0; j < (int)prime.size() && i*prime[j] < N && prime[j] <= SPF[i]; j++) { 
			isprime[i*prime[j]]=false; 
			SPF[i*prime[j]] = prime[j] ; 
		} 
	} 
} 

int main() { 
  segmented_seive(1000000); 
	long long n; 
  cin>>n;
  long long a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];

  vector<long long> T_primes;
	for (int i=0; i<prime.size(); i++)
		T_primes.push_back(pow(prime[i],2));
  sort(T_primes.begin(),T_primes.end());
  for(int i=0;i<n;i++){
    if(binary_search(T_primes.begin(),T_primes.end(),a[i]))
      cout<<"YES"<<endl;
    else
      cout<<"NO"<<endl;
  }
	return 0; 
}
