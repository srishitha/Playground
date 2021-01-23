#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,i,left,right;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  left = 0;
  right = n-1;
  while(1)
  {
    if(left>=right)
      break;
    if(a[left]==0)
      left++;
    else if(a[right]==1)
      right--;
    else
    {
      a[left]=0;
      a[right]=1;
      left++;
      right--;
    }
  }
  for(i=0;i<n;i++)
    cout<<a[i];
}