package edu.edi.cvds.tdd.registry;
import  edu.edi.cvds.tdd.resgistry.*;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    /*
    @Test
    public void validateRegistryResult() {

        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    */
    @Test
    public  void validateAge(){
        Person paula = new Person();
        paula.setAge(0);
        RegisterResult result = registry.registerVoter(paula);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    // TODO Complete with more test cases
}
