
public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        int len = str.length();
        int countopen = 0;
        int countclose = 0;
        int mod = len%2;

        if(str.charAt(0)==')') {
            return false;
        }

        if(mod == 1){
           return false;
        }

        for (int i =0; i<len; i++){
            if (str.charAt(i)=='('){
                countopen++;
            }
            else if (str.charAt(i)==')') {
                countclose++;
            }
        }

        if(countclose!=countopen){
            return false;
        }

        for(int a = 0; a<len; a++){
            if(str.charAt(a)=='('){
                countopen--;
                if(str.substring(a+1).contains(")")){
                    countclose--;
                }

            }
        }

        if(countclose==countopen){
            return true;
        }
        return false;

    }


    // 2. reverseInteger
    public static String reverseInteger(int num){
        String str = Integer.toString(num);
        int len = str.length();
        String output = "";
        for (int i =len-1; i>=0; i--){
            output+=str.charAt(i);
        }
        return output;

    }



    // 3. encryptThis
    public static String encryptThis(String str){
        int len = str.length();
        String[] words = str.split(" ");
        String output ="";

        for(int i =0;i< words.length; i++){
            String string = "";
            String word = words[i];
            string += word;
            char letter = string.charAt(0);
            int code = (int)letter;
            output+=code;
            String two = string.substring(1,2);
            String last = string.substring(string.length()-1);
            String mid = string.substring(2,string.length()-1);
            output+=last;
            output+=mid;
            output+=two;
            output+= " ";


        }

        return output;

    }


    // 4. decipherThis
    public static String decipherThis(String str){
        String[] words = str.split(" ");
        String output = "";

        for(int i =0;i< words.length; i++){
            String string = "";
            String word = words[i];
            string += word;

            int count = 0;
            for (int a = 0; a<string.length(); a++){
                if (Character.isDigit(string.charAt(a))){
                    count++;
                }
                else{
                    break;
                }
            }

            int code = Integer.valueOf(string.substring(0,count));
            char letter = (char) code;
            output+= letter;

            char two = string.charAt(count);
            char last = string.charAt(string.length()-1);
            String mid;
            if(string.length()<=5){
                mid = "";
            }
            else{
                mid = string.substring(count+1,string.length()-1);
            }
            output+=last;
            output+=mid;
            output+=two;

            if (i == words.length) {
                output+="";
            } else {
                output+=" ";
            }
        }


        return output;


    }




}