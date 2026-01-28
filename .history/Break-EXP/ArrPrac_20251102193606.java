import java.util.*;

public class ArrPrac {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] A = new int[][]{
         {11, 22, 33, 44, 55, 66, 77, 88},
         {12, 23, 34, 45, 56, 67, 78, 89},
         {13, 24, 35, 46, 57, 68, 79, 90},
         {14, 25, 36, 47, 58, 69, 80, 91},
         {15, 26, 37, 48, 59, 70, 81, 92},
         {16, 27, 38, 49, 60, 71, 82, 93}
      };
      int[][] T = Transd(A);
      int[] E = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      int[][] var10000 = new int[][]{
         {67, 23, 7},
         {23, 32, 1},
         {3, 23, 223},
         {54, 45, 2}
      };
      System.out.println(sumOfBoundary(A));
      priMat(multiplication(A, T));
      priMat(Transd(multiplication(A, T)));
      SpTrav(A);
      System.out.println();
      int[][] F = new int[][]{
         {0, 0, 1, 0, 0, 0, 1, 0},
         {0, 1, 0, 0, 1, 0, 0, 0},
         {1, 0, 0, 1, 0, 0, 0, 1},
         {0, 1, 0, 0, 0, 1, 0, 0},
         {0, 1, 0, 1, 0, 0, 1, 0},
         {1, 0, 1, 0, 1, 0, 0, 0}
      };
      

      char[][] P = new char[][]{{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'}, {'P', 'Q', 'R', 'S', 'T'}, {'U', 'V', 'W', 'X', 'Y'}};
      char[][] Y = new char[P.length][P[0].length];

      int left;
      int bottom;
      for(left = 0; left < P.length; ++left) {
         for(bottom = 0; bottom < P[0].length; ++bottom) {
            Y[bottom][P[0].length - 1 - left] = P[left][bottom];
         }
      }

      System.out.println(Arrays.deepToString(P));
      System.out.println(Arrays.deepToString(Y));
      left = 0;
      int up = 0;
      bottom = A.length - 1;

      int right;
      int j;
      for(right = A[0].length - 1; up <= bottom && left <= right; ++up) {
         for(j = left; j <= bottom; ++j) {
            System.out.print(A[j][left] + " ");
         }

         ++left;

         for(j = left; j <= right; ++j) {
            System.out.print(A[bottom][j] + " ");
         }

         --bottom;

         for(j = bottom; j >= up; --j) {
            System.out.print(A[j][right] + " ");
         }

         --right;

         for(j = right; j >= left; --j) {
            System.out.print(A[up][j] + " ");
         }
      }

      System.out.println();

      while(left <= right) {
         for(j = 0; j < A.length; ++j) {
            System.out.print(A[j][left] + " ");
         }

         ++left;
         if (left == right) {
            break;
         }

         for(j = A.length - 1; j >= 0; --j) {
            System.out.print(A[j][left] + " ");
         }

         ++left;
         if (left == right) {
            break;
         }
      }

      for(j = 0; j <= E[E.length - 1]; ++j) {
         if (j != E[j]) {
            System.out.printf("The first missing digit is %d.\n", j);
            break;
         }
      }

      int nums = 0;
      boolean start = false;
      System.out.println("Enter the sum: ");
      int sum = sc.nextInt();
      int res = 0;
      System.out.printf("%d,%d.\n", Integer.valueOf(res), Integer.valueOf(nums));
      int[] subset = new int[nums + 1];
      int count = 0;

      int g;
      for(int i = 0; i < A.length; ++i) {
         for(g = i + 1; g < A.length; ++g) {
            if (E[i] + E[g] == sum) {
               ++count;
            }
         }
      }

      int[][] pairs = new int[count][2];
      g = 0;
      int h = 0;

      int k;
      for(k = 0; k < A.length; ++k) {
         for(int c = k + 1; j < A.length; ++j) {
            if (E[k] + E[c] == sum) {
               pairs[g][h] = k;
               ++h;
               pairs[g][h] = c;
               ++g;
               h = 0;
            }
         }
      }

      System.out.println(Arrays.deepToString(pairs));
      System.out.println("Rotate the array by: ");
      k = sc.nextInt();
      int[] C = new int[k];
      int v = 0;

      int min;
      for(min = E.length - k; min < E.length; ++min) {
         C[v] = E[min];
         ++v;
      }

      for(min = E.length - 1 - k; min >= 0; --min) {
         E[min + k] = E[min];
      }

      for(min = 0; min < k; ++min) {
         E[min] = C[min];
      }

      System.out.println("The rotated array is:");
      System.out.println(Arrays.toString(E));
      int mini = 0;

      for(int i = 0; i < E.length - 1; ++i) {
         mini = i;

         int n;
         for(n = i + 1; n < E.length; ++n) {
            if (E[n] < E[min]) {
               mini = n;
            }
         }

         n = E[mini];
         E[mini] = E[i];
         E[i] = n;
      }

      System.out.printf("the %d'th smallest number: %d.\n", k, A[k - 1]);
   }
   public static void TheWayOut(int [] A){
      int dir = 0;
      int up = 0;
      int down = 0;
      int loci = 0;
      int locj = 0;
      boolean outway = false;

      while(!outway) {
         int i;
         int j;
         if (dir == 0) {
            i = up;
            j = down;

            while(j < F[0].length) {
               if (F[i][j] == 1) {
                  dir = 1;
                  up = i + 1;
                  down = j;
                  break;
               }

               ++j;
               if (j == F[0].length) {
                  outway = true;
                  loci = i;
                  locj = j - 1;
                  break;
               }
            }
         } else if (dir == 1) {
            i = up;
            j = down;

            while(i < F.length) {
               if (F[i][j] == 1) {
                  dir = 2;
                  up = i;
                  down = j - 1;
                  break;
               }

               ++i;
               if (i == F.length) {
                  outway = true;
                  loci = i - 1;
                  locj = j;
                  break;
               }
            }
         } else if (dir == 2) {
            i = up;
            j = down;

            while(j >= 0) {
               if (F[i][j] == 1) {
                  dir = 3;
                  up = i - 1;
                  down = j;
                  break;
               }

               --j;
               if (j < 0) {
                  outway = true;
                  loci = i;
                  locj = j + 1;
                  break;
               }
            }
         } else if (dir == 3) {
            i = up;
            j = down;

            while(i >= 0) {
               if (F[i][j] == 1) {
                  dir = 0;
                  up = i;
                  down = j + 1;
                  break;
               }

               --i;
               if (i < 0) {
                  outway = true;
                  loci = i + 1;
                  locj = j;
                  break;
               }
            }
         }

         if (outway) {
            System.out.printf("The Way Out is through index %d,%d.\n", loci, locj);
            break;
         }
      }      
   }
   public static void SpTrav(int[][] A) {
      int maxi = A.length - 1;
      int maxj = A[0].length - 1;
      int mini = 0;
      int minj = 0;
      int els = A.length * A[0].length;
      int count = 0;
      int i = 0;
      int j = 0;

      while(count < els) {
         while(i <= maxi) {
            System.out.print(A[i][j] + " ");
            ++count;
            if (i == maxi || count == els) {
               ++j;

               while(j <= maxj) {
                  System.out.print(A[i][j] + " ");
                  ++count;
                  if (j == maxj || count == els) {
                     break;
                  }

                  ++j;
               }

               --maxi;
               break;
            }

            ++i;
         }

         if (count == els) {
            break;
         }

         ++minj;
         --i;

         while(i >= mini || count == els) {
            System.out.print(A[i][j] + " ");
            ++count;
            if (count == els) {
               break;
            }

            if (i == mini || count == els) {
               --j;

               while(j >= minj || count == els) {
                  System.out.print(A[i][j] + " ");
                  ++count;
                  if (j == minj || count == els) {
                     ++mini;
                     break;
                  }

                  --j;
               }

               ++i;
               --maxj;
               break;
            }

            --i;
         }

         if (count == els) {
            break;
         }
      }

   }

   public static int sumOfBoundary(int[][] A) {
      int sum = 0;
      int row = A.length;
      int col = A[0].length;

      for(int i = 0; i < row; ++i) {
         for(int j = 0; j < col; ++j) {
            if (i != 0 && i != A.length - 1) {
               if (j == 0 || j == A[0].length - 1) {
                  sum += A[i][j];
               }
            } else {
               sum += A[i][j];
            }
         }
      }

      return sum;
   }

   public static int[][] multiplication(int[][] A, int[][] B) {
      int[][] C = new int[A.length][B[0].length];
      if (A[0].length == B.length) {
         System.out.println("Multiplication possible.");

         for(int i = 0; i < A.length; ++i) {
            for(int j = 0; j < B[0].length; ++j) {
               for(int k = 0; k < B.length; ++k) {
                  C[i][j] += A[i][k] * B[k][j];
               }
            }
         }
      } else {
         System.out.println("Multiplication not possible because the row and columns do not match.");
      }

      return C;
   }

   public static void priMat(int[][] A) {
      System.out.println("The result is: ");

      for(int i = 0; i < A.length; ++i) {
         for(int j = 0; j < A[0].length; ++j) {
            System.out.print(A[i][j] + "  ");
         }

         System.out.println();
      }

   }

   public static int[][] Transd(int[][] A) {
      int[][] B = new int[A[0].length][A.length];

      for(int i = 0; i < A.length; ++i) {
         for(int j = 0; j < A[0].length; ++j) {
            B[j][i] = A[i][j];
         }
      }
      return B;
   }
}
