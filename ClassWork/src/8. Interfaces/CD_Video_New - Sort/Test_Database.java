public class Test_Database{
  public static void main(String[] args){
    
    CD c1 = new CD("Pagol Bondhu", "Mumtaj", 7, 30);
    CD c2 = new CD("Roshik Bondhu", "Durjoy", 5, 60);
    Video v1 = new Video("Kaka Keno Neka", "Razeeb", 180);
    Video v2 = new Video("Ashami Keno Shami", "Alice", 30);
    
     Database d = new Database();
     d.addItem(c1);
     d.addItem(v1);
     d.addItem(v2);
     d.addItem(c2);
     d.Sort();
     System.out.println(d);
    
  }

}