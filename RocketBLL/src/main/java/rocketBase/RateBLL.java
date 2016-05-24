package rocketBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Object;
import org.apache.poi.ss.formula.functions.FinanceLib;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static RateDomainModel getRate(int GivenCreditScore) throws RateException
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		ArrayList<RateDomainModel>rates = _RateDAL.getAllRates();
		RateDomainModel rate = null;
		if (GivenCreditScore>=600 && GivenCreditScore<650)
			rate = rates.get(0);
		if (GivenCreditScore>=650 && GivenCreditScore<700)
			rate = rates.get(1);
		if (GivenCreditScore>=700 && GivenCreditScore<750)
			rate = rates.get(2);
		if (GivenCreditScore>=750 && GivenCreditScore<800)
			rate = rates.get(3);
		if (GivenCreditScore>=800)
			rate = rates.get(4);
		else throw new RateException(rate);
		return rate;
		
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate

	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public final static class FinanceLib extends java.lang.Object{

		public static double getPayment(double r, double n, double p, double f, boolean t) {
			// TODO Auto-generated method stub
			
	{		
		return FinanceLib.getPayment(r, n, p, f, t);
}
}}}
