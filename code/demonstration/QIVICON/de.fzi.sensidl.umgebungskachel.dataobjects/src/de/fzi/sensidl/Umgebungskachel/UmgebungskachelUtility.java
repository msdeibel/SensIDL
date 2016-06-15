/**
*File:							src/de/fzi/sensidl/Umgebungskachel/UmgebungskachelUtility.java
*Version:						
*Generate at:					17/05/2016 15:12:21
*Further generated artifacts:	src/de/fzi/sensidl/Umgebungskachel/AlertThresholdTemperature.java, 
*								src/de/fzi/sensidl/Umgebungskachel/AlertThresholdBrightness.java, 
*								src/de/fzi/sensidl/Umgebungskachel/SensorState.java, src/de/fzi/sensidl/Umgebungskachel/LedToggle.java
*/

package de.fzi.sensidl.Umgebungskachel;
 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import com.google.gson.Gson;

/**
 * Data transfer object for UmgebungskachelUtility
 *
 * @generated
 */
class UmgebungskachelUtility {
	public static double linearConversion(Number independentVariable, double scalingFactor, double offset) throws IllegalArgumentException {
		// Conversion is calculated by the linear-function f(x) = m*x + b
		double calculatedValue = (scalingFactor * independentVariable.doubleValue()) + offset;
		
		if (getMaxValueOf(independentVariable) >= calculatedValue) {
			return calculatedValue;
		} else {
			throw new IllegalArgumentException("The value is larger than the range of the data type.");
		}
	}
	private static double getMaxValueOf(Number number) {
		if (number instanceof Byte) {
			return Byte.MAX_VALUE;	
		} else if (number instanceof Short) {
			return Short.MAX_VALUE;	
		} else if (number instanceof Integer) {
			return Integer.MAX_VALUE;
		} else if (number instanceof Long) {
			return Long.MAX_VALUE;
		} else if (number instanceof Float) {
			return Float.MAX_VALUE;
		} else {
			return Double.MAX_VALUE;
		}
	}
	
	
	
	/**
	 * Alternative method responsible for serializing JSON
	 * 
	 * @return Json String
	 */
	public static String marshalJSON(Object elementToMarshall) { 
		Gson gson = new Gson();
		
		if (elementToMarshall instanceof AlertThresholdBrightness) {
			return gson.toJson((AlertThresholdBrightness) elementToMarshall);
		}
		
		if (elementToMarshall instanceof AlertThresholdTemperature) {
			return gson.toJson((AlertThresholdTemperature) elementToMarshall);
		}
		
		if (elementToMarshall instanceof LedToggle) {
			return gson.toJson((LedToggle) elementToMarshall);
		}
		
		if (elementToMarshall instanceof SensorState) {
			return gson.toJson((SensorState) elementToMarshall);
		}
		
		return null;
	}
	
	/**
	 * Alternative method responsible for deserializing the received
	 * JSON-formatted L stage from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side in a JSON
	 *            format
	 * @return T unmarshalled T structure
	 */
	public static <T> T unmarshalJSON(BufferedReader dataset, T obj) { 
		
		Gson gson = new Gson();
		BufferedReader br = dataset;
		obj = gson.fromJson(br, obj.getClass());
		return obj;
	}
	
	/**
	 * Method responsible for deserializing the received byte array
	 * representation of L from sensor.
	 * 
	 * @param dataset
	 *            the dataset to unmarshall incoming from sensor side as a byte
	 *            array
	 * @return T unmarshalled T structure
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static <T> T unmarshalByteArray(byte[] dataset) throws IOException, ClassNotFoundException {
		
		ByteArrayInputStream in = new ByteArrayInputStream(dataset);
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		T unmarshalledObject = (T) o; // TODO: Ensure the type conversion is valid
		in.close();
		if (in != null) {
			ois.close();
		}
		return unmarshalledObject;
	}
	
	/**
	 * Method responsible for serializing Byte-Array
	 */
	public static AlertThresholdBrightness marshalAlertThresholdBrightnessByteArray() {
		//TODO: implement Method
		return null;
	}
	/**
	 * Method responsible for serializing Byte-Array
	 */
	public static AlertThresholdTemperature marshalAlertThresholdTemperatureByteArray() {
		//TODO: implement Method
		return null;
	}
	/**
	 * Method responsible for serializing Byte-Array
	 */
	public static LedToggle marshalLedToggleByteArray() {
		//TODO: implement Method
		return null;
	}
	/**
	 * Method responsible for serializing Byte-Array
	 */
	public static SensorState marshalSensorStateByteArray() {
		//TODO: implement Method
		return null;
	}
}