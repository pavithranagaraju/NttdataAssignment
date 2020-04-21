package StoredProcedure;

public class Student {
private int id;
private String name,address,gender;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


}
