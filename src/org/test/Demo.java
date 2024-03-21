package org.test;

public class Demo {

		int num;
		
		void process()
		{
		    int num = 10 ;
			int num2 = 20;
			
			int num3 = this.num + num2;
		}

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	Demo calculator = new Demo();

	        int sum1 = calculator.add(5, 10);
	        System.out.println("Sum of two integers: " + sum1);

	        int sum2 = calculator.add(5, 10, 15);
	        System.out.println("Sum of three integers: " + sum2);

	        double sum3 = calculator.add(2.5, 3.5);
	        System.out.println("Sum of two double numbers: " + sum3);
	    }
	}


