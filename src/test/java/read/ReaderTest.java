package read;

import org.junit.Assert;
import org.junit.Test;

import util.ConstantsTestHelper;

public class ReaderTest {

    @Test
    public void testGetHeader() {
        Reader reader = new Reader();
        Assert.assertEquals(reader.getHeader(), ConstantsTestHelper.HEADER);
    }

    @Test
    public void testList() {
        Reader reader = new Reader();
        Assert.assertNotNull(reader.getListCitys());
    }

    @Test
    public void testListSize() {
        Reader reader = new Reader();
        Assert.assertEquals(reader.getListCitys().size(), ConstantsTestHelper.LIST_FULL_SIZE);
    }
}
