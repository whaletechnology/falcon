package falcon.fix;

public class MessageTypes {

	public static final String HEARTBEAT_VALUE = "0";
	public static final String TEST_REQUEST_VALUE = "1";
	public static final String RESEND_REQUEST_VALUE = "2";
	public static final String REJECT_VALUE = "3";

	public static final MessageType Heartbeat = new MessageType(HEARTBEAT_VALUE);
	public static final MessageType TestRequest = new MessageType(TEST_REQUEST_VALUE);
	public static final MessageType ResendRequest = new MessageType(RESEND_REQUEST_VALUE);
	public static final MessageType Reject = new MessageType(REJECT_VALUE);
	public static final MessageType SequenceReset = new MessageType("4");
	public static final MessageType Logout = new MessageType("5");
	public static final MessageType ExecutionReport = new MessageType("8");
	public static final MessageType Logon = new MessageType("A");
	public static final MessageType NewOrderSingle = new MessageType("D");

}
