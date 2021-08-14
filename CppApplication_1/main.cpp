#include <cstdlib>
#include <stdio.h>
#include <math.h>
using namespace std;
int quadraticequation(int choice){
    int a,b,c,d;
    double root1, root2;
    printf("enter quadratic equation:\n");
    scanf("%d%d%d",&a,&b,&c);
    d=b*b-4*a*c;
    if(d<0){
        printf("root1 = %.2lf + i%.2lf\n", b/(double)(2*a), sqrt(-d)/(2*a));
        printf("root2 = %.2lf - i%.2lf\n", -b/(double)(2*a), sqrt(-d)/(2*a));
  }
  else { 
    root1 = (-b + sqrt(d))/(2*a);
    root2 = (-b - sqrt(d))/(2*a);
    printf("root1 = %.2lf\n", root1);
    printf("root2 = %.2lf\n", root2);
        }
}

int bankdeposit(int choice){
	int deposit,months;
	float interest;
	double received;
	printf("\nenter deposit:");
	scanf("%d",&deposit);
	printf("\nenter interest rate:");
	scanf("%f",&interest);
	printf("\nenter months:");
	scanf("%d",&months);
	if(deposit<0){
		printf("Invalid value\n");
	}else if (interest>0.1){
		printf("Invalid value\n");
	}else if (months<0){
		printf("Invalid value\n");
	}else {
		received=deposit+deposit*interest*months;
		printf("Total amount received = %lf",received);
	}
	return received;
}

int main(int argc, char** argv) {
    int choice;
    do{
    printf("\nMenu\n");
    printf("1-Quadratic equation\n");
    printf("2-Bank deposit problem\n");
    printf("3-Quit\n");
    printf("Enter your choice:");
    scanf("%d",&choice);
    switch(choice){
    case 1:
    	quadraticequation(choice);
    	break;
    case 2:
    	bankdeposit(choice);
    	break;
    case 3:
    	printf("Exit program\n");
    	break;
    default:
    	printf("Invalid value");
	}}while(choice==1||choice==2);
    return 0;
} 
