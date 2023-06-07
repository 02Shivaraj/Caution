#include<stdio.h>
int main(){
    printf("Enter range: ");
    int a;
    scanf("%d",&a);
    int flag=0,count=0;
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            if(i%j==0)
                count++;
        }
    }
    return 0;
}
