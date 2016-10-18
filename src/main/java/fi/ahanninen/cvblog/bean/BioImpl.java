package fi.ahanninen.cvblog.bean;

public class BioImpl implements Bio {

	int bioId;
	String name;
	String birthday;
	String email;
	String bioDescription;
	String pictureUri;
	
	public int getBioId() {
		return bioId;
	}
	public void setBioId(int bioId) {
		this.bioId = bioId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBioDescription() {
		return bioDescription;
	}
	public void setBioDescription(String bioDescription) {
		this.bioDescription = bioDescription;
	}
	public String getPictureUri() {
		return pictureUri;
	}
	public void setPictureUri(String pictureUri) {
		this.pictureUri = pictureUri;
	}
	
	@Override
	public String toString() {
		return "BioImpl [bioId=" + bioId + ", name=" + name + ", birthday="
				+ birthday + ", email=" + email + ", bioDescription="
				+ bioDescription + ", pictureUri=" + pictureUri + "]";
	}

}
