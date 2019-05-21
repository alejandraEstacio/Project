package model;

import exception.RepeatedIdException;

public class User {
	
	private Character avatar;
	
	private String name;
	private int id;
	private int age;
	private String gender; 
	
	private int live;
	private int point;
	private int level;
	
	private User right;
	private User left;
		
	public User(String name, int id, int age, String gender) {
		avatar=new Character(Character.IZQ);

		
		this.live = 2;
		this.point = 0;
		this.level = 1;
		this.name = name ;
		this.id = id;
		this.age= age ;
		this.gender = gender;
		
		right = null;
		left = null;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getLive() {
		return live;
	}


	public void setLive(int live) {
		this.live = live;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public User getRight() {
		return right;
	}


	public void setRight(User right) {
		this.right = right;
	}


	public User getLeft() {
		return left;
	}


	public void setLeft(User left) {
		this.left = left;
	}
	
	public int compareId(User u) {
		
	int result=0;
        if (id<u.id) {   
        	result= -1;
        }else if (id>u.id){  
        	result= 1;  
        }else 
        	result = 0;
	 return result;
	}
	
	
	public void insert( User nuevo ) throws RepeatedIdException{
		
		if(this.id == nuevo.id) {
			
			throw new RepeatedIdException(nuevo.id);
			
		}else if(this.id < nuevo.id) {
			
			if(this.right==null) {
    			this.right=nuevo;
    		}else {
    			this.right.insert(nuevo);
    		}
		}else {
			
			if(this.left==null) {
    			this.left=nuevo;
    		}else { 
    			this.left.insert(nuevo);
    		}	
		}	
	}
	
	public void loseLive() {
		this.setLive(this.getLive()-1);
		avatar.reaparecer();
	}
	
	public int compareTo(User o) {
		if(this.getPoint()<o.getPoint()) {
			return 1;
		}else if(this.getPoint()>o.getPoint()){
			return -1;
		}else {
			return 0;	
		}
	}
	
	public void moveRight() {
		avatar.moveRight();
	}

	public void moveLeft() {
		avatar.moveLeft();
	}
	
	public boolean isSheet() {
		return getRight()==null && getLeft()==null;
	}
	
	public User eliminar(String aName) {
		if(isSheet()) {
			return null;
		}
		if(aName.equalsIgnoreCase(name)) {
			if(left==null)
				return right;
			if(right==null)
				return left;
			User successor=right.getLess();
			right = right.eliminar(successor.name);
			successor.left=left;
			successor.right=right;
			return successor;
		}
		else if(name.compareToIgnoreCase(aName)>0) {
			left=left.eliminar(aName);
		}else {
			if(right!=null)
				right=right.eliminar(aName);
		}
		return this;
	}
	
	public User getLess() {
        return (left==null) ? this : left.getLess();
    }


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender
				+ ", point=" + point + "]";
	}
	
	
	
}
