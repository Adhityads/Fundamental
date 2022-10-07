package com.juaracoding.dayfive;

    class Vehicle {//Parent class
        int maxSpeed = 120;
    }

    // sub class Car extending vehicle
    class Car extends Vehicle {
        int maxSpeed = 180;

        void display()
        {
            // print maxSpeed of base class (vehicle)
            System.out.println("Maximum Speed: "
                    + super.maxSpeed); //variable maxspeed diambil dari scope superclass/parentclass
        }
    }

    public class KeywordSuperOne {
        public static void main(String[] args)
        {
            Car small = new Car();
            small.display();
        }
    }
