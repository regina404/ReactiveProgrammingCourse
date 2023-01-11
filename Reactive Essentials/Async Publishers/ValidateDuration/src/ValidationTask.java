import java.time.Duration;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
public class ValidationTask {

	public static Mono<Void>  validate(Duration duration) {
		if (duration.isNegative() || duration.isZero()) {
			return Mono.error(new IllegalArgumentException("Negative or zero duration"));
		} else {
			return Mono.empty();
		}
	}
}