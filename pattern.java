//pyramid pattern
// public class pattern{
//     public static void main(String[] args) {
//         int n = 5; // Number of rows
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             // Move to the next line
//             System.out.println();
//         }
//     }
// }

// rhombus pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5; // Number of rows
//         for (int i = 1; i <= n; i++) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=n;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//butterfly pattern
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5; // Number of rows
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int k=1;k<=2*(n-i);k++)
//             {
//                 System.out.print(" ");
//             }
//             for(int m=1;m<=i;m++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int k=2*(n-i);k>=1;k--)
//             {
//                 System.out.print(" ");
//             }
//             for(int m=1;m<=i;m++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//     }
// }
// }
//pascals triangle
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5; // Number of rows
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++)
//             {
//                 System.out.print(k);
//             }
//             for(int m=i-1;m>=1;m--)
//             {
//                 System.out.print(m);
//             }
//             System.out.println(); 
//         }
//     }
//     }

//best case omega(1)
//avg case theta(n+1)/2
//worst case O(n)
