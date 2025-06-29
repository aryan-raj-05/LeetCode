#include <string>
#include <vector>

using std::string;

class Solution {
    bool isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9'); 
    }

    char toLowerCase(char c) {
        if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
            return c;
        } else {
            return c + 32;
        }
    }

public:
    bool isPalindrome(string s) {
        if (s.empty()) return true;

        std::vector<char> strArray;
        for (char x : s) {
            if (isAlphaNumeric(x)) {
                strArray.push_back(toLowerCase(x));
            }
        }

        int i = 0, j = strArray.size() - 1;
        while (i < j) {
            if (strArray[i] != strArray[j]) {
                return false;
            }
            i++; j--;
        }

        return true;
    }
};