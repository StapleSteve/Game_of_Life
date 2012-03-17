package gameoflife;

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CellTest {

    private Cell cell;

    @Before
    public void setUp() throws Exception {
        this.cell = new Cell();
    }

    @Test
    //for this test i wrote an implementation example to show that you should always strive for the easiest solution to solve a test.
    //even if it is just to return a hardcoded value.
    public void testCellIsAlive() throws Exception {
        this.cell.setAlive(true);
        assertTrue("The cell should be alive! but it isn't",this.cell.isAlive());
    }

    @Test
    public void testCellIsDead() throws Exception {
        this.cell.setAlive(false);
        assertFalse("The cell should be dead! but it isn't",this.cell.isAlive());
    }
}
