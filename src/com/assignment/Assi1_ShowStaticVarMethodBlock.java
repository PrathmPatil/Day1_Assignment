package com.assignment;

public class Assi1_ShowStaticVarMethodBlock {

		static int x=10;
		static int y;
		static void m1(int z)
		{
			System.out.println("Static method block");
			System.out.println(x+y+z);
		}
		static {
			System.out.println("Only static Block");
			y= x+ 5;
		}
		public static void main(String[] args) {
			m1(4);
		}

	}


