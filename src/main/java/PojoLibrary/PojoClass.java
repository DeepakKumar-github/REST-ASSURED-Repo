package PojoLibrary;

public class PojoClass {
	public String name;
	public String job;
	public String id;
	public String createdAt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public PojoClass(String name, String job, String id, String createdAt ) {
		super();
		this.name = name;
		this.job = job;
		this.id = id;
		this.createdAt = createdAt;
	}

}
