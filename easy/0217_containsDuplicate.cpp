#include <unordered_set>
#include <vector>

using std::vector;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        std::unordered_set<int> set;

        for(auto x : nums) {
            if (set.find(x) == set.end()) { set.insert(x); }
            else                          { return true; }
        }

        return false;
    }
};