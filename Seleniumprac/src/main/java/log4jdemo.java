
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class log4jdemo {

	private static Logger logger =  LogManager.getLogger(log4jdemo.class);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Hello world");
		logger.info("tjis is info msg");
		logger.error("Error");
		logger.warn("warning");
		logger.fatal("fatal");
		System.out.print("completed");
		
	}

}
