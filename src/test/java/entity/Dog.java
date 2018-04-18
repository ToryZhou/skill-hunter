/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package entity;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 3:56 PM
 */
public class Dog {
    private String active;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


    public static final class DogBuilder {
        private String active;

        private DogBuilder() {
        }

        public static DogBuilder aDog() {
            return new DogBuilder();
        }

        public DogBuilder withActive(String active) {
            this.active = active;
            return this;
        }

        public Dog build() {
            Dog dog = new Dog();
            dog.setActive(active);
            return dog;
        }
    }
}
