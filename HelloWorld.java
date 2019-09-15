package myproject;

class HelloWorld {
    public static void main(String[] args) {  
    	System.out.println("Уравнение вида ax^2+bx+c");
        solver(4,55,3);
        
        System.out.println("Уравнение вида ax+b, b!=0");
        solver(0,3,-9);
        
        System.out.println("Уравнение вида ax+b, b=0, c!=0");
        solver(0,0,-9);
        
        System.out.println("Уравнение вида ax+b, b=0, c=0");
        solver(0,0,0);
        
    }
    
    
    public static void solver(int a, int b, int c) {
    	if (a!=0)
    	{
    		double d = (b*b)-(4*a*c);
    		
    		if (d>0)
    		{
    			double X1=(-b+Math.sqrt(d))/2*a;
				double X2=(-b-Math.sqrt(d))/2*a;
				
				System.out.println("Корень 1" + X1);	
				System.out.println("Корень 2" + X2);	
				
    		}
    		
    		else if (d==0)
    		{
    			double X1=(-b)/2*a;
    			System.out.println("Корень 1" + X1);	
    		}
    		
    		else 
    		{
    			System.out.println("Нет действительных корней");	
    		}
    		
    	}
    	
    	else if (a==0) 
    	{
    		if (b!=0)
    		{
    		double X=(-c)/b;
    		System.out.println("x = " + X);
    		}
    		else if (b==0 && c!=0)
    		{
    			System.out.println("Нет корней");
    		}
    		else if (b==0 && c==0)
    		{
    			System.out.println("Множество корней");
    		}
    		
    	}
    		
    	
    }
    
    
}