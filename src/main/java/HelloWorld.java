
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by pchaivong on 4/28/2017 AD.
 */
public class HelloWorld implements RequestHandler<Request, Response> {
    public Response handleRequest(Request request, Context context) {
        String responseStr = String.format("Hello %s %s", request.firstName, request.lastName);

        return new Response(responseStr);
    }
}
