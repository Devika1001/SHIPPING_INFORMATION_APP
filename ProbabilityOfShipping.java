package com.firstprogram.abc;
import java.util.Scanner;
/**
 * interface created about probability of shipping according to membership
 * as amount of subscribed membership will increases priority also increases
 * to give priority
 *      NOTE - most prioritized member who has subscribed with more than rs 1000.
 *      YES-   second prioritized member who has subscribed with  more than rs 800.
 *      MAYBE -third  prioritized member who has subscribed with more than rs. 600.
 *      SOON -4TH  prioritized member who has subscribed with more than rs. 600.
 *      LATER -5th  prioritized member who has subscribed with more than rs. 600.
 *      NEVER -last member who has subscribed with more than rs. 600.
 * @author Saugandhika
 * @version 15.0
 * @since  14-11-2020
 */
interface costants {
	int NOTE=1;
	int YES=2;
	int MAYBE =3;
	int SOON =4;
	int LATER=5;
	int NEVER=6;
	
}
/**
 * class of costumer quarry 
 * costumer asking information duration of delivery of products
 * @author Saugandhika
 * @param membership -constant to store the checking amount to give priority
 */
class CostumerQuarry implements costants
{
	Scanner scan=new Scanner(System.in);
	int quarry() {
		System.out.print("enter the amount of membership with which you are  subscribed");
	int membership=scan.nextInt();
	if(membership>=1000) {
		return NOTE;
	}
	else if(membership>=800) {
		return YES;
	}
	else if(membership>=600) {
		return MAYBE;
	}
	else if(membership>=400) {
		return SOON;
	}
	else if(membership>=200) {
		return LATER;
	}
	else
		return NEVER;
	}
}

 /**
 * class of probability of shipping
 * @author Saugandhika
 * @version 15.0
 * @since 14-11-2020
 * @return args-arguments are not used
 * in this class owner will tell duration  according to the priority  
 */
class ProbabilityOfShipping implements costants
{
	 
	  
   static void responce(int res) {
	switch (res) {
	case NOTE:
		System.out.println("awesome, its glad to inform you that the shipping is on the way it will reach you in few moments");
		break;
	case YES:
		System.out.println("hurry,your stuff is packed and it will be delivered in 2 days");
		break;
	case MAYBE:
		System.out.println(" your shipping may take time of 5 more days to pack and deliver ");
		break;
	case LATER:
		System.out.println(" your product will be delivered in next week to get it early subscribe with more amount");
		break;
	case SOON:
		System.out.println(" your product will reach you in 2 weeks to get it early subscribe with more amount");
		break;
	case NEVER:
		System.out.println("SORRY you have not subscribed any membership ");
		break;
	}
	}
	
    /**
     * @see c.quarry()- method called for querry from costumer quarry
     * @see responce()- method called for responce from owner responce
     * @param a-constant to store the object created
     */
   public static void main(String[] args)
	{
	   Scanner scan=new Scanner(System.in);
	 System.out.println("MAXIMUM APROCH THAT YOU WANT TO DO ");
	int aproach=scan.nextInt();
	for(int i=0;i<=aproach;++i) {
		
		CostumerQuarry  C = new CostumerQuarry();
		
		responce(C.quarry());

	}
	}

}


