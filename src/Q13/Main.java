package Q13;

import java.util.Objects;

class Emp{
	
	int id;
	String Name;
	String Dep;
	
	@Override
	public int hashCode() {
		return Objects.hash(Dep, Name, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(Dep, other.Dep) && Objects.equals(Name, other.Name) && id == other.id;
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		
		System.out.println();
	}
}
