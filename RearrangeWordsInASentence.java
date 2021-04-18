class Solution {
    public String arrangeWords(String text) {
        
        //Bubble sort the array by length (ascendig):
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int nextLength = arr[j + 1].length();
                int currLength = arr[j].length();
                if (nextLength < currLength) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        //Capitalizes the letter of the first word, and then makes everything else lowercase:
        String c = String.valueOf(arr[0].charAt(0));
        c = c.toUpperCase();
        String firstWord = c;
        for (int i = 1; i < arr[0].length(); i++) {
            firstWord += arr[0].charAt(i);
        }
        
        arr[0] = firstWord;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        
        //Converts the array back to a string:
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += " ";
            }
        }
        
        return result;
    }
}
