package package1;

import org.junit.Test;
import sample.SampleClass2;

public class TestClass11 {
    @Test
    public void TestMehod1() throws Exception {
        new SampleClass2().SampleMethod1();
    }

    @Test
    public void TestMehod2() throws Exception {
        new SampleClass2().SampleMethod2();
    }
}
