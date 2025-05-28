import java.util.*;

public class CountCollisions {
 ///Input: directions = "RLRSLL"
 /// Output: 5
 /// Explanation:
 /// The collisions that will happen on the road are:
 /// - Cars 0 and 1 will collide with each other. Since they are moving in opposite directions, the number of collisions becomes 0 + 2 = 2.
 /// - Cars 2 and 3 will collide with each other. Since car 3 is stationary, the number of collisions becomes 2 + 1 = 3.
 /// - Cars 3 and 4 will collide with each other. Since car 3 is stationary, the number of collisions becomes 3 + 1 = 4.
 /// - Cars 4 and 5 will collide with each other. After car 4 collides with car 3, it will stay at the point of collision and get hit by car 5. The number of collisions becomes 4 + 1 = 5.
 /// Thus, the total number of collisions that will happen on the road is 5.
 /// RLRSLL -> S RSLL (count 2)
 /// SSLL (2+1 = 3)
 /// SSSL (3+1 = 4)
 /// SSSS (4+1 = 5)

    public static void main(String[] args) {
        System.out.println(countCollisions("RLRSLL"));
    }

    public static int countCollisions(String directions) {

        int collisions = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(directions.charAt(0));

        for(int i = 1; i < directions.length(); i++) {
            char curr = directions.charAt(i);

            if(stack.peek() == 'R' && curr == 'L') {
                collisions += 2;
                stack.pop();
                curr = 'S';
            }else if(stack.peek() == 'S' && curr == 'L'){
                collisions += 1;
                stack.pop();
                curr = 'S';
            }
            while(!stack.isEmpty() && stack.peek() == 'R' && curr == 'S') {
                stack.pop();
                collisions +=1;
            }

            stack.push(curr);

        }
        return collisions;

    }

}
