package Proxy.ProxyDP;
import java.io.IOException;
public class C2 implements C1 {

	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "command executed.");
	}

	public void runCommand1(String cmd) {
		// TODO Auto-generated method stub
		
	}

}