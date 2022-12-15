package com.assignment;

public class Assi1_CountInvalidInteger {

		public static void main(String[] args) {
			int sum = 0;
			int sum1=0;
			System.out.println("Calculates Sum for below Integers");
			
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
				
							try {
				  if(Integer.parseInt(args[i])>0)
				{
					sum = sum + Integer.parseInt(args[i]);
				} 
				else
				{
					sum1++;
					}
							}

				catch (NumberFormatException e) {
					sum1++;
				//System.out.println("Invalid integer command line arguments: " + e.toString());
				}
			}
			System.out.println("Sum :" + sum);
			System.out.println("Invalid integer command line arguments: " + sum1);

			}
	

}
