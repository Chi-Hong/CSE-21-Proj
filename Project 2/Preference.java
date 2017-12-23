public class Preference {
  
   private int quietTime, music, reading, chatting;
  
   public Preference(int q, int m, int r, int c){
       this.quietTime = q;
       this.music = m;
       this.reading = r;
       this.chatting = c;
   }
  
   public int compare (Preference pref) {
       int diff;
       diff = (Math.abs(this.chatting - pref.chatting)+ Math.abs(this.reading - pref.reading) + Math.abs(this.music - pref.music) + Math.abs(this.quietTime - pref.quietTime));
      
       return diff;
   }
  
   public int quietTime() {
       return quietTime;
   }
  
   public int music() {
       return music;
   }
  
   public int reading() {
       return reading;
   }
  
   public int chatting() {
       return chatting;
   }
  
  

}