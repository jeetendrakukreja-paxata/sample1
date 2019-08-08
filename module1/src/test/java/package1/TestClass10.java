package package1;

import categories.Cats;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sample.SampleClass2;

public class TestClass10 {
    @Test
    @Category(Cats.Cat3.class)
    public void TestMehod1() throws Exception {
        new SampleClass2().SampleMethod1();
    }

    @Test
    @Category(Cats.Cat3.class)
    public void TestMehod2() throws Exception {
        new SampleClass2().SampleMethod2();
    }
}
