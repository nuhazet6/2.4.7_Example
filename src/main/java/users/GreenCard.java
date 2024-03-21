package users;

import org.springframework.stereotype.Component;

@Component
public class GreenCard implements Cards {
	public Boolean walk=true;
	public Boolean fly=false;
	@Override
	public String getTier() {
		// TODO Auto-generated method stub
		return "Tier 1";
	}

}
