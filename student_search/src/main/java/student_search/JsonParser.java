package student_search;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParser{{

String jsonString= ("https://hccs-advancejava.s3.amazonaws.com/student.json"); 
Gson gson = new Gson();
Type typeOfList=new TypeToken<List<Student>>(){}.getType();
List<Student>studentsList=gson.fromJson(jsonString,typeOfList);

public void searchByNameOrGender(String nameOrGender);
{boolean dataFound=false;
Student studentDetails=null;
for(Student student:studentList)
{
if(student.first_name.equalsIgnoreCase(nameOrGender)||student.gender.equalsIgnoreCase(nameOrGender)){dataFound=true;
studentDetails=student;
break;
}else{
dataFound=false;
}
}

if(dataFound){System.out.println("Data Found -> Student name : "+studentDetails.first_name);
}
else
{System.out.println("Data not found");}}}}