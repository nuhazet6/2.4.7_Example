package users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tier1User implements Users {
	public Boolean registered=false;
	public Boolean logged=false;
	private Cards personalCard;
	
	
	@Autowired
	public void setPersonalCard(Cards card) {
		this.personalCard = card;
	}
	
	public String getTierCard() {
		return personalCard.getTier();
	}
	
	public Cards getPersonalCard() {
		return personalCard;
	}

	@Override
	public void Register() {
		// TODO Auto-generated method stub
		this.registered=true;
	}


	@Override
	public void Login() {
		// TODO Auto-generated method stub
		if(this.registered) {
			this.logged=true;
		}		
	}

	
}
