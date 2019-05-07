    class UCase    {
      public static void main(String[] args)
      {
//    	  System.out.println(replaceAll("Hello", '_'));

    	    String kalimat = "Aku Sayang Kamu";
    	    StringBuilder ubahKalimat = new StringBuilder();

    	    for (String word : kalimat.split(" ")) {
    	        ubahKalimat.append(replaceAll(word, '_'));
    	        ubahKalimat.append(" ");
    	    }

    	    System.out.println(ubahKalimat);
    	}
      
      public static String replaceAll(String word, char replacer) {
    	    StringBuilder ret = new StringBuilder();
    	    if (word.length()>2) {
    	        ret.append(word.charAt(0));
    	        for (int i = 1; i < word.length() - 1; i++) {
    	            ret.append(replacer);
    	        }
    	        ret.append(word.charAt(word.length() - 1));
    	        return ret.toString();
    	    }

    	    return word;
    	}
    }