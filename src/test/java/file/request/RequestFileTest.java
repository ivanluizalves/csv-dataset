package file.request;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import util.Constants;
import util.ConstantsTestHelper;

public class RequestFileTest {

    @Test
    public void testRequestFile() throws IOException {
        RequestFile rf = new RequestFile(Constants.URL);
        Assert.assertTrue(rf.isDownloaded());
    }

    @Test(expected = FileNotFoundException.class)
    public void testRequestFileMalformed() throws IOException {
        RequestFile rf = new RequestFile(Constants.URL + ConstantsTestHelper.STRING_FAIL);
        Assert.assertFalse(rf.isDownloaded());
    }

    @Test
    public void testGetFile() throws IOException {
        RequestFile rf = new RequestFile(Constants.URL);
        File file = rf.getFile();
        Assert.assertNotNull(file);
        Assert.assertEquals(file.getTotalSpace(), ConstantsTestHelper.TOTAL_SPACE_FILE);
    }

}
