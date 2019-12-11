import org.apache.log4j.Logger;

public class LogDemo {
	static Logger logger=Logger.getLogger(LogDemo.class);
public static void main(String[] args) {
	int a,b,c;
	
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
			logger.info("success Result = " +c);
			
		}
		catch(ArithmeticException e){
			logger.info(e.getClass());
		}
		catch(ArrayIndexOutOfBoundsException e){
			logger.info(e.getClass());
		}
		catch (NumberFormatException e) {
			logger.info(e.getClass());
		}
		
	
	}
	
}
