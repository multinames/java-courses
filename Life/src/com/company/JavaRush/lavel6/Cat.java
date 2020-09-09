package com.company.JavaRush.lavel6;

class Cat {

    public static int catCount;

    public Cat() {
        catCount++;
    }
    public static void main(String[] args) {

    }


        protected void finalize() throws Throwable
        {
          catCount--;
        }
}
