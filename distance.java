package practice;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 6378137.0;
		double F = (1/298.257223563);
		double b = 6356752.314245;
		double lat1 = 23.74355840152705;
		double lat2 = 23.763939;
		double long1 = 90.36888855285645;
		double long2 = 90.362646;
		double U1 = Math.atan((1-F)*Math.tan(lat1));
		double U2 = Math.atan((1-F)*Math.tan(lat2));
		double cos_u2 = Math.cos(U2);
		double cos_u1 = Math.cos(U1);
		double sin_u2 = Math.sin(U2);
		double sin_u1 = Math.sin(U1);
		
		double L = lat2 -lat1 ;
		double lamda = L ;
		for(int i=0; i<2; i++)
		{
			double sin_lambda = Math.sin(lamda);
			System.out.println("sin_lambda: " + sin_lambda);
			
			double cos_lambda = Math.cos(lamda);
			System.out.println("cos_lambda: " + cos_lambda);
			
			double sin_sigma = Math.sqrt(
				Math.pow(cos_u2*sin_lambda, 2) +
				Math.pow(cos_u1*sin_u2 - sin_u1*cos_u2*cos_lambda, 2)
			);
			System.out.println("sin_sigma: " + sin_sigma);
			
			double cos_sigma = sin_u1*sin_u2 + cos_u1*cos_u2*cos_lambda;
			System.out.println("cos_sigma: " + cos_sigma);
			
			double sigma = Math.atan2(sin_sigma, cos_sigma);
			System.out.println("sigma: " + sigma);
			
			double sin_alpha = (cos_u1*cos_u2*sin_lambda)/sin_sigma;
			System.out.println("sin_alpha: " + sin_alpha);
			
			double cos2alpha = 1 - Math.pow(sin_alpha, 2);
			System.out.println("cos2alpha: " + cos2alpha);
			
			double cos_sigma_m = cos_sigma - ( (2*sin_u1*sin_u2)/cos2alpha );
			System.out.println("cos_sigma_m: " + cos_sigma_m);
			
			double C = ((F/16) * cos2alpha * ( 4 + F * (4 - 3*cos2alpha) ));
			System.out.println("C: " + C);
			
			lamda = L + (1-C) * F *sin_alpha*(sigma+C*sin_sigma*(cos_sigma_m+C*cos_sigma*(-1+2*Math.pow(cos_sigma_m, 2))));
			System.out.println(lamda);
			System.out.println();
		}
	}

}
