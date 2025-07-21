#include<stdio.h>
#include<math.h>


void print_menu();
double divide(double,double);
double modulus(int ,int);


int main()
{
double first,second,result;
int choice;
while (1)
{
print_menu();
scanf("%d", &choice);
if (choice==7)
{
    break;
}
if (choice<1||choice>7)
{
    fprintf(stderr,"invalid input plz choose enter 1 to 7");
    continue;
}

printf("enter first number\n");
scanf("%lf", &first);

printf("enter second number\n");
scanf("%lf", &second);

switch (choice)
{
case 1://add
   result = first + second;
    break;

    case 2://subtract
    result = first - second;
    break;

    case 3://multiply
    result = first * second;
    break;

    case 4://divide
     result = divide(first,second);
    break;

    case 5://modulus
    result = modulus((int)first,(int)second);
    break;

    case 6://power
   result = pow(first,second);
    break;
}

    if (!isnan(result))
    {
        printf("The result of your program is %.2f",result);
    }
    
}
return 0;
}



void print_menu(){
    printf("\n\n---------------------------------------\n");
    printf("welcome to the simple calculator\n");
printf("choose a function to perform\n");
printf("1. ADD\n");
printf("2. SUBTRACT\n");
printf("3. MULTIPLY\n");
printf("4. DIVIDE\n");
printf("5. MODULUS\n");
printf("6. power\n");
printf("7. to exit\n");
printf("Now make a choice\n");

} 

double divide(double a, double b){
    if (b == 0)
    {
        fprintf(stderr, "invalid input for division\n");
        return NAN;
    }
    else
    {
        return a / b;
    }
}

double modulus(int a,int b){
if (b==0)
{
    fprintf(stderr,"invalid input for division\n");
    return NAN;
}else
{
    return a % b;
}
}