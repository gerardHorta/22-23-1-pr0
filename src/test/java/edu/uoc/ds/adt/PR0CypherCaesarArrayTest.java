package edu.uoc.ds.adt;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class PR0CypherCaesarArrayTest {
    PR0CypherCaesarArray pr0Array;
    @Before
    public void setUp() {
        this.pr0Array = new PR0CypherCaesarArray("Data structures are cool and essential for computing");
    }
    @After
    public void release() {
        this.pr0Array = null;
    }
    @Test
    public void arrayTest() {
        //Data structures are cool and essential for computing
        //Ebub tusvduvsft bsf dppm boe fttfoujbm gps dpnqvujoh
        char[] expected= {'E','b','u','b', ' ','t','u',
                's','v','d','u','v','s','f','t',' ',
                'b','s','f',' ','d','p','p','m',' ',
                'b','o','e',' ','f','t','t','f','o',
                'u','j','b','m',' ','g','p','s',' ',
                'd','p','n','q','v','u','j','o','h'};
        Assert.assertArrayEquals(expected, this.pr0Array.cypher2Array(1));
        Assert.assertEquals("Ebub tusvduvsft bsf dppm boe fttfoujbm gps dpnqvujoh",
                this.pr0Array.cypher(1) );
        Assert.assertEquals("Fcvc uvtwevwtgu ctg eqqn cpf guugpvkcn hqt eqorwvkpi",
                this.pr0Array.cypher(2) );
        Assert.assertEquals("Gdwd vwuxfwxuhv duh frro dqg hvvhqwldo iru frpsxwlqj",
                this.pr0Array.cypher(3) );
        //...
        Assert.assertEquals("Czsz rsqtbstqdr zqd bnnk zmc drrdmshzk enq bnlotshmf",
                this.pr0Array.cypher(25) );
        Assert.assertEquals("Data structures are cool and essential for computing",
                this.pr0Array.cypher(26) );
    }
}
