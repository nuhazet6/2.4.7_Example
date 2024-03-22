package users;

public interface Cards {
	public Boolean walk=false;
	public Boolean fly=false;
	public Integer level=0;
	public String getTier();
	public void improveLevel();
}
