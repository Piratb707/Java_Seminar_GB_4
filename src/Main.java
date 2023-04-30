////Метод, который переворачивает связанный список:
//public class Main {
//    public static <T> LinkedList<T> reverse(LinkedList<T> list) {
//        LinkedList<T> reversed = new LinkedList<T>();
//        for (T item : list) {
//            reversed.addFirst(item);
//        }
//        return reversed;
//    }
//}

////Реализация очереди на LinkedList:
//
//import java.util.LinkedList;
//public class MyQueue<T> {
//    private LinkedList<T> queue = new LinkedList<T>();
//
//    public void enqueue(T item) {
//        queue.addLast(item);
//    }
//
//    public T dequeue() {
//        return queue.poll();
//    }
//
//    public T first() {
//        return queue.peek();
//    }
//
//    public boolean isEmpty() {
//        return queue.isEmpty();
//    }
//
//    public int size() {
//        return queue.size();
//    }
//}

////Добавление возможности отменить последнюю операцию в калькуляторе
//
//import java.util.Stack;
//
//public class Calculator {
//    private Stack<Double> stack = new Stack<>();
//    private Stack<String> history = new Stack<>();
//
//    public void push(double value) {
//        stack.push(value);
//        history.push("push " + value);
//    }
//
//    public double add() {
//        double a = stack.pop();
//        double b = stack.pop();
//        double result = a + b;
//        stack.push(result);
//        history.push("add");
//        return result;
//    }
//
//    public double subtract() {
//        double a = stack.pop();
//        double b = stack.pop();
//        double result = b - a;
//        stack.push(result);
//        history.push("subtract");
//        return result;
//    }
//
//    public double multiply() {
//        double a = stack.pop();
//        double b = stack.pop();
//        double result = a * b;
//        stack.push(result);
//        history.push("multiply");
//        return result;
//    }
//
//    public double divide() {
//        double a = stack.pop();
//        double b = stack.pop();
//        if (a == 0) {
//            throw new ArithmeticException("division by zero");
//        }
//        double result = b / a;
//        stack.push(result);
//        history.push("divide");
//        return result;
//    }
//
//    public void undo() {
//        if (!history.empty()) {
//            String lastOperation = history.pop();
//            switch (lastOperation) {
//                case "push":
//                    stack.pop();
//                    break;
//                case "add":
//                    stack.pop();
//                    double a = stack.pop();
//                    double b = stack.pop();
//                    stack.push(b);
//                    stack.push(a);
//                    break;
//                case "subtract":
//                    stack.pop();
//                    a = stack.pop();
//                    b = stack.pop();
//                    stack.push(b);
//                    stack.push(a);
//                    break;
//                case "multiply":
//                    stack.pop();
//                    a = stack.pop();
//                    b = stack.pop();
//                    stack.push(b);
//                    stack.push(a);
//                    break;
//                case "divide":
//                    stack.pop();
//                    a = stack.pop();
//                    b = stack.pop();
//                    stack.push(b);
//                    stack.push(a);
//                    break;
//            }
