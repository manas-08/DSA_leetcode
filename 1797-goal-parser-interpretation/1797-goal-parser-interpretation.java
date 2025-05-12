class Solution {
    public String interpret(String command) {
        StringBuilder command1 = new StringBuilder();
        int i = 0;
        char ch = command.charAt(i);
        char ch1 = command.charAt(i+1);
        while (i <= command.length() - 1) {
            if(i <= command.length() - 2){
                ch = command.charAt(i);
                ch1 = command.charAt(i+ 1);
            }
            else{
                ch = command.charAt(i);
            }
            if (ch == 'G') {
                command1.append('G');
                i++;
            } else if (ch == '(' && ch1 == ')') {
                command1.append('o');
                i += 2;
            } else if (ch == '(' && ch1 == 'a') {
                command1.append("al");
                i += 4;
            }
        }
        return command1.toString();
    }
}