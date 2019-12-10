package com.company;

public abstract class AbstractAnimal {
    protected String name;
    protected int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "name:" + name + "\n age:" + age;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj instanceof Cat){
            return ((Cat) obj).name.equals(this.name) && ((Cat) obj).age == age;

        }
        return false;
    }
}
