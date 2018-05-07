package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckLuhnTest {
        @Test
    public void checkLuhnTest(){
            CheckLuhn checkLuhnTest = new CheckLuhn();

            Assert.assertFalse(checkLuhnTest.checkLuhn("1234567893"));
            Assert.assertTrue(checkLuhnTest.checkLuhn("423456789"));
            Assert.assertTrue(checkLuhnTest.checkLuhn("6262626262626262"));
        }
}