package dto;

/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	
    
    private int id;
    
    private String name;
    
    private int age;
    
    private int depId;

    
    public Member() {
    }
    
    public Member(int id, String name, int age, int depId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.depId = depId;
    }
    

    public Member(String name, int age, int depId) {
        this.name = name;
        this.age = age;
        this.depId = depId;
    }
    public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDepId() {
        return depId;
    }
    public void setDepId(int depId) {
        this.depId = depId;
    }

}
