package ua.nure.ostpc.second.lesson;

public class PracticeTask {
    /**
     * 1. Init variables with following types:
     * Short,
     * Char,
     * Int,
     * Double
     */
    short a =20000;
    char x='b';
    int b=15;
    double c=2.23;
    /*
       2. Convert char to int
       int to double
       short max value + short max value to int
       and to double
     */
int CharToInt =(int)x;
double IntToDouble=(double)b;
int MaxShort1=(int)Short.MAX_VALUE+(int)Short.MAX_VALUE;
double Maxshort2=(double)Short.MAX_VALUE+(double)Short.MAX_VALUE;
    /*
        show the hierarchy of automatical
        cast of data types and explain why it works
     */
byte q=2;
short w=q;
int e=w;
long r=e;
float t=r;
double y=t;
    /*
    Use the same hierarchy for boxed values (Number, Character, Integer etc)
    And explain how boxing works
     */
    short boxedshort=new Short(Byte.MAX_VALUE);
    int boxedint=new Integer(Short.MAX_VALUE);
    /*
    Show the ability to import static members of any library (Math for example)
     */

}
