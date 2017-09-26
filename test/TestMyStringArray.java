import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import ua.artcode.additional.acp11.week3.day1.IMyArray;
import ua.artcode.additional.acp11.week3.day1.MyArray;

// this annotation is not strongly required:
@RunWith(BlockJUnit4ClassRunner.class)      // runner runs tests
public class TestMyStringArray {

    public static final int TEST_ARRAY_SIZE = 10;
    private IMyArray<String> myArray;

    @Before
    public void setUp() {
        // run before each test method runs
        myArray = new MyArray<String>(TEST_ARRAY_SIZE);
    }

    @After
    public void tearDown() {
        // run any time when test method ends
    }


    // Methods of Assert:
        /*
        Assert.assertArrayEquals();

        Assert.assertEquals();
        Assert.assertNotEquals();

        Assert.assertFalse();
        Assert.assertTrue();

        Assert.assertNotNull();
        Assert.assertNull();

        Assert.assertSame();
        Assert.assertNotSame();

        Assert.assertThat();

        Assert.fail();
        */


    @Test
    public void size() {
        String element = "element";
        String expected = new String(element);

        Assert.assertEquals(0, myArray.size());
        Assert.assertTrue(myArray.addLast(element));
        Assert.assertEquals(1, myArray.size());
        Assert.assertEquals(expected, myArray.removeLast());
        Assert.assertEquals(0, myArray.size());
    }

    @Ignore     // after this annotation next test method will be ignored:
    @Test
    public void maxSize() {
        Assert.assertEquals(myArray.maxSize(), TEST_ARRAY_SIZE);
        myArray = new MyArray<String>();
        Assert.assertEquals(myArray.maxSize(), MyArray.DEFFAULT_ARRAY_LENGTH);
        myArray = new MyArray<String>(new String[]{"1", "2", "3"});
        Assert.assertEquals(myArray.maxSize(), 3);
        myArray = new MyArray<>(null);
        Assert.assertEquals(myArray.maxSize(), MyArray.DEFFAULT_ARRAY_LENGTH);
    }

    @Test
    public void addLastElement() {
//        myArray = new MyArray<String>(10);

        String element = "element";
        boolean expected = true;
        Assert.assertTrue(myArray.addLast(element));
    }

    @Test
    public void removeLastElement() {
//        myArray = new MyArray<String>(10);

        String element = "element";
        String expectedElement = new String(element);
        int expectedSize = 0;

        myArray.addLast(element);

        Assert.assertEquals(expectedElement, myArray.removeLast());
        Assert.assertEquals(expectedSize, myArray.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setElement() {
        String element = "element";
        myArray.addLast(null);


        // sometimes not needed when we use 'expected' in 'Test' annotation
        // before this method's header
        try {
            myArray.set(element, 0);
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("got an exception");
        }

        try {
            myArray.set(element, -1);
            Assert.fail("didn't get an exception");
        } catch (IndexOutOfBoundsException e) {

        }

        myArray.set(element, 10);   // will be caught by 'expected' in 'Test' annotation
                                    // before this method's header
    }



    @Test
    public void getElement() {
        String element = "element";
        String expected = new String(element);


        Assert.assertTrue(myArray.addLast(element));

        // sometimes not needed when we use expected in Test annotation
        try {
            Assert.assertEquals(expected, myArray.get(0));
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("got an exception");
        }

        try {
            myArray.get(1);
            Assert.fail("didn't get an exception");
        } catch (IndexOutOfBoundsException e) {

        }

        try {
            myArray.get(10);
            Assert.fail("didn't get an exception");
        } catch (IndexOutOfBoundsException e) {

        }

        try {
            myArray.get(-1);
            Assert.fail("didn't get an exception");
        } catch (IndexOutOfBoundsException e) {

        }
    }

}
