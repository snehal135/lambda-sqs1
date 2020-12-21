package demo.com.lambda_sqs1;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<SQSEvent,Void>
{

	@Override
	public Void handleRequest(SQSEvent input, Context context) {
		for(SQSMessage msg : input.getRecords()){
            System.out.println(new String(msg.getBody()));
        }		return null;
	}
}
