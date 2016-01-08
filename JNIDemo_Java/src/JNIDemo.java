
public class JNIDemo {
	public JNIDemo(){
		
	}
	
	static
	{
		System.loadLibrary("JNIDemo");
	}
	
	public native void Hello();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new JNIDemo().Hello();
	}

}
