#include<iostream>
int main()
{
  int a,b,c;
    std::cout << "Enter first number :";
    std::cin >>a;
    std::cout << " Enter second number : ";
    std::cin>>b>>c;
    std::cout<<"Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  switch(c)
  {
      case 1 : std::cout<<a+b;
      break;
      case 2 : std::cout<<a-b;
      break;
      case 3 : std::cout<<a*b;
      break;
      case 4 : std::cout<<a/b;
      break;
      case 5 : std::cout<<a%b;
      break;
    default : std::cout<<"Invalid operation";
      break;
  }
}
  