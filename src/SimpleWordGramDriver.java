public class SimpleWordGramDriver {
    public static void main(String[] args) {

        int WSIZE = 5;

        String[] words = {"Computer", "Science", "is", "fun"};
        WordGram g = new WordGram(words,0,WSIZE - 1);

        String[] moreWords = {"Computer", "Science", "is", "*****"};
        WordGram f = new WordGram(words,0,WSIZE - 1);

        System.out.println(g);
        System.out.println(f);
        System.out.println(g.equals(f));

        System.out.printf("gram = %s, length = %d, hash = %d\n",
                          g,g.length(),g.hashCode());

        WordGram ng = g.shiftAdd("sometimes");
        System.out.printf("gram = %s, length = %d, hash = %d\n",
                ng,ng.length(),ng.hashCode());


    }
}
