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
        assertEquals("yuchaozheng05", Developer.getGithubId());
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
        assertTrue(t.getMembers().contains("YUCHAO"),"Team should contain YUCHAO");
        assertTrue(t.getMembers().contains("ARMAN EHSAN"),"Team should contain ARMAN EHSAN");
        assertTrue(t.getMembers().contains("SICHENG"),"Team should contain SICHENG"); 
        assertTrue(t.getMembers().contains("IAN KENTO IZUKA"),"Team should contain IAN KENTO IZUKA");
        assertTrue(t.getMembers().contains("JAKINDA"),"Team should contain JAKINDA");
        assertTrue(t.getMembers().contains("MATT ARTHUR"),"Team should contain MATT ARTHUR");
    }

}
