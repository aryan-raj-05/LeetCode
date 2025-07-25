#include <stack>
using namespace std;

class MinStack {
    stack<int> main;
    stack<int> minKeeper;

public:
    void push(int val) {
        main.push(val);
        if (minKeeper.empty()) {
            minKeeper.push(val);
        } else {
            minKeeper.push((val < getMin()) ? val : getMin());
        }
    }

    void pop() {
        main.pop();
        minKeeper.pop();
    }

    int top() {
        return main.top();
    }

    int getMin() {
        return minKeeper.top();
    }
};