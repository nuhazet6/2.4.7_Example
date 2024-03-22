package users;

import org.springframework.stereotype.Component;

@Component
public class GreenCard implements Cards {
	public Boolean walk=true;
	public Boolean fly=false;
	private Integer level=1;
	@Override
	public String getTier() {
		// TODO Auto-generated method stub		
		return "Tier "+level;
	}
	@Override
	public void improveLevel() {
		level++;
	}

}
