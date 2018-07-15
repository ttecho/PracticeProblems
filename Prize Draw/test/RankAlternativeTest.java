import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankAlternativeTest {

    @Test
    public void testNoParticipants() {
        String st = "";
        Integer[] we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("No participants", RankAlternative.nthRank(st, we, 4));
    }

    @Test
    public void testNotEnoughParticipants() {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("Not enough participants", RankAlternative.nthRank(st, we, 8));
    }

    @Test
    public void testHappyPath() {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[]{4, 2, 1, 4, 3, 1, 2};
        assertEquals("Benjamin", RankAlternative.nthRank(st, we, 4));
    }

    @Test
    public void testTwoIdenticalWinningNumbers() {
        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer[] we = new Integer[]{1, 3, 5, 5, 3, 6};
        assertEquals("Matthew", RankAlternative.nthRank(st, we, 2));
    }

    @Test
    public void sampleTestFromKata() {
        String st = "Aubrey,Olivai,Abigail,Chloe,Andrew,Elizabeth";
        Integer[] we = new Integer[]{3,1,4,4,3,2};
        int n = 4;
        assertEquals("Abigail", RankAlternative.nthRank(st, we, n));
    }

    @Test
    public void sampleTest2FromKata() {
        String st = "Noah,Ava,Mia,Ethan,Robert,James,William,Emily,Sofia,Willaim,Madison,Matthew,Jacob,Isabella,Joshua";
        Integer[] we = new Integer[]{5,4,1,2,1,2,1,4,1,4,5,1,3,2,3};
        int n = 8;
        assertEquals("Jacob", RankAlternative.nthRank(st, we, n));
    }
}
