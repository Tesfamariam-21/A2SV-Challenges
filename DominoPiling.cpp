#include <iostream>
using namespace std;

int main(){
    int m,n, area, max_domino;
    cout<< "enter m: ";
    cin>>m;
    cout<< "enter n: ";
    cin>>n;
    
    area = m*n;
    max_domino = area/2;
    cout<< "number of dominos: "<<max_domino;
}
