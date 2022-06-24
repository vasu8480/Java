import java.util.*;
class one
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    String str = sc.next();
    System.out.println(findLength(str, str.length()));
  }

  static int findLength(String str, int n)
  {
    int sum[] = new int[ n + 1];
    sum[0] = 0;
    for (int i = 1; i <= n; i++)
      sum[i] = (sum[i-1] + str.charAt(i-1) - '0');
    int ans = 0; 
    for (int len = 2; len <= n; len += 2)
    {
      for (int i = 0; i <= n-len; i++)
      {
        int j = i + len - 1;
        if (sum[i+len/2] - sum[i] == sum[i+len] - sum[i+len/2])
          ans = Math.max(ans, len);
      }
    }
    return ans;
  }
}

// This code is contributed by Rajput-Ji
