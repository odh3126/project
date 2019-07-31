package ch22_collection03.sort.exam;

public class LocationVO {
	private String local; //지역
	private double latitude; // 위도
	private double longitude; // 경도
	private double sum; 
	
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

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return local + "," + latitude + "," + longitude;
	}

}