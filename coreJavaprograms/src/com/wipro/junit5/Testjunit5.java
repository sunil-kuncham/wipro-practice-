package com.wipro.junit5;



	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;

	class Testjunit5{

		@BeforeEach
		public void beforeEach() {
			System.out.println("before each method executed");
		}

		@AfterEach
		public void afterEach() {
			System.out.println("after each method executed");
		}

		@Test
		@DisplayName("testing test1 method")
		public void test1() {
			System.out.println("iam test1 method executed");
		}

		@Test
		@Disabled
		public void test2() {
			System.out.println("iam test2 method executed");
		}
		@BeforeAll
		public static void beforeAll()
		{
			System.out.println("iam executed before but only once");
		}
		@AfterAll
		public static void afterAll()
		{
			System.out.println("iam executed after all test but only once");
		}
	}	


