package me.yoryor.learn;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Michal on 2017/11/2 下午2:32.
 */
public class SkillGraphTest {

    @Test
    public void getResultReturnZeroWhenSkillGraphEmpty() throws Exception {
        // arrange
        SkillGraph skills = new SkillGraph();
        // act and assert -- matchers style
        assertThat(skills.getResult(), equalTo(0d));
        // act and assert -- classic style
        assertTrue(skills.getResult() == 0);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getResultThrowIllegalArgumentExceptionWhenAddNullValue() throws Exception {
        expectedException.expectMessage("Skill can not be null.");
        expectedException.expect(IllegalArgumentException.class);
        // arrange
        SkillGraph skills = new SkillGraph();
        // act
        skills.add(null);
        // assert
    }

}