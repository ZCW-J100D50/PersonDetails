package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray)
    {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop()
    {
        String result = "";
        // create a `counter`
        int x = 0;
        // while `counter` is less than length of array
            // begin loop
        result = "\n";

        while (x < personArray.length)
        {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = result + "My first name is " + personArray[x].getFirstName() + "\n";
            result = result + "My last name is " + personArray[x].getLastName();
            if (x != personArray.length - 1)
            {
                result = result + "\n";
            }
            x++;
        }
        // end loop
        return result;
    }

    public String forLoop() {
        String result = "";

        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop
        result = "\n";
        for (int i = 0; i < personArray.length; i++)
        {
            result = result + "My first name is " + personArray[i].getFirstName() + "\n";
            result = result + "My last name is " + personArray[i].getLastName();
            if (i != personArray.length - 1)
            {
                result = result + "\n";
            }
        }
        // end loop
        return result;
    }

    public String forEachLoop() {
        String result = "";
        int i = 0;
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        result = "\n";
        for (Person person: personArray)
        {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = result + "My first name is " + person.getFirstName() + "\n";
            result = result + "My last name is " + person.getLastName();
            if (++i != personArray.length)
            {
                result = result + "\n";
            }
        }
        // end loop
        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
