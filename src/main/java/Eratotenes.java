public class Eratotenes {
    public static int[] sito(int n) {
        int[] t = new int[n + 1];

        int i = 2;
        int w = 0;
        while (!( i >= n)){
            w = i = i;
            System.out.println(w);

            while (!(w>n)){
                t[w] = 1;
                w = w +i;
            }
            i = i + 1;
        }


        return null;
    }
}
