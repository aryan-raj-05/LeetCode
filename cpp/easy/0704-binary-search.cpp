#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int lo = 0, hi = nums.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums.at(mid) > target)      hi = mid - 1;
            else if (nums.at(mid) < target) lo = mid + 1;
            else                            return mid;
        }
        return -1;
    }
};