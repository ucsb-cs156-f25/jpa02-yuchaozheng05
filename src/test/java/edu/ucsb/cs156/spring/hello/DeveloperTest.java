package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Yuchao Zheng.", Developer.getName());
    }
    @Test
    public void getGithubId_returns_correct_githubId(){
        assertEquals("yuchaozheng05.", Developer.getGithubId());
    }
    // @Test
    // public void getTeam_returns_team_with_correct_name() {
    //     Team  t = Developer.getTeam();
    //     assertEquals("f25-07", t.getName());
    // }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void getTeam_returns_team_with_correct_name() {
    Team t = Developer.getTeam();
    assertEquals("f25-07", t.getName());
}
    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Yuchao Zheng"),"Team should contain Yuchao Zheng");
        assertTrue(t.getMembers().contains("Arman Sajjadian"),"Team should contain Arman Sajjadian");
        assertTrue(t.getMembers().contains("Evelyn Xu"),"Team should contain Evelyn Xu"); 
        assertTrue(t.getMembers().contains("Ian Sheinis"),"Team should contain Ian Sheinis");
        assertTrue(t.getMembers().contains("Jakinda Zhang"),"Team should contain Jakinda Zhang");
        assertTrue(t.getMembers().contains("Matthew Mandell"),"Team should contain Matthew Mandell");
    }

}
