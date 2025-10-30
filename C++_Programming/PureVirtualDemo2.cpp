#include<iostream>
using namespace std;

class Base
{
    public: int i,j;

    int Addition(int a,int b) //Concrete function
    {
        return a+b;
    }

    virtual int Substraction(int a,int b) //Abstract  (Pure Virtual Function)
    {
        return a-b;
    }
    
};
class Derived : public Base
{
    public:
    int x;

    int Substraction(int a,int b) //Concrete function
    {
        return a-b;
    }

    int Multiplication(int a,int b) //Concrete function
    {
        return a*b;
    }


};
int main()
{
    Base *bp=new Derived();//Upcasting

    int iRet=0;

    iRet=bp->Addition(11,10); //21
    cout<<iRet<<"\n";

    iRet=bp->Substraction(11,10);//1
    cout<<iRet<<"\n";

    // iRet=bp->Multiplication(11,10); //ERROR






    
    return 0;
}