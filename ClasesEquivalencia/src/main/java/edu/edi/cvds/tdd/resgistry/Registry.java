package edu.edi.cvds.tdd.resgistry;
import java.util.ArrayList;

import edu.edi.cvds.tdd.resgistry.Person;

public class Registry {
    private ArrayList<Person> Name = new ArrayList<Person>();


    public RegisterResult registerVoter(Person p) {
        int age = p.getAge();
        int cc = p.getId();


        if ( age < 18) {
            return RegisterResult.INVALID_AGE;
        }
        else  if (age < 0 && age<18){
            return  RegisterResult.UNDERAGE;
        }
        else if (!(p.isAlive())){
            return  RegisterResult.DEAD;
        }
        else  if ( p.isAlive() && (age > 18)){
            return  RegisterResult.VALID;
        }

        else {
            for (int i = 0; i < Name.size(); ++i) {
                if (Name.get(i).getName() == p.getName()) {
                    return RegisterResult.DUPLICATED;
                }
            }
        }





        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }
}
