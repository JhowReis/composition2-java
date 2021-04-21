package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/04/2021 11:09:32"), "Traveling to the New Zeland", "I'm going to visit this wonderfull country!", 32);
		
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);
		
		
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("See you around!");
		Comment c5 = new Comment("bye!");
		Post p2 = new Post(sdf.parse("19/02/2021 13:32:55"),"Good nigth guys!","See you tomorrow", 25);
		p2.addComment(c3);
		p2.addComment(c4);
		p2.addComment(c5);
		
		System.out.println(p2);
		
		
		
		
		
		
		
	}
 
}
