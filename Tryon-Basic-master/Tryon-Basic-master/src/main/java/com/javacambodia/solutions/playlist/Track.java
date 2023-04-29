/**
 * 
 */
package com.javacambodia.solutions.playlist;

/**
 * @author pongs
 *
 */
public class Track {
	private int id;
	private String name;
	private String type;
	private float duration;
	
	public Track(int id, String name, String type, float duration) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.duration = duration;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return "ID: " + this.getId() +
				", NAME: " + this.getName() + 
				", TYPE: " + this.getType() +
				", DURATION: " + this.getDuration();
	}

}
