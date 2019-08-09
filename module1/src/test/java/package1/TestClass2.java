package package1;

import categories.Cats;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sample.*;

public class TestClass2 {
    @Test
    @Category(Cats.Cat1.class)
    public void TestMehod1() throws Exception {
        new SampleClass1().SampleMethod3();
        assert false;
    }

    @Test
    @Category(Cats.Cat1.class)
    public void TestMehod2() throws Exception {
        new SampleClass1().SampleMethod4();
    }
}
