#include<iostream>
#include<math.h>
 
using namespace std;
 
int main(){
    double h, w, s;
 
    cin >> h >> w >> s;
 
    h = ceil(h/s);
    w = ceil(w/s);
 
    long long res = h*w;
 
    cout << res;
 
}
