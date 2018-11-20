import java.util.*;
import java.io.*;

public class ContactValues{

    String first;
    String last;
    int age;
    int phone;
    String mail;
   
   public ContactValues(String first, String last, int age, int phone, String mail){
   
      this.first = first;
      this.last = last;
      this.age = age;
      this.phone = phone;
      this.mail = mail;   
   }

   public void setFirst(String first){
      this.first=first;
   }
   public String getFirst(){
      return first;
   }
   public void setLast(String last){
      this.last=last;
   }
   public String getLast(){
      return last;
   }
   public void setAge(int age){
      this.age=age;
   }
   public int getAge(){
      return age;
   }
   public void setPhone(int phone){
      this.phone=phone;
   }
   public int getPhone(){
      return phone;
   }
   public void setMail(String mail){
      this.mail=mail;
   }
   public String getMail(){
      return mail;
   }   
}