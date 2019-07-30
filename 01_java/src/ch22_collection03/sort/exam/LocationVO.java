package ch22_collection03.sort.exam;

public class LocationVO {
	private String local;
	private double latitude;
	private double longitude;
	
	public LocationVO(String local, double latitude, double longitude) {
		this.local = local;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return local + "," + latitude + "," + longitude;
	}
	
	
	
	
}
