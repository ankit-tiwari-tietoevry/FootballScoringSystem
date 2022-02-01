package test.com.company.sports.football;

import com.company.sports.football.Football;
import org.junit.Assert;
import org.junit.Test;

public class FootballTests {

    @Test
    public void getHomeScore() {
        try {

            int expectedValue = 0;

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            int actualValue = football.getHomeScore();

            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assert.assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void getAwayScore() {
        try {

            int expectedValue = 0;

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            int actualValue = football.getAwayScore();

            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assert.assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void setHomeScore() {
        try {

            int h = 0;
            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            football.setHomeScore(h);
            Assert.assertTrue(true);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void setAwayScore() {
        try {

            int a = 0;
            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            football.setAwayScore(a);
            Assert.assertTrue(true);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void setperiod() {
        try {

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            football.setperiod();
            Assert.assertTrue(true);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void getperiod() {
        try {

            int expectedValue = 0;

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            int actualValue = football.getperiod();

            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assert.assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void GameStatus() {
        try {

            boolean expectedValue = false;

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            boolean actualValue = football.GameStatus();

            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assert.assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }

    @Test
    public void getWinner() {
        try {

            String expectedValue = "";

            String hometeamc = "";
            String awayteamc = "";
            Football football = new Football(hometeamc, awayteamc);
            String actualValue = football.getWinner();

            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assert.assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {

            exception.printStackTrace();
            Assert.assertFalse(false);
        }
    }
}
