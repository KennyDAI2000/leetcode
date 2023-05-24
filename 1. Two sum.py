'''class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return i,j'''
                
# Best solution: Hash Table
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        num_map = {}

        for i, num in enumerate(nums):
            dif = target - num
            if dif in num_map:
                return num_map[dif], i
            else:
                num_map[num] = i
                
                
solution = Solution()


nums = [3,2,4]
target = 6
result = solution.twoSum(nums, target)


if result:
    index1, index2 = result
    print(index1, index2)
else:
    print("fail")