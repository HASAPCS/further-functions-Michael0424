package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        return a + b; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String str) {
        String reverseString = "";
    
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
    
        return reverseString;//Replace with your implementation
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello,
    // John!"
    public String greeting(String name) {
        return "Hello, " + name + "!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        int bnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > bnum) {
                bnum = arr[i];
            }
        }

        return bnum; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;// Replace with your implementation
    }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";
    
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    
        return longestWord;
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        double average = total / nums.length;
        return average; // Replace with your implementation
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        double result = 1.0;

        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1.0 / result;
        }

        return result; // Replace with your implementation
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count; // Replace with your implementation
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("");
        }

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
        }
        return sum; // Replace with your implementation

    }
}