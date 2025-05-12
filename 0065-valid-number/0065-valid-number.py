class Solution:
    def isNumber(self, s: str) -> bool:
        dot, e, nums = False, False, False
        for i, c in enumerate(s):
            if c.isdigit():
                nums = True
            elif c in "+-":
                if i > 0 and s[i - 1] not in "eE":
                    return False
            elif c in "eE":
                if e or not nums:
                    return False
                e, nums = True, False
            elif c == ".":
                if dot or e:
                    return False
                dot = True
            else:
                return False
        return nums
        