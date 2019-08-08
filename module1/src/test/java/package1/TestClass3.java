package package1;

import org.junit.Test;
import sample.*;

public class TestClass3 {
    @Test
    public void TestMehod1() throws Exception {
        new SampleClass2().SampleMethod1();
    }

    @Test
    public void TestMehod2() throws Exception {
        new SampleClass2().SampleMethod2();
    }
}
