import static java.lang.StringUTF16.indexOf;

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

            if (str.substring(i,i+2).equals("(")){
                countopen++;
            }
            else if (str.substring(i,i+2).equals(")")) {
                countclose++;
            }
        }

        for(int a = 0; a<len; a++){
            if(str.substring(a,a+2).equals("(")){
                countopen--;
                if(str.substring(a+2).contains(")")){
                    countclose--;
                }

            }
        }

        if(countclose!= countopen){
            return false;
        }
        else if(countclose == countopen){
            return true;
        }

        return false;

    }


    // 2. reverseInteger
    public static String reverseInteger(String str){
        int len = str.length();
        String output = "";
        for (int i =len-1; i>0; i--){
            output+=i;
        }
        return output;

    }



    // 3. encryptThis
    public static String encryptThis(String str){
        int len = str.length();
        char letter = str.charAt(0);
        int code = (int)letter;
        String codel = String.valueOf(code);

        String output = codel;
        String last = str.substring(len-1);
        String first = str.substring(1,2);
        String mid = str.substring(2,len-1);

        output += codel;
        output += last;
        output += mid;
        output += first;
        return output;

    }


    // 4. decipherThis
    public static String decipherThis(String str){
        int count = 0;
        int len = str.length();
        String output = "";

        for (int i = 0; i<len; i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }

        String numm = str.substring(0,count+1);
        int num = Integer.parseInt(numm);
        char letter = (char)num;
        output+= letter;
        String nsecond = str.substring(len-1);
        output+= nsecond;

        if(num>=10){
            String mid = str.substring(3,len-2);
            String nlast = str.substring(2,3);
        }
        String mid = str.substring(2,len-2);
        String nlast = str.substring(1,2);

        output+= mid;
        output+= nlast;

        return output;


    }




}