package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SDACardValidatorTest {
    @Test
    public void test() throws IOException {
        SDACardValidator sdaCardValidator = new SDACardValidator();
        CSVFileReader reader = new CSVFileReader();
        Card analyze = sdaCardValidator.analyze("4462030000000000", reader.read("src\\test\\resources\\rulez.csv"));
        Assert.assertTrue(analyze.isVerificationPassed());
        Assert.assertEquals("Visa", analyze.getIssuer());
    }


}