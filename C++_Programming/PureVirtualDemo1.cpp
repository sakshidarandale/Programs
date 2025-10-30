#include<iostream>
using namespace std;

class Base
{
    public: int i,j;

    int Addition(int a,int b) //concrete function
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

    

    

};
int main()
{
    

    Base *bp=new Derived();//Upcasting

    
    return 0;
}