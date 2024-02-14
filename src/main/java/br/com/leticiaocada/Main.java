package br.com.leticiaocada;

public class Main {


    public static void givenNumbers() {
      int[] numbers = {3,2,4}; 
      int target = 6;
      for(int i=0; i<numbers.length-1;i++) {
        if(numbers[i] + numbers[i+1] == target) {
            System.out.println("Indices " + i + " e " + (i+1));
        }
      }
    }

    public static boolean palindromeNumber() {
        Integer x = 121;
        String s = x.toString();
        int n = s.length();

        for(int i = 0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1))
                return false;
        }
        return true;
    }

    public static void romanToInt() {
       String s = "III";
       int ans = 0, num = 0;
       for (int i = s.length()-1; i >= 0; i--) {
           switch(s.charAt(i)) {
               case 'I': num = 1; break;
               case 'V': num = 5; break;
               case 'X': num = 10; break;
               case 'L': num = 50; break;
               case 'C': num = 100; break;
               case 'D': num = 500; break;
               case 'M': num = 1000; break;
           }
           if (4 * num < ans) ans -= num;
           else ans += num;
       }
       System.out.println(ans);
   }

   public static void evenArrays() {
     int[] numbers = {-3,1,-2,5,2,-4};
     int aux;
     for(int i = 0; i<numbers.length; i++) {
        if(numbers[i] > -1) { //pos
            if(i < numbers.length - 1 && numbers[i+1] > -1) {
                for(int j = i+1; j < numbers.length; j++) {
                    if(numbers[j] < 0) {
                        aux = numbers[j];
                        numbers[j] = numbers[i+1];
                        numbers[i+1] = aux;
                    }
                }
            }
            
        }

        if(numbers[i] < 0) { //neg
            if(i < numbers.length - 1 && numbers[i+1] < 0) {
                for(int j = i+1; j < numbers.length; j++) {
                    if(numbers[j] > -1) {
                        aux = numbers[j];
                        numbers[j] = numbers[i+1];
                        numbers[i+1] = aux;
                    }
                }
            }
        }
     }

     for(int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
     }
     
   }


   public static void sumList() {
    int[] numeros = {1,3,5,6,7,9,10,15,17,20,23,30};
    int num = 15;
    if(numeros[numeros.length/2] > num) {
        for(int i = 0; i<numeros.length/2; i++) {
            if(numeros[i] == num)
            System.out.println("Indíce" +i); 
        }
    } else {
        for(int i = numeros.length/2; i<numeros.length; i++) {
            if(numeros[i] == num)
            System.out.println("Indíce" +i);
        }
    }    
   }


    public static void main(String[] args) {
        sumList();
    }
}