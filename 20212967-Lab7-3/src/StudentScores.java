public class StudentScores
{
private final int MAX_STUDENTS = 100;
private Student[] scores;
private int ix; // index to scores array
 public StudentScores()
 {
 scores = new Student[MAX_STUDENTS];
 ix = 0;
 }
 public void add(String name, int score)
 {
 if (ix < MAX_STUDENTS)
 scores[ix++] = new Student(name, score);
 else {
 System.out.println(¡°Too many students: ¡° +
 ¡°exceed the max. number of students¡±);
 System.exit(1);
 }
 }
 public Student getHighest()
 {
 if (ix == 0)
 return null;
 Student highest = scores[0];
 for (int i = 1; i < ix; i++)
 if (scores[i].getScore() > highest.getScore())
 highest = scores[i];
 return highest;
 }
 public Student getLowest()
 {
 if (ix == 0)
 return null;
 Student lowest = scores[0];
 for (int i = 1; i < ix; i++)
 if (scores[i].getScore() < lowest.getScore())
 lowest = scores[i];
 return lowest;
 }
}
