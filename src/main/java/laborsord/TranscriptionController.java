package laborsord;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TranscriptionController {

	@MessageMapping("/transcribe")
	@SendTo("/transcriptions/done")
	public TranscriptionMessage forward(TranscriptionMessage message) throws Exception {
		System.out.println("Mensaje recibido");
		return new TranscriptionMessage(message);
	}

}
