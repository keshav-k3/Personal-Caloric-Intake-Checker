package Checker;

import java.util.Scanner;


class First
{  int c1,p1;

	static void welcome()
	{
		System.out.println("\nWELCOME TO YOUR CALORIE CHECKER\n");
		
	}
	
	static void menu()
	{ 
		System.out.println("\nMENU\n1=Enter Breakfast Items\n2=Enter Lunch Items\n3=Enter Dinner Items\n4=Find Total Calories\n5=Exit\n");
	}
	
	static void checkinfo()
	{   double bmi;
		System.out.println("Before we check the total amount of calories you are consuming,let us find the ideal caloric intake for your Height and Weight ");
		System.out.println();
		System.err.println("BMI CHECKER");
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter your age ");                                  //age
		double a = ch.nextDouble();
		System.out.println("Enter your height in centimeters ");                //height
		int h = ch.nextInt();
		double h1=h; //UPCASTING --> To get height in meters
		h1=h1/100;
		System.out.println("Enter your weight in kgs ");                        //weight
		double w = ch.nextDouble();
		bmi=(w/(h1*h1));                                                        //total BMI
		System.out.println();
		System.out.println("Your current BMI is " + bmi);
		double bmr;                                                             //BMR --> BASIC METABOLLIC RATE
		bmr = ( 10* w ) + ( 6.25 * h ) - ( 5 * a ) + 5 + 450;                         //Mifflin-St Jeor Equation
		System.out.println();
		System.out.println("Your Current Daily Caloric Intake is " + bmr + " calories");
		System.out.println();
		
		if(bmi<18.5)
		{   
			System.out.println("Your current BMI category --> UNDERWEIGHT WEIGHT CATEGORY");
			System.out.println("You can reach your ideal BMI by maintaining a healthy Caloric Surplus");
			System.out.println("So your new Caloric Intake will be " + (bmr+500) );
		}
		else if(bmi>=18.5 && bmi <=25)
		{
			
			System.out.println("Your current BMI category --> NORMAL WEIGHT CATEGORY"); 
			System.out.println("You can continue with your current caloric intake, that is "+ bmr + " calories");
		}
		else
		{
			System.out.println("Your current BMI category --> OVERWEIGHT WEIGHT CATEGORY");
			System.out.println("You can reach your ideal BMI by maintaining a healthy Caloric Deficit");
			System.out.println("So your new Caloric Intake will be " + (bmr-500) );
		}
	}
	
	void breakfast()
	{int q=1; 
	do {
		Scanner in = new Scanner(System.in);
		System.out.println("NOTE: All food items are taken as proper minimum caloric intake required/ taken per 1 serving(100g)");
        System.out.print("Enter Food ");
        String food =in.nextLine();
        System.out.println("Entered food is --> \t" + food);
        
        if(food.equals("dosa"))
        {
     	   c1+=154;
     	   p1+=3.6;
     	  
        }
        else if(food.equals("idly"))
        {
        	c1+=78;
        	p1+=2.5;
        }
        
        else if(food.equals("bread"))
        {
        	c1+=54;
        	p1+=1.7;
        }
        
        else if(food.equals("appam"))
        {
        	c1+=117;
        	p1+=1.7;
        }
        
        else if(food.equals("milk"))
        {
        	c1+=168;
        	p1+=8;
        }
        
        else if(food.equals("chutney"))
        {
        	c1+=31;
        	p1+=0.1;
        }
        
        else if(food.equals("puttu"))
        {
        	c1+=176;
        	p1+=2.7;
        }
        
        else if(food.equals("poori"))
        {
        	c1+=167;
        	p1+=4;
        }
        else if(food.equals("coffee"))
        {
        	c1+=164;
        	p1+=4.4;
        }
        else if(food.equals("chai"))
        {
        	c1+=73;
        	p1+=3.1;
        }
        
        else
        {
        	System.out.println(" Invalid Food Item Entered ");
        }
        System.out.println();
        System.out.println("Total Calories Eaten for Breakfast is\t"+ c1 + "\nTotal Protein value for Breakfast is\t"+ p1);
        System.out.println();
        System.out.println("Enter 1 to continue 0 to exit");
        q=in.nextInt();
        
	}while(q!=0);
	}

}

class Second extends First{
	int c2,p2,c3,p3;
	
	void lunch()
	{int q=1; 
	do {
		Scanner in = new Scanner(System.in);
		System.out.println("NOTE: All food items are taken as proper minimum caloric intake required/ taken per 1 serving(100g)");
        System.out.print("Enter Food ");
        String food =in.nextLine();
        System.out.println("Entered food is --> \t" + food);
        
        if(food.equals("rice"))
        {
     	   c2+=120;
     	   p2+=2.6;
     	  
        }
        else if(food.equals("sambar"))
        {
        	c2+=115;
        	p2+=5.6;
        }
        
        else if(food.equals("curd"))
        {
        	c2+=90;
        	p2+=4.7;
        }
        
        else if(food.equals("papad"))
        {
        	c2+=46;
        	p2+=2.1;
        }
        
        else if(food.equals("chapatti"))
        {
        	c2+=85;
        	p2+=3;
        }
        
        else if(food.equals("paneer butter masala"))
        {
        	c2+=217;
        	p2+=10.5;
        }
        
        else if(food.equals("dal"))
        {
        	c2+=139;
        	p2+=9.1;
        }
        
        else if(food.equals("fried rice"))
        {
        	c2+=137;
        	p2+=2.7;
        }
        else if(food.equals("tomato rice"))
        {
        	c2+=123;
        	p2+=2.3;
        }
        else if(food.equals("chicken biryani"))
        {
        	c2+=156;
        	p2+=10.7;
        }
        else if(food.equals("curd rice"))
        {
        	c2+=122;
        	p2+=3.4;
        }
        else if(food.equals("gulab jamun"))
        {
        	c2+=225;
        	p2+=2.5;
        }
        else if(food.equals("icecream"))
        {
        	c2+=173;
        	p2+=1.4;
        }
        
        else
        {
        	System.out.println(" Invalid Food Item Entered ");
        }
        System.out.println();
        System.out.println("Total Calories Eaten for Lunch is\t"+ c2 + "\nTotal Protein value for Lunch is\t"+ p2);
        System.out.println();
        System.out.println("Enter 1 to continue 0 to exit");
        q=in.nextInt();
        
	}while(q!=0);
	}

	
	void dinner()
	{int q=1; 
	do {
		Scanner in = new Scanner(System.in);
		System.out.println("NOTE: All food items are taken as proper minimum caloric intake required/ taken per 1 serving(100g)");
        System.out.print("Enter Food ");
        String food =in.nextLine();
        System.out.println("Entered food is --> \t" + food);
        
        if(food.equals("tomato soup"))
        {
     	   c3+=93;
     	   p3+=2;
     	  
        }
        else if(food.equals("bread"))
        {
        	c3+=54;
        	p3+=1.7;
        }
        
        else if(food.equals("dosa"))
        {
        	c3+=154;
        	p3+=3.6;
        }
        
        else if(food.equals("pizza"))
        {
        	c3+=132;
        	p3+=6;
        }
        
        else if(food.equals("chapatti"))
        {
        	c3+=85;
        	p3+=3;
        }
        
        else if(food.equals("paneer butter masala"))
        {
        	c3+=217;
        	p3+=10.5;
        }
        
        else if(food.equals("dal"))
        {
        	c3+=139;
        	p3+=9.1;
        }
        
        else if(food.equals("fried rice"))
        {
        	c3+=137;
        	p3+=2.7;
        }
        else if(food.equals("idly"))
        {
        	c3+=78;
        	p3+=2.5;
        }
        else if(food.equals("curd rice"))
        {
        	c3+=122;
        	p3+=3.4;
        }
        else if(food.equals("gulab jamun"))
        {
        	c3+=225;
        	p3+=2.5;
        }
        else if(food.equals("icecream"))
        {
        	c3+=173;
        	p3+=1.4;
        }
        else if(food.equals("chutney"))
        {
        	c3+=31;
        	p3+=0.1;
        }
        
        
        else
        {
        	System.out.println(" Invalid Food Item Entered ");
        }
        System.out.println();
        System.out.println("Total Calories Eaten for Dinner is\t"+ c3 + "\nTotal Protein value for Dinner is\t"+ p3);
        System.out.println();
        System.out.println("Enter 1 to continue 0 to exit");
        q=in.nextInt();
        
	}while(q!=0);
	}
	
	void total()
	{
		System.out.println("Total Calories eaten for the day is "+ (c1+c2+c3) + " calories");
		System.out.println("Total Protein intake for the day is "+ (p1+p2+p3) + " grams");
		if((p1+p2+p3)>=50)
			System.out.println("Your protein intake is above average,good job.");
		else
			System.out.println("Your protein intake is below average,try eating more natural proteins like eggs.");
		
		System.out.println();
		System.out.println("***THANK YOU, HAVE A WONDERFUL HEALTHY DAY***");
	}
	
}


public class CalCheck extends Second {

	public static void main(String[] args) {
		int q=1;
		//String i="\0";
		int i;
		CalCheck myobj = new CalCheck();
		welcome();
		checkinfo();
		System.out.println();
		System.out.println("**CALORIC CHECKER**");
        menu();
         

       Scanner x = new Scanner(System.in);
        
     
   do { 
	   System.out.println("Enter Your Choice");
       i = x.nextInt();
        switch(i)
        {
        case 1: myobj.breakfast();
                System.out.println("Total Calories consumed for breakfast is" + myobj.c1 + " and total portein intake is " + myobj.p1);
                System.out.println();
                menu();
                break;
        
        case 2: myobj.lunch();
                System.out.println("Total Calories consumed for lunch is" + myobj.c2 + " and total portein intake is " + myobj.p2);
                System.out.println();
                menu();
                break;
                
        case 3: myobj.dinner();
                System.out.println("Total Calories consumed for lunch is" + myobj.c2 + " and total portein intake is " + myobj.p2);
                System.out.println();
                menu();
                break;
        
        case 4: myobj.total();
                i=5;
                break;
                
        default:break;
        
        
        }
   }while(i!=5); 

   
     
		
        
      
	}

}
