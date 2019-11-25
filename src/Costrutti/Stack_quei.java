package Costrutti;

public class Stack_quei {
    int i = 0;
    int j = 0;
    int I[];
    I = new int[100];

    void insert (int a; int k){
        I[k] = a;
    }
    int extract (int k){
        return I[k];
    }
    Class Stack extends Stack_quei{
        Stack()
        void push(int a)
        {i++; this.insert(a,i);
    }
    int pop();
        {return this.extract(i);i--;}
     Class Coda extends Stack_quei{
            Coda()
            void inserisci(int a);
            {

            }
        }
}
