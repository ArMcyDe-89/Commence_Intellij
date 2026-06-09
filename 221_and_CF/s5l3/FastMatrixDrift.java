import java.io.*;
import java.util.*;

public class FastMatrixDrift {
	public static FastIO fi = new FastIO();
    public static PrintWriter pw = new PrintWriter(System.out);
    public static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        int t = (int) fi.nextLong();
        
        for (int i = 0; i < t; i++) {
            long[][] A = new long[2][2];
            A[0][0] = fi.nextLong();
            A[0][1] = fi.nextLong();
            A[1][0] = fi.nextLong();
            A[1][1] = fi.nextLong();
            
            long X = fi.nextLong();
            
            long[][] res = matrixPower(A, X);
            
            pw.println(res[0][0] + " " + res[0][1]);
            pw.println(res[1][0] + " " + res[1][1]);
        }
        pw.flush();
    }
    private static long[][] matrixPower(long[][] base, long exp) {
        long[][] res = {{1, 0},{0, 1}};

        while (exp>0) {
            if (exp%2 == 1) {
                res = multiply(res, base);
            }
            base = multiply(base, base);
            exp /= 2;
        }
        return res;
    }
    private static long[][] multiply(long[][] A, long[][] B) {
        long[][] C = new long[2][2];

        C[0] [0] = ((A[0][0] * B[0][0])%MOD + (A[0][1]*B[1][0])%MOD)%MOD;
        C[0] [1] = ((A[0][0] * B[0][1])%MOD + (A[0][1]*B[1][1])%MOD)%MOD;
        C[1] [0] = ((A[1][0] * B[0][0])%MOD + (A[1][1]*B[1][0])%MOD)%MOD;
        C[1] [1] = ((A[1][0] * B[0][1])%MOD + (A[1][1]*B[1][1])%MOD)%MOD;
        
        return C;
    }
}

// BeginCodeSnip{FastIO}
class FastIO extends PrintWriter {
	private InputStream stream;
	private byte[] buf = new byte[1 << 16];
	private int curChar;
	private int numChars;

	// standard input
	public FastIO() { this(System.in, System.out); }

	public FastIO(InputStream i, OutputStream o) {
		super(o);
		stream = i;
	}

	// file input
	public FastIO(String i, String o) throws IOException {
		super(new FileWriter(o));
		stream = new FileInputStream(i);
	}

	// throws InputMismatchException() if previously detected end of file
	private int nextByte() {
		if (numChars == -1) { throw new InputMismatchException(); }
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) { throw new InputMismatchException(); }
			if (numChars == -1) {
				return -1;  // end of file
			}
		}
		return buf[curChar++];
	}

	// to read in entire lines, replace c <= ' '
	// with a function that checks whether c is a line break
	public String next() {
		int c;
		do { c = nextByte(); } while (c <= ' ');

		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = nextByte();
		} while (c > ' ');
		return res.toString();
	}

	public int nextInt() {  // nextLong() would be implemented similarly
		int c;
		do { c = nextByte(); } while (c <= ' ');

		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = nextByte();
		}

		int res = 0;
		do {
			if (c < '0' || c > '9') { throw new InputMismatchException(); }
			res = 10 * res + c - '0';
			c = nextByte();
		} while (c > ' ');
		return res * sgn;
	}
	public long nextLong() throws Exception {
            int c = nextByte();
            // Skip whitespaces and newlines automatically
            while (c <= 32) {
                if (c == -1) return -1;
                c = nextByte();
            }
            long res = 0;
            while (c > 32) {
                if (c < '0' || c > '9') throw new Exception("Invalid digit");
                res = res * 10 + c - '0';
                c = nextByte();
            }
            return res;
        }

	public double nextDouble() { return Double.parseDouble(next()); }
}