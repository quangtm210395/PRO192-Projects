/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d660.parallelograms;

import java.util.*;
import java.io.*;

/**
 *
 * @author Minnn
 */
public class main {

    static class Point {

        public long x;
        public long y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static double distance(Point p1, Point p2, Point p3) {
        double a, b;
        if (p1.x - p2.x != 0) {
            a = (p1.y - p2.y) / (p1.x - p2.x);
            b = p1.y - p1.x * a;
            return Math.abs(a * p3.x - p3.y + b) / (Math.sqrt(a * a + 1));
        } else if (p1.x - p2.x == 0) {
            return Math.abs(p1.x - p3.x);
        } else if (p1.y - p2.y == 0) {
            return Math.abs(p1.y - p3.y);
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Point> al = new ArrayList<>();
//        InputReader in = new InputReader(System.in);
//        OutputWriter out = new OutputWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            al.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        int count = 0;
        for (int i = 0; i < n - 3; i++) {
            Point p1 = al.get(i);
            for (int j = i + 1; j < n - 2; j++) {
                Point p2 = al.get(j);
                for (int k = j + 1; k < n - 1; k++) {
                    Point p3 = al.get(k);
                    Point p4 = al.get(k + 1);
                    if (distance(p1, p2, p3) == distance(p1, p2, p4)
                            && distance(p1, p3, p2) == distance(p1, p3, p4)
                            && distance(p1, p4, p2) == distance(p1, p4, p3)) {
                        count++;
                    }
                }
            }
        }
        if (n < 4) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }

//        out.flush();
//
//        in.close();
//        out.close();
    }

    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }

            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c)) {
                c = read();
            }

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }

                res *= 10;
                res += c & 15;

                c = read();
            } while (!isSpaceChar(c));

            return res * sgn;
        }

        public int[] nextIntArray(int arraySize) {
            int array[] = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                array[i] = nextInt();
            }

            return array;
        }

        public long nextLong() {
            int c = read();

            while (isSpaceChar(c)) {
                c = read();
            }

            int sign = 1;

            if (c == '-') {
                sign = -1;

                c = read();
            }

            long result = 0;

            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }

                result *= 10;
                result += c & 15;

                c = read();
            } while (!isSpaceChar(c));

            return result * sign;
        }

        public long[] nextLongArray(int arraySize) {
            long array[] = new long[arraySize];

            for (int i = 0; i < arraySize; i++) {
                array[i] = nextLong();
            }

            return array;
        }

        public float nextFloat() // problematic
        {
            float result, div;
            byte c;

            result = 0;
            div = 1;
            c = (byte) read();

            while (c <= ' ') {
                c = (byte) read();
            }

            boolean isNegative = (c == '-');

            if (isNegative) {
                c = (byte) read();
            }

            do {
                result = result * 10 + c - '0';
            } while ((c = (byte) read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = (byte) read()) >= '0' && c <= '9') {
                    result += (c - '0') / (div *= 10);
                }
            }

            if (isNegative) {
                return -result;
            }

            return result;
        }

        public double nextDouble() // not completely accurate
        {
            double ret = 0, div = 1;
            byte c = (byte) read();

            while (c <= ' ') {
                c = (byte) read();
            }

            boolean neg = (c == '-');

            if (neg) {
                c = (byte) read();
            }

            do {
                ret = ret * 10 + c - '0';
            } while ((c = (byte) read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = (byte) read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg) {
                return -ret;
            }

            return ret;
        }

        public String next() {
            int c = read();

            while (isSpaceChar(c)) {
                c = read();
            }

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);

                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String nextLine() {
            int c = read();

            StringBuilder result = new StringBuilder();

            do {
                result.appendCodePoint(c);

                c = read();
            } while (!isNewLine(c));

            return result.toString();
        }

        public boolean isNewLine(int c) {
            return c == '\n';
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static class OutputWriter {

        private PrintWriter writer;

        public OutputWriter(OutputStream stream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                    stream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void println(int x) {
            writer.println(x);
        }

        public void print(int x) {
            writer.print(x);
        }

        public void println(int array[], int size) {
            for (int i = 0; i < size; i++) {
                println(array[i]);
            }
        }

        public void print(int array[], int size) {
            for (int i = 0; i < size; i++) {
                print(array[i] + " ");
            }
        }

        public void println(long x) {
            writer.println(x);
        }

        public void print(long x) {
            writer.print(x);
        }

        public void println(long array[], int size) {
            for (int i = 0; i < size; i++) {
                println(array[i]);
            }
        }

        public void print(long array[], int size) {
            for (int i = 0; i < size; i++) {
                print(array[i]);
            }
        }

        public void println(float num) {
            writer.println(num);
        }

        public void print(float num) {
            writer.print(num);
        }

        public void println(double num) {
            writer.println(num);
        }

        public void print(double num) {
            writer.print(num);
        }

        public void println(String s) {
            writer.println(s);
        }

        public void print(String s) {
            writer.print(s);
        }

        public void println() {
            writer.println();
        }

        public void printSpace() {
            writer.print(" ");
        }

        public void flush() {
            writer.flush();
        }

        public void close() {
            writer.close();
        }

    }
}
