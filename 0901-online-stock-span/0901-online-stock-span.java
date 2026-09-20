class StockSpanner {
    private Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int c = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            c+= stack.pop()[1];
        }
        stack.push(new int[]{price, c});
        return c;
    }
}