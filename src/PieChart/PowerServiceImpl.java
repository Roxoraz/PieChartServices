package PieChart;

import javax.jws.WebService;
import java.math.BigInteger;

@WebService( endpointInterface= "PieChart.WSInterface")
public class PowerServiceImpl implements WSInterface {

	@Override
	public Response calculatePower(Request request) {
		ObjectFactory factory = new ObjectFactory();
		Response response = factory.createResponse();
		Double result = Math.pow(request.getX().doubleValue(), request
				.getPower().doubleValue());
		// x en power zijn altijd gehele getallen dan is er geen afronding
		BigInteger actualResult = BigInteger.valueOf(result.longValue());
		response.setResult(actualResult);
		return response;
	}

}
