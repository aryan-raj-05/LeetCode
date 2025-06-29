#include <string>
#include <unordered_map>

using std::string;

class Solution {
public:
    bool isAnagram(string s, string t) {
        std::unordered_map<char, int> umap;

        for (auto letter : s) { umap[letter]++; }
        for (auto letter : t) { umap[letter]--; }

        for (auto& [key, value] : umap) {
            if (value != 0) { return false; }
        }

        return true;
    }
};

/*
    [1] sort both strings and see if they're equal

    [2] create map;
        loop over s;
        loop over t and if there's a match decrease count;
        check if map is empty;

    [3] create array of size 26;
        loop over s and increment the value;
        loop over t and decrement the value;
        loop over array and check for non-zero values;
*/