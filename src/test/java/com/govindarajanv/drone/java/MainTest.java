package com.govindarajanv.drone.java;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MainTest extends TestCase {

    @Test
    public void testGetOne() {
        assertThat(Main.greet(), is("Hi"));   
        assertThat(Main.greet(), is(not("Bye")));
    }

}
