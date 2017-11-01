package lab6;

public class SimpsonsCharacter {
	
	String name;
	String linkName;
	int numOfPhotos;
	int randomNumber;
	
	public SimpsonsCharacter(String name, int numOfPhotos){
		this.name = name;
		this.numOfPhotos = numOfPhotos;
		this.linkName = name.replaceAll(" ", "_").toLowerCase();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkName(){
		return linkName;
	}
	
	public int getNumOfPhotos() {
		return numOfPhotos;
	}

	public void setNumOfPhotos(int numOfPhotos) {
		this.numOfPhotos = numOfPhotos;
	}
	
	public int getRandomNumber(){
		randomNumber = (int) (Math.random() * (numOfPhotos + 1) - 1);
		return randomNumber;
	}
	

}
