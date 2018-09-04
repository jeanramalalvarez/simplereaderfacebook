package com.simplereaderfacebook.bean;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Place {

	private String id;
	
	private String name;
	
	private String about;
	
	private Location location;
	
	@SerializedName("category_list")
	private List<Category> categoryList = null;
	
	private Cover cover;
	
	private String phone;
	
	private String website;
	
	private String link;
	
	private Integer checkins;
	
	@SerializedName("fan_count")
	private Integer fanCount;
	
	private Hour hours;
	private Engagement engagement;
	private Context context;
	
	@SerializedName("is_always_open")
	private boolean isAlwaysOpen;
	
	@SerializedName("is_permanently_closed")
	private boolean isPermanentlyClosed;
	
	@SerializedName("overall_star_rating")
	private Double overallStarRating;
	
	private Parking parking;
	
	private Photos photos;
	
	private Picture picture;
	
	@SerializedName("price_range")
	private String priceRange;
	
	@SerializedName("rating_count")
	private Integer ratingCount;

	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", about=" + about + ", location=" + location + ", categoryList="
				+ categoryList + ", cover=" + cover + ", phone=" + phone + ", website=" + website + ", link=" + link
				+ ", checkins=" + checkins + ", fanCount=" + fanCount + ", hours=" + hours + ", engagement="
				+ engagement + ", context=" + context + ", isAlwaysOpen=" + isAlwaysOpen + ", isPermanentlyClosed="
				+ isPermanentlyClosed + ", overallStarRating=" + overallStarRating + ", parking=" + parking
				+ ", photos=" + photos + ", picture=" + picture + ", priceRange=" + priceRange + ", ratingCount="
				+ ratingCount + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}
	
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getCheckins() {
		return checkins;
	}

	public void setCheckins(Integer checkins) {
		this.checkins = checkins;
	}

	public Integer getFanCount() {
		return fanCount;
	}

	public void setFanCount(Integer fanCount) {
		this.fanCount = fanCount;
	}

	public Hour getHours() {
		return hours;
	}

	public void setHours(Hour hours) {
		this.hours = hours;
	}

	public Engagement getEngagement() {
		return engagement;
	}

	public void setEngagement(Engagement engagement) {
		this.engagement = engagement;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public boolean isIsAlwaysOpen() {
		return isAlwaysOpen;
	}

	public void setIsAlwaysOpen(boolean isAlwaysOpen) {
		this.isAlwaysOpen = isAlwaysOpen;
	}

	public boolean isIsPermanentlyClosed() {
		return isPermanentlyClosed;
	}

	public void setIsPermanentlyClosed(boolean isPermanentlyClosed) {
		this.isPermanentlyClosed = isPermanentlyClosed;
	}

	public Double getOverallStarRating() {
		return overallStarRating;
	}

	public void setOverallStarRating(Double overallStarRating) {
		this.overallStarRating = overallStarRating;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Photos getPhotos() {
		return photos;
	}

	public void setPhotos(Photos photos) {
		this.photos = photos;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

}