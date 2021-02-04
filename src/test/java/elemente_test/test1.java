/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemente_test;

/**
 *
 * @author Asus
 */

    interface Engine {
        public int getFuelCapacity();
    }

    class Car {
        class OttoEngine implements Engine {
            private int fuelCapacity;

            public OttoEngine(int fuelCapacity) {
                this.fuelCapacity = fuelCapacity;
            }

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        }

        public OttoEngine getEngine() {
            OttoEngine engine = new OttoEngine(11);
            return engine;
        }
    }
 
    public class test1 {
        public static void main(String[] args) {
            Car car = new Car();

            Car.OttoEngine firstEngine = car.getEngine();
            Car.OttoEngine secondEngine = car.new OttoEngine(10);

            System.out.println(firstEngine.getFuelCapacity());
            System.out.println(secondEngine.getFuelCapacity());
        }
    }

