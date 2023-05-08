package pack02.Phone;

public class Phone3DTO extends Phone2DTO {

	private String internetState;
	private String wtAppState;

	public Phone3DTO(String color, String model, String state, String channelInfo, String internetState, String wtAppState) {
		super(color, model, state, channelInfo);
		this.internetState = internetState;
		this.wtAppState = wtAppState;
	}

	public String getInternetState() {
		return internetState;
	}

	public void setInternetState(String internetState) {
		this.internetState = internetState;
	}

	public String getWtAppState() {
		return wtAppState;
	}

	public void setWtAppState(String wtAppState) {
		this.wtAppState = wtAppState;
	}

}