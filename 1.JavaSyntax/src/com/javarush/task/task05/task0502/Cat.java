package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int advantage=Integer.compare(this.age,anotherCat.age) +
        Integer.compare(this.weight,anotherCat.weight) +
        Integer.compare(this.strength,anotherCat.strength);
        return advantage>0?true:false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.weight = 100;
        cat2.weight = 156;
        cat1.age = 10;
        cat2.age = 7;
        cat1.strength = 10;
        cat2.strength = 106;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}

/*   another one possible solution for this task, please, try - works as expected, but doesn't pass validation *****************

            int aAge = this.age > anotherCat.age ? 1 : 0;
            int aWeight = this.weight > anotherCat.weight ? 1 : 0;
            int aStrenght = this.strength > anotherCat.strength ? 1 : 0;

            int sum = aAge + aWeight + aStrenght;

            return sum >= 2;

*/

/*   another one possible solution for this task, please, try - works as expected, but doesn't pass validation *****************

        int c1 = 0, c2 = 0; // initialize counter for cat1 and cat2
        if (this.weight > anotherCat.weight && this.weight != anotherCat.weight) {
            c1++;
        } else {
            c2++;
        }

        if (this.age > anotherCat.age && this.age != anotherCat.age) { // compare weights of two cats
            c1++; // cat1 wins
        } else {
            c2++; // cat2 wins
        }

        if (this.strength > anotherCat.strength && this.strength != anotherCat.strength) {
            c1++; // cat1 wins
        } else {
            c2++; // cat2 wins
        }

        if (c1 == c2) { // if this fight is equals
            return false;
        }

        if (c1 > c2) { // cat1 wins
            return true;
        } else {
            return false; // cat1 fails
        }
 */
