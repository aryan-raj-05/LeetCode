#include <vector>
using std::vector;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i = 0, j = numbers.size() - 1;
        while (i <= j) {
            if (numbers[i] + numbers[j] == target)
                return {i + 1, j + 1};
            else if (numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return {};
    }
};

/*
    [1] since the arrays are sorted, 
        linearly iterating two pointers over 
        the array works. Time complexity = O(n)
    [2] also binary search
*/