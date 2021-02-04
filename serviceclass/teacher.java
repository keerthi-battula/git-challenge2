package serviceclass;

public class teacher {
String Name;
String Subject;

public teacher(String name, String subject) {
	super();
	Name = name;
	Subject = subject;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}

@Override
public int hashCode() {
	return Name.hashCode();
}
@Override
public boolean equals(Object obj)
{
    teacher teacher = (teacher) obj;
 
    return (Name != teacher.Name);
}

@Override
public String toString()
{
    return Name+", "+Subject;
}


}
