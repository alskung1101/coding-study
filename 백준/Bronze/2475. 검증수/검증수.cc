#include <stdio.h>
int main(){
    int a,b,c,d,e;
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    int s;
    s=(a*a+b*b+c*c+d*d+e*e)%10;
    printf("%d",s);
}