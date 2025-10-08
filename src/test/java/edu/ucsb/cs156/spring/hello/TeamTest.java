package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
        assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void equals_return_true_when_same_object(){
        assertEquals(true, team.equals(team));
    }
    @Test
    public void equals_return_false_when_different_class(){
        assertEquals(false, team.equals("not a team"));
    }
    //Team t2=new Team("T2");
    @Test
    public void equal_return_true_when_same_name_and_member(){
        Team t2=new Team("test-team");
        assertEquals(true, team.equals(t2));
    }
    @Test
    public void equal_return_when_same_name_and_different_member(){
        Team t2=new Team("T2");
        t2.addMember("Alice");
        assertEquals(false, team.equals(t2));
    }
    @Test
    public void equals_returns_false_when_different_name() {
        Team t2 = new Team("different-name");
        assertEquals(false, team.equals(t2));
    }
    
    @Test
    public void hashCode_return_expected_value(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }
}
