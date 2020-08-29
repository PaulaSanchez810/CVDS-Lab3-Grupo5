package edu.edi.cvds.tdd.resgistryTest;
import edu.edi.cvds.tdd.resgistry.Gender;
import edu.edi.cvds.tdd.resgistry.Person;
import edu.edi.cvds.tdd.resgistry.RegisterResult;
import edu.edi.cvds.tdd.resgistry.Registry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public  void validateAge(){
        Person paula = new Person();
        paula.setAge(0);
        RegisterResult result = registry.registerVoter(paula);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void equivalenceClassNum1() {
        //String name, int id, int age, Gender gender, boolean alive
        Person person = new Person("Fabio", 193705,63, Gender.MALE,true);
        Person person2 = new Person("fabian", 103285,22,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result2);
    }

    @Test
    public void equivalenceClassNum2() {

        //String name, int id, int age, Gender gender, boolean alive
        Person person = new Person("Laura", 103250,21,Gender.FEMALE,true);
        Person person2 = new Person("sofia", 146589,19,Gender.FEMALE,true);

        registry.registerVoter(person);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);

        Person person3 = new Person("antonia", 968532,19,Gender.UNIDENTIFIED,true);

        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);


    }
    @Test
    public void equivalenceClassNum3() {

        //String name, int id, int age, Gender gender, boolean alive

        Person person = new Person("fernanda", 205879,27,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);

    }

    @Test
    public void equivalenceClassNum4() {


        //String name, int id, int age, Gender gender, boolean alive
        Person person = new Person("thomas", 145263,25,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);

    }

    @Test
    public void equivalenceClassNum5() {

        //String name, int id, int age, Gender gender, boolean alive

        Person person = new Person("tania", 172839,36,Gender.FEMALE,true);
        Person person2 = new Person("orlando", 486879,21,Gender.MALE,true);



        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);

        Person person3 = new Person("memo", 153546,21,Gender.MALE,true);


        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }

    // TODO Complete with more test cases
}

