package package1;

import org.junit.Test;
import sample.*;

public class TestClass1 {
    @Test
    public void TestMehod1() throws Exception {
        new SampleClass1().SampleMethod1();
    }

    @Test
    public void TestMehod2() throws Exception {
        new SampleClass1().SampleMethod2();
    }
}