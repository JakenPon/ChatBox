import java.util.List;

public class Discussion {
	private List<User> listPeople;
	private String nameDiscussion;
	private String probableMessage;
	
	public Discussion(
			List<User> listPeople,
			String nameDiscussion,
			String probableMessage
	) {
		this.listPeople = listPeople;
		this.nameDiscussion = nameDiscussion;
		this.probableMessage = probableMessage;
	}
}
