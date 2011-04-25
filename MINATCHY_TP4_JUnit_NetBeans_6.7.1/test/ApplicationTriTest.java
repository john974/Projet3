

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olivierperrin
 */
public class ApplicationTriTest {

    long numbers[] = {4, 3, 8, 9, 7, 2, 1, 5};
    long sortedNumbers[] = {1, 2, 3, 4, 5, 7, 8, 9};
    long testNumbers[];

    public ApplicationTriTest() {
    }

    @Before
    public void setUp() throws Exception {
        testNumbers = new long[8];
        System.arraycopy(numbers, 0, testNumbers, 0, 8);
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of triFusionNonRecursif method, of class ApplicationTri.
     */
    @Test
    public void testTriFusionNonRecursif() {
        System.out.println("triFusionNonRecursif");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        long[] b = {1, 2, 3, 4, 9, 11, 12, 15};
        ApplicationTri.triFusionNonRecursif(a);

        assertArrayEquals(b, a);
        //fail("The test case is a prototype.");
    }

     /**
     * Test of triFusionRecursif method, of class ApplicationTri.
     */
    @Test
    public void testTriFusionRecursif() {
        System.out.println("triFusionRecursif");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        long[] b = {1, 2, 3, 4, 9, 11, 12, 15};
        ApplicationTri.triFusionRecursif(a);
        
        assertArrayEquals(b, a);
        //fail("The test case is a prototype.");
    }

   /**
     * Test of triABulle method, of class ApplicationTri.
     */
    @Test
    public void testTriABulle() {
        System.out.println("triABulle");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        long[] b = {1, 2, 3, 4, 9, 11, 12, 15};
        ApplicationTri.triABulle(a);
        assertArrayEquals(b, a);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of quicksort method, of class ApplicationTri.
     */
    @Test
    public void testQuicksort() {
        System.out.println("quicksort");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        long[] b = {1, 2, 3, 4, 9, 11, 12, 15};
        ApplicationTri.quicksort(a);
        assertArrayEquals(b, a);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fusion method, of class ApplicationTri.
     */
    @Test
    public void testFusion() {
        System.out.println("fusion");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        long[] tableauTravail = {1, 2, 3, 4, 9, 11, 12, 15};
        int pointeurInf = 0;
        int pointeurMax = 3;
        int borneMax = 7;
        ApplicationTri.fusion(a, tableauTravail, pointeurInf, pointeurMax, borneMax);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of partition method, of class ApplicationTri.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        long[] a = {3, 9, 12, 1, 2, 4, 11, 15};
        int premier = 0;
        int dernier = 7;
        int indexPivot = 5;
        int expResult = 3;

        int result = ApplicationTri.partition(a, premier, dernier, indexPivot);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

 
    /**
     * Test of swap method, of class ApplicationTri.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        long[] a = {1, 3, 5, 2, 4};
        long[] b = {3, 1, 5, 2, 4};
        int i = 1;
        int j = 0;
        ApplicationTri.swap(a, i, j);
        assertArrayEquals(b, a);
        //fail("The test case is a prototype.");
    }

}