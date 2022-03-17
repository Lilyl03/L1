package com.company.d18.clone;

public class CloneMaker<T extends ConstructorCloneable<T>>{

    public T printCloneAndPrint(T input){
        System.out.println(input);
        T newCloneObject = input.doClone();
        System.out.println(newCloneObject);
        return newCloneObject;
    }
}
