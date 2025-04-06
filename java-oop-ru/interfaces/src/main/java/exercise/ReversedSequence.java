package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private String revSeq;

    ReversedSequence(String input) {
        revSeq = new StringBuilder(input).reverse().toString();
    }

    @Override
    public int length() {
        return revSeq.length();
    }

    @Override
    public char charAt(int index) {
        return revSeq.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return revSeq.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return revSeq.subSequence(start, end);
    }

    @Override
    public String toString() {
        return revSeq;
    }
}
// END
