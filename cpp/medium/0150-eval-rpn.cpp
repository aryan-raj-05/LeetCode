#include <stack>
#include <string>
#include <vector>

using namespace std;

class Solution {
    bool digit(string s) {
        int i = 0;
        if (s.at(i) == '-') ++i;
        while (i < s.length()) {
            if (s.at(i) >= '0' && s.at(i) <= '9') {
                ++i;
            } else return false;
        }
        return !(i == 1);
    }

    int toDigit(string s) {
        int i = 0;
        int sign = 1, out = 0;

        if (s.at(i) == '-') {
            sign = -1;
            ++i;
        }

        for (; i < s.size(); i++)
            out = out * 10 + (s.at(i) - '0');
        
        return sign * out;
    }

public:
    int evalRPN(vector<string>& tokens) {
        stack<int> s;

        for (string token : tokens) {
            if (digit(token)) {
                s.push(toDigit(token));
            } else {
                char op = token.at(0);
                int a, b;
                switch (op) {
                    case '+':
                        a = s.top(); s.pop();
                        b = s.top(); s.pop();
                        s.push(a + b);
                        break;
                    case '-':
                        b = s.top(); s.pop();
                        a = s.top(); s.pop();
                        s.push(a - b);
                        break;
                    case '*':
                        a = s.top(); s.pop();
                        b = s.top(); s.pop();
                        s.push(a * b);
                        break;
                    case '/':
                        b = s.top(); s.pop();
                        a = s.top(); s.pop();
                        s.push(a / b);
                        break;
                }
            }
        }

        return s.top();
    }
};