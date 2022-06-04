package com.app;



import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class C04SortArraysInSpecifiedTimeTest {

	@Test
	void sortArraysInASpecifiedTimeTest1() {
		C04SortArraysASpecifiedTime obj=new C04SortArraysASpecifiedTime();
	assertTimeout(Duration.ofSeconds(5),()->IntStream.rangeClosed(1, 100000).
			forEach(t->obj.sortArraysInASpecifiedTime()));
		
		
	}
	C04SortArraysASpecifiedTime obj=new C04SortArraysASpecifiedTime();
	@RepeatedTest(10000)
	void sortArrayInSpecifiedTimeTest2() {
		assertTimeout(Duration.ofSeconds(5),()->obj.sortArraysInASpecifiedTime());
		
	}
	}
