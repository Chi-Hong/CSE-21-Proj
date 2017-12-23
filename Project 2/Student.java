public class Student {
   protected String student;
   protected Character gender;
   Date birthDay;
   Preference pref;
   protected Boolean matched = false;
  
   public Student (String s, char g, Date b, Preference p){
       student = s;
       gender = g;
       birthDay = b;
       pref = p;
   }
  
   public String Name() {
       return student;
   }
  
   public char Gender() {
       return gender;
   }
  
   public Date Date(){
       return birthDay;
   }
  
   public Preference Pref() {
       return pref;
   }
  
   public boolean GetMatched() {
       return matched;
   }
   public void SetMatched() {
       matched = true;
   }
  
   public int Compare(Student st) {
       int compatibility;
       int ageDifference = (this.birthDay.compare(st.birthDay));
       int preferences = (this.pref.compare(st.pref));
       compatibility = ((40-preferences) + (60-ageDifference));
       if(this.gender == 'M' && st.gender == 'F')
           return 0;
       if (this.gender == 'F' && st.gender == 'M')
           return 0;
       return compatibility;
   }
}