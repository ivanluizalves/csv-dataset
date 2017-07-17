package command;

import org.junit.Assert;
import org.junit.Test;

import util.ConstantsTestHelper;

public class CommandBuilderTest {
    private CommandBuilder builder = new CommandBuilder();

    @Test
    public void readCommandOkTest() {
        for (int i = 0; i < ConstantsTestHelper.COMMANDS_OK.length; i++) {
            Assert.assertNotNull(this.builder.readCommand(ConstantsTestHelper.COMMANDS_OK[i]));
        }
    }

    @Test
    public void readCommandNOkTest() {
        for (int i = 0; i < ConstantsTestHelper.COMMANDS_OK.length; i++) {
            Assert.assertNull(this.builder.readCommand(ConstantsTestHelper.COMMANDS_NOK[i]));
        }
    }
}
