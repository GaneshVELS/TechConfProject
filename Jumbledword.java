import java.util.*;

class JumbledWord
{

public void display()
{
//static int i=0;
//static int numberofchances=10;
String[]jumbledword;
jumbledword=new String[5];
Scanner s2=new Scanner(System.in);
System.out.println("Enter any 5 jumbled word ");
for(int i1=0;i1<5;i1++)
{
jumbledword[i1]=s2.nextLine();
}
String[]word={"dictionary","java","cplus","dotnet","python",""};

Map<String,String>foundwords=new HashMap<String,String>();


for(String jw:jumbledword)
{
char[]wordchars=jw.toCharArray();
Arrays.sort(wordchars);

for(String w: word)
{
char[]wor=w.toCharArray();
Arrays.sort(wor);

String s=new String(wordchars);
String s1=new String(wor);

if(s.equalsIgnoreCase(s1))
{
foundwords.put(w,jw);
}
}

System.out.println(foundwords);
}





}
public static void main(String[]args)
{
JumbledWord jw=new JumbledWord();
jw.display();
}
}