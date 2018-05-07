package pl.sda;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException {


        Assert.assertEquals(Arrays.asList(App.getValidationResults("src\\test\\resources\\cardNumbers.csv", "src\\test\\resources\\rules.csv")).toString()
                ,Arrays.asList(App.getValidationResults("src\\test\\resources\\cardNumbers.csv", "src\\test\\resources\\rulez.csv")).toString() );

    }
}
