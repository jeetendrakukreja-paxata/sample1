package package1;

import categories.Cats;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sample.*;

public class TestClass1 {
    @Category(Cats.Cat1.class)
    @Test
    public void TestMehod1() throws Exception {
        new SampleClass1().SampleMethod1();
    }

    @Test
    @Category(Cats.Cat1.class)
    public void TestMehod2() throws Exception {
        new SampleClass1().SampleMethod2();
    }
}
