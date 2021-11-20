
import javax.swing.*;
public class javaZodiac {

	public static void main(String[] args) {
		

		
		    String name = JOptionPane.showInputDialog(null,"What is your name?");
		       
		        {
		            String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"}; 
		   
		     
		            { 
		                JFrame holy = new JFrame (" ");
		                String months = (String)JOptionPane.showInputDialog(holy,"What is your Birthmonth?","Birth Month"
		                        ,JOptionPane.QUESTION_MESSAGE
		                        ,null, month,month[6]);
		            
		        {
		            String [] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"      
		            ,"24","25","26","27","28","29","30","31"}; 
		   
		     
		            { 
		                JFrame holy2 = new JFrame (" ");
		                String dates = (String)JOptionPane.showInputDialog(holy2,"What is Date?","Date"
		                        ,JOptionPane.QUESTION_MESSAGE
		                        ,null, date,date[8]);
		 
		        
		        {
		            String [] year = {"1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968"
		                    ,"1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981"
		                    ,"1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994"
		                    ,"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"
		                    ,"2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018"}; 
		   
		     
		            { 
		                JFrame holy1 = new JFrame ();
		                String years = (String)JOptionPane.showInputDialog(holy1,"What is your Birthyear?","Birth Year"
		                        ,JOptionPane.QUESTION_MESSAGE
		                        ,null, year,year[41]);

		                JOptionPane.showMessageDialog(null,"Your name is: "+name+"\nYou are born in: "+months+" "+dates+","+years+".");
		                
		                
		                {
		                if ("January".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\january.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Garnet","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("February".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\february.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Amethyst","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("March".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\march.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Bloodstone","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("April".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\april.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Diamond","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("May".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\may.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Emerald","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("June".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\june.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Moonstone","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("July".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\july.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Ruby","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("August".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\august.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Sardonyx","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("Septiember".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\september.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Sapphire","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                
		                if ("October".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\october.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Opal","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("November".equals(months)){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\november.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Topaz","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("December".equals(months)){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\december.png");
		                    JOptionPane.showMessageDialog(null,"Your Birthstone is Zircon","Your Birthstone",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2008".equals(years))||("1996".equals(years))||("1984".equals(years))||("1972".equals(years))||("1960".equals(years))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\rat.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Rat","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2009".equals(years))||("1997".equals(years))||("1985".equals(years))||("1973".equals(years))||("1961".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\ox.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Ox","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2010".equals(years))||("1998".equals(years))||("1986".equals(years))||("1974".equals(years))||("1962".equals(years))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\tiger.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Tiger","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2011".equals(years))||("1999".equals(years))||("1987".equals(years))||("1975".equals(years))||("1963".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\rabbit.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Rabbit","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2012".equals(years))||("2000".equals(years))||("1988".equals(years))||("1976".equals(years))||("1964".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\dragon.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Dragon","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2013".equals(years))||("2001".equals(years))||("1989".equals(years))||("1977".equals(years))||("1965".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\snake.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Snake","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2014".equals(years))||("2002".equals(years))||("1990".equals(years))||("1978".equals(years))||("1966".equals(years))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\horse.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Horse","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2015".equals(years))||("2003".equals(years))||("1991".equals(years))||("1979".equals(years))||("1967".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\goat.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Goat","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2016".equals(years))||("2004".equals(years))||("1992".equals(years))||("1980".equals(years))||("1968".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\monkey.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Monkey","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2017".equals(years))||("2005".equals(years))||("1993".equals(years))||("1981".equals(years))||("1969".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\rooster.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Rooster","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2018".equals(years))||("2006".equals(years))||("1994".equals(years))||("1982".equals(years))||("1970".equals(years))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\dog.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Dog","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if (("2019".equals(years))||("2007".equals(years))||("1995".equals(years))||("1983".equals(years))||("1970".equals(years))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\pig.png");
		                    JOptionPane.showMessageDialog(null,"Your are Year of the Pig","Your Horoscope",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                }
		                
		                
		                
		                //Capricorn
		                
		                
		                
		                if ("December".equals(months)&&("22".equals(dates))||("January".equals(months)&&("23".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.png");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("December".equals(months)&&("24".equals(dates))||("January".equals(months)&&("25".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.png");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("December".equals(months)&&("26".equals(dates))||("January".equals(months)&&("27".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.png");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("December".equals(months)&&("28".equals(dates))||("January".equals(months)&&("29".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.png");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("December".equals(months)&&("30".equals(dates))||("January".equals(months)&&("31".equals(dates)))){
		                     final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.png");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                  
		                   //January 

		                
		                if ("January".equals(months)&&("1".equals(dates))||("January".equals(months)&&("2".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("3".equals(dates))||("January".equals(months)&&("4".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("5".equals(dates))||("January".equals(months)&&("6".equals(dates)))){
		                     final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("7".equals(dates))||("January".equals(months)&&("8".equals(dates)))){
		                     final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("9".equals(dates))||("January".equals(months)&&("10".equals(dates)))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("11".equals(dates))||("January".equals(months)&&("12".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("13".equals(dates))||("January".equals(months)&&("14".equals(dates)))){
		                   final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("15".equals(dates))||("January".equals(months)&&("16".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("17".equals(dates))||("January".equals(months)&&("18".equals(dates)))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.","",JOptionPane.INFORMATION_MESSAGE,icon);
		                }
		                if ("January".equals(months)&&("19".equals(dates))){
		                    final ImageIcon icon = new ImageIcon("D:\\YGAY\\JavaApplication66\\capricorn.jpg");
		                    JOptionPane.showMessageDialog(null,"\nCapricorn:\n" +
		"\n" +
		"Strengths: Responsible, disciplined, self-control, good managers\n" +
		"Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
		"Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
		"Capricorn dislikes: Almost everything at some point.");
		                }
		                
		                
		                
		                //Aquarius
		                
		                
		                if ("January".equals(months)&&("20".equals(dates))||("January".equals(months)&&("21".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");
		                }
		                if ("January".equals(months)&&("22".equals(dates))||("January".equals(months)&&("23".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");
		                }
		                if ("January".equals(months)&&("24".equals(dates))||("January".equals(months)&&("25".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("January".equals(months)&&("26".equals(dates))||("January".equals(months)&&("27".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("January".equals(months)&&("28".equals(dates))||("January".equals(months)&&("29".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("January".equals(months)&&("30".equals(dates))||("January".equals(months)&&("31".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                
		                
		                
		                //February
		                
		                
		                if ("February".equals(months)&&("1".equals(dates))||("February".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("3".equals(dates))||("February".equals(months)&&("4".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("5".equals(dates))||("February".equals(months)&&("6".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("7".equals(dates))||("February".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("9".equals(dates))||("February".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("11".equals(dates))||("February".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("13".equals(dates))||("February".equals(months)&&("14".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("15".equals(dates))||("February".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                if ("February".equals(months)&&("17".equals(dates))||("February".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAquarius:\n" +
		"\n" +
		"Strengths: Progressive, original, independent, humanitarian\n" +
		"Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
		"Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
		"Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them.");   
		                }
		                
		                
		                //Pisces
		                
		                if ("February".equals(months)&&("19".equals(dates))||("February".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("February".equals(months)&&("21".equals(dates))||("February".equals(months)&&("22".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("February".equals(months)&&("23".equals(dates))||("February".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("February".equals(months)&&("25".equals(dates))||("February".equals(months)&&("26".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("February".equals(months)&&("27".equals(dates))||("February".equals(months)&&("28".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                
		                //March
		                
		                if ("March".equals(months)&&("1".equals(dates))||("March".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("3".equals(dates))||("March".equals(months)&&("4".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("5".equals(dates))||("March".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("7".equals(dates))||("March".equals(months)&&("8".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("9".equals(dates))||("March".equals(months)&&("10".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("11".equals(dates))||("March".equals(months)&&("12".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("13".equals(dates))||("March".equals(months)&&("14".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("15".equals(dates))||("March".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("17".equals(dates))||("March".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                if ("March".equals(months)&&("19".equals(dates))||("March".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nPisces:\n" +
		"\n" +
		"Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
		"Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
		"Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
		"Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind.");   
		                }
		                
		                
		                //Aries
		                
		                
		                if ("March".equals(months)&&("21".equals(dates))||("March".equals(months)&&("22".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("March".equals(months)&&("23".equals(dates))||("March".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("March".equals(months)&&("25".equals(dates))||("March".equals(months)&&("26".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("March".equals(months)&&("27".equals(dates))||("March".equals(months)&&("28".equals(dates)))){
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("March".equals(months)&&("29".equals(dates))||("March".equals(months)&&("30".equals(dates)))){
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("March".equals(months)&&("31".equals(dates))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                
		                
		                
		                //April
		                
		                
		                if ("April".equals(months)&&("1".equals(dates))||("April".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("3".equals(dates))||("April".equals(months)&&("4".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("5".equals(dates))||("April".equals(months)&&("6".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("7".equals(dates))||("April".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("9".equals(dates))||("April".equals(months)&&("10".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("11".equals(dates))||("April".equals(months)&&("12".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("13".equals(dates))||("April".equals(months)&&("14".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("15".equals(dates))||("April".equals(months)&&("16".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("17".equals(dates))||("April".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");    
		                }
		                if ("April".equals(months)&&("19".equals(dates))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nAries:\n" +
		"\n" +
		"Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
		"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
		"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
		"Aries dislikes: Inactivity, delays, work that does not use one's talents.");   
		                }
		                
		                
		                //Tauros
		                
		                if ("April".equals(months)&&("20".equals(dates))||("April".equals(months)&&("21".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("April".equals(months)&&("22".equals(dates))||("April".equals(months)&&("23".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("April".equals(months)&&("24".equals(dates))||("April".equals(months)&&("25".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("April".equals(months)&&("26".equals(dates))||("April".equals(months)&&("27".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("April".equals(months)&&("28".equals(dates))||("April".equals(months)&&("29".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("April".equals(months)&&("30".equals(dates))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                
		                
		                //May
		                
		                
		                if ("May".equals(months)&&("1".equals(dates))||("May".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("3".equals(dates))||("May".equals(months)&&("4".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }   
		                if ("May".equals(months)&&("5".equals(dates))||("May".equals(months)&&("6".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("7".equals(dates))||("May".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("9".equals(dates))||("May".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("11".equals(dates))||("May".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("13".equals(dates))||("May".equals(months)&&("14".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("15".equals(dates))||("May".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("17".equals(dates))||("May".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                if ("May".equals(months)&&("19".equals(dates))||("May".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nTaurus:\n" +
		"\n" +
		"Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
		"Weaknesses: Stubborn, possessive, uncompromising\n" +
		"Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
		"Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics.");   
		                }
		                
		                
		                
		                //Gemini
		                
		                
		                if ("May".equals(months)&&("21".equals(dates))||("May".equals(months)&&("22".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("May".equals(months)&&("23".equals(dates))||("May".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("May".equals(months)&&("25".equals(dates))||("May".equals(months)&&("26".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("May".equals(months)&&("27".equals(dates))||("May".equals(months)&&("28".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("May".equals(months)&&("29".equals(dates))||("May".equals(months)&&("30".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("May".equals(months)&&("31".equals(dates))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                
		                
		                //June
		                
		                
		                
		                if ("June".equals(months)&&("1".equals(dates))||("June".equals(months)&&("2".equals(dates)))){
		                    
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("3".equals(dates))||("June".equals(months)&&("4".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("5".equals(dates))||("June".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("7".equals(dates))||("June".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("9".equals(dates))||("June".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("11".equals(dates))||("June".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("13".equals(dates))||("June".equals(months)&&("14".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("15".equals(dates))||("June".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("17".equals(dates))||("June".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                if ("June".equals(months)&&("19".equals(dates))||("June".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nGemini:\n" +
		"\n" +
		"Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
		"Weaknesses: Nervous, inconsistent, indecisive\n" +
		"Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town.");   
		                }
		                
		                
		                //Cancer
		                
		                
		                if ("June".equals(months)&&("21".equals(dates))||("June".equals(months)&&("22".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("June".equals(months)&&("23".equals(dates))||("June".equals(months)&&("24".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("June".equals(months)&&("25".equals(dates))||("June".equals(months)&&("26".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("June".equals(months)&&("27".equals(dates))||("June".equals(months)&&("28".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("June".equals(months)&&("29".equals(dates))||("June".equals(months)&&("30".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                
		                
		                
		                //July
		                
		                
		                if ("July".equals(months)&&("1".equals(dates))||("July".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("3".equals(dates))||("July".equals(months)&&("4".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("5".equals(dates))||("July".equals(months)&&("6".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("7".equals(dates))||("July".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("9".equals(dates))||("July".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("11".equals(dates))||("July".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("13".equals(dates))||("July".equals(months)&&("14".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("15".equals(dates))||("July".equals(months)&&("16".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("17".equals(dates))||("July".equals(months)&&("18".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("19".equals(dates))||("July".equals(months)&&("20".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                if ("July".equals(months)&&("21".equals(dates))||("July".equals(months)&&("22".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nCancer:\n" +
		"\n" +
		"Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
		"Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
		"Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
		"Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life.");   
		                }
		                
		                
		                //Leo
		                
		                
		                if ("July".equals(months)&&("23".equals(dates))||("July".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("July".equals(months)&&("25".equals(dates))||("July".equals(months)&&("26".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("July".equals(months)&&("27".equals(dates))||("July".equals(months)&&("28".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("July".equals(months)&&("29".equals(dates))||("July".equals(months)&&("30".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("July".equals(months)&&("31".equals(dates))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                
		                
		                //August
		                
		                
		                if ("August".equals(months)&&("1".equals(dates))||("August".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("3".equals(dates))||("August".equals(months)&&("4".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("5".equals(dates))||("August".equals(months)&&("6".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("7".equals(dates))||("August".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("9".equals(dates))||("August".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("11".equals(dates))||("August".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("13".equals(dates))||("August".equals(months)&&("14".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("15".equals(dates))||("August".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("17".equals(dates))||("August".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("19".equals(dates))||("August".equals(months)&&("20".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                if ("August".equals(months)&&("21".equals(dates))||("August".equals(months)&&("22".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLeo:\n" +
		"\n" +
		"Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
		"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
		"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
		"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen.");   
		                }
		                
		                
		                //Virgo
		                
		                
		                if ("August".equals(months)&&("23".equals(dates))||("August".equals(months)&&("24".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("August".equals(months)&&("25".equals(dates))||("August".equals(months)&&("26".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("August".equals(months)&&("27".equals(dates))||("August".equals(months)&&("28".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("August".equals(months)&&("29".equals(dates))||("August".equals(months)&&("30".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("August".equals(months)&&("31".equals(dates))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                
		                
		                
		                //September
		                
		                
		                
		                if ("September".equals(months)&&("1".equals(dates))||("September".equals(months)&&("2".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("3".equals(dates))||("September".equals(months)&&("4".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("5".equals(dates))||("September".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("7".equals(dates))||("September".equals(months)&&("8".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("9".equals(dates))||("September".equals(months)&&("10".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("11".equals(dates))||("September".equals(months)&&("12".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("13".equals(dates))||("September".equals(months)&&("14".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("15".equals(dates))||("September".equals(months)&&("16".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("17".equals(dates))||("September".equals(months)&&("18".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("19".equals(dates))||("September".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                if ("September".equals(months)&&("21".equals(dates))||("September".equals(months)&&("22".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nVirgo:\n" +
		"\n" +
		"Strengths: Loyal, analytical, kind, hardworking, practical\n" +
		"Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
		"Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
		"Virgo dislikes: Rudeness, asking for help, taking center stage.");   
		                }
		                
		                
		                //Libra
		                
		                
		                if ("September".equals(months)&&("23".equals(dates))||("September".equals(months)&&("24".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("September".equals(months)&&("25".equals(dates))||("September".equals(months)&&("26".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("September".equals(months)&&("27".equals(dates))||("September".equals(months)&&("28".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("September".equals(months)&&("29".equals(dates))||("September".equals(months)&&("30".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                
		                
		                //October
		                
		                
		                if ("October".equals(months)&&("1".equals(dates))||("October".equals(months)&&("2".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("3".equals(dates))||("October".equals(months)&&("4".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("5".equals(dates))||("October".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("7".equals(dates))||("October".equals(months)&&("8".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("9".equals(dates))||("October".equals(months)&&("10".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("11".equals(dates))||("October".equals(months)&&("12".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("13".equals(dates))||("October".equals(months)&&("14".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("15".equals(dates))||("October".equals(months)&&("16".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("17".equals(dates))||("October".equals(months)&&("18".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("19".equals(dates))||("October".equals(months)&&("20".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                if ("October".equals(months)&&("21".equals(dates))||("October".equals(months)&&("22".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nLibra:\n" +
		"\n" +
		"Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
		"Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
		"Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
		"Libra dislikes: Violence, injustice, loudmouths, conformity.");   
		                }
		                
		                //Scorpio
		                
		                if ("October".equals(months)&&("23".equals(dates))||("October".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("October".equals(months)&&("25".equals(dates))||("October".equals(months)&&("26".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("October".equals(months)&&("27".equals(dates))||("October".equals(months)&&("28".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("October".equals(months)&&("29".equals(dates))||("October".equals(months)&&("30".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("October".equals(months)&&("31".equals(dates))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                
		                //November
		                
		                if ("November".equals(months)&&("1".equals(dates))||("November".equals(months)&&("2".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("3".equals(dates))||("November".equals(months)&&("4".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("5".equals(dates))||("November".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("7".equals(dates))||("November".equals(months)&&("8".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("9".equals(dates))||("November".equals(months)&&("10".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("11".equals(dates))||("November".equals(months)&&("12".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("13".equals(dates))||("November".equals(months)&&("14".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("15".equals(dates))||("November".equals(months)&&("16".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("17".equals(dates))||("November".equals(months)&&("18".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("19".equals(dates))||("November".equals(months)&&("20".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                if ("November".equals(months)&&("21".equals(dates))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nScorpio:\n" +
		"\n" +
		"Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
		"Weaknesses: Distrusting, jealous, secretive, violent\n" +
		"Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
		"Scorpio dislikes: Dishonesty, revealing secrets, passive people.");   
		                }
		                
		                
		                //Sagittarius
		                
		                
		                if ("November".equals(months)&&("22".equals(dates))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("November".equals(months)&&("23".equals(dates))||("November".equals(months)&&("24".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("November".equals(months)&&("25".equals(dates))||("November".equals(months)&&("26".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("November".equals(months)&&("27".equals(dates))||("November".equals(months)&&("28".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("November".equals(months)&&("29".equals(dates))||("November".equals(months)&&("30".equals(dates)))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                
		                //December
		                
		                
		                if ("December".equals(months)&&("1".equals(dates))||("December".equals(months)&&("2".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("3".equals(dates))||("December".equals(months)&&("4".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("5".equals(dates))||("December".equals(months)&&("6".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("7".equals(dates))||("December".equals(months)&&("8".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("9".equals(dates))||("December".equals(months)&&("10".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("11".equals(dates))||("December".equals(months)&&("12".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("13".equals(dates))||("December".equals(months)&&("14".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("15".equals(dates))||("December".equals(months)&&("16".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("17".equals(dates))||("December".equals(months)&&("18".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("19".equals(dates))||("December".equals(months)&&("20".equals(dates)))){
		                  
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		                if ("December".equals(months)&&("21".equals(dates))){
		                   
		                    JOptionPane.showMessageDialog(null,"\nSagittarius:\n" +
		"\n" +
		"Strengths: Generous, idealistic, great sense of humor\n" +
		"Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
		"Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
		"Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details.");   
		                }
		    
		    }
		 
		            
		            
		        }
 
		 	
		
	}

		        }
		            }
		        }
	}
}
