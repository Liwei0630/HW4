package hw4;

import java.util.ArrayList;

public class Player {
  private String name;
  private int chips;
  private int bet=0;
  private ArrayList<Card>oneRoundCard=new ArrayList<>();
	
  public Player(String name, int chips){
	  this.name=name;
	  this.chips= chips;
}

       public  String get_name(){
	   return name;
       }
	   public int  make_bet(){
		   if(bet>chips)
		   {
			   System.out.println("錢不夠瞜~不能再下注了！");
			return bet;   
		   }		  
		   else
		   return bet=1;
	   }
 
	   public void setOneRoundCard(ArrayList<Card>cards){
	   oneRoundCard =cards;
	   }
	   
	   public boolean hit_me(){
		   if(this.getTotalValue()<17)return true;
		   else return false;
	   }
	   
	   public int getTotalValue(){
		   int total=0;
		   int ace=0;
		   for(int i=0;i<oneRoundCard.size();i++)
		   {
			if(oneRoundCard.get(i).getRank()==1)   
				ace=1;
			else
			{
				if(oneRoundCard.get(i).getRank()>10) total+=10;
				else total+=oneRoundCard.get(i).getRank() ;  			
			}
		   if (ace==1)
		   {
			   if(total<11) total+=11;
			   else total+= 1;
		   }
		   }
		   return total;
	   }
	   public int get_current_chips(){
		   return chips;
	   }
	   public void increase_chips(int diff){
	   
	   chips+=diff;
	   }

	   public void say_hello(){
		   
		   System.out.println("你好，我是"+name+",");
		   System.out.println("我有"+chips+"chips.");
		   
	   }
}
	  