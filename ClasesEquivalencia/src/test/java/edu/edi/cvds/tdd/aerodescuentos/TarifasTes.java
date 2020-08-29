package edu.edi.cvds.tdd.aerodescuentos.;

import org.junit.Assert;
import org.junit.Test;
import edu.edi.cvds.tdd.aerodescuentos.*;
import edu.edi.cvds.tdd.aerodescuentos.

public class TarifasTes {
    @Test
    public void CalculoTarifas(){
        Assert.assertEquals(2,CalculadorDecuentos.calculTarifa(1,10,20));
    }

}
