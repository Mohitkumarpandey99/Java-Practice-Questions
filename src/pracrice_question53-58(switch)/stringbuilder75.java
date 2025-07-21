class stringbuilder75 {
    
    public static void main(String[] args) {
        String[] arr = new String[] {"my" ,"name", "is", "mohit","kumar","pandey"
                                    ,"and","i","am","20","years","old."};
            StringBuilder sb = new StringBuilder();
            for (String string : arr) {
                sb.append(string).append(" ");
            }                   
            System.out.println(sb);
    }
}
