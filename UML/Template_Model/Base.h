/**
 * Project Untitled
 */


#ifndef _BASE_H
#define _BASE_H

class Base {
public: 
    int publicAttribute = 1;
    
/**
 * @param P1
 */
string publicMethod(int P1);
protected: 
    float projectedAttribute = 1.0;
    string packageAttribute = hello;
    
void protectedMethod();
    
void packageMethod();
private: 
    double privateAttribute = 1.0;
    
void privateMethod();
};

#endif //_BASE_H