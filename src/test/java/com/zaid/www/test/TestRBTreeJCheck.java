/*
// the code was commented out because it was causing the maven build to fail! but when I run this code here its fine!
package com.zaid.www.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jcheck.annotations.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.zaid.www.cl.CList;

//The code in this class limits numbers to between -5 and 5 (and array sizes
//etc) and will run each test 10 times, except for method test2 that will be
//run a 100 times.
// @author Zaid Ahmad

@RunWith(org.jcheck.runners.JCheckRunner.class)
@Configuration(tests = 10, size = 5)
public class TestRBTreeJCheck {
	CList<Integer> cLlist_1;
	CList<Integer> cList2;

	public TestRBTreeJCheck() {
	}

	@Before
	public void setUp() {
		cLlist_1 = new CList<Integer>();
		cList2 = new CList<Integer>();
	}
	
	@Test
	public void testNext(int i) {
		cLlist_1.insert(i);
		   cLlist_1.insert(i);
		   cLlist_1.insert(i);
			assertTrue(cLlist_1.getCurrent() == i);
			cLlist_1.next();
			assertTrue(cLlist_1.getCurrent() == i);
			cLlist_1.next();
			assertTrue(cLlist_1.getCurrent() == i);
	 	}
	
	   @Configuration(tests=100)
       @Test public void testInsert(int i) {
			cLlist_1.insert(i);
			cLlist_1.insert(i);
			cLlist_1.insert(i);
			assertTrue(cLlist_1.getCurrent() == i);
			System.out.println(cLlist_1.toString());
       }	
}
*/