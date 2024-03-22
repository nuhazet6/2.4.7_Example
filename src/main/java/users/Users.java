package users;

public interface Users {
	public Boolean registered = false;
	public Boolean logged = false;
	public void Register();
	public void Login();
	public String getTierCard();
	public Cards getPersonalCard();
}
