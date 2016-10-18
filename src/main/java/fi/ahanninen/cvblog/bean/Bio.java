package fi.ahanninen.cvblog.bean;

public interface Bio {

	public abstract int getBioId();
	public abstract void setBioId(int bioId);
	
	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract String getBirthday();
	public abstract void setBirthday(String birthday);
	
	public abstract String getEmail();
	public abstract void setEmail(String email);
	
	public abstract String getBioDescription();
	public abstract void setBioDescription(String bioDescription);
	
	public abstract String getPictureUri();
	public abstract void setPictureUri(String pictureUri);
	
}
