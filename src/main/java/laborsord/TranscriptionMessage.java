package laborsord;

public class TranscriptionMessage {

	private String partial;
	private String noPartial;

	public TranscriptionMessage(TranscriptionMessage message) {
		this.partial = message.getPartial();
		this.noPartial = message.getNoPartial();
	}

	public TranscriptionMessage(String partial, String noPartial) {
		this.partial = partial;
		this.noPartial = noPartial;
	}

	public String getPartial() {
		return partial;
	}

	public void setPartial(String partial) {
		this.partial = partial;
	}

	public String getNoPartial() {
		return noPartial;
	}

	public void setNoPartial(String noPartial) {
		this.noPartial = noPartial;
	}
}
