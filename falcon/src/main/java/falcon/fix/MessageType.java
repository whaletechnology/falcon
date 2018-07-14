package falcon.fix;

import java.util.Objects;

/**
 * A message type specifies which fields a message contains.
 */
public class MessageType {

	private final String value;

	public MessageType(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MessageType that = (MessageType) o;
		return Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "MessageType{" +
				"value='" + value + '\'' +
				'}';
	}
}
