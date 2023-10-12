//wap to print unique values from an array.

  
    import java.util.Scanner;   
  
    public class UniqueElements 
    {   
      
        public static void main (String[] args)    
        {   
            int arrayWithDuplicates[] = {1,3,1,5,6,71,3,5,7,2,0,8,2};  
        Scanner sc  = new Scanner(System.in);
              
  
            int len = arrayWithDuplicates.length;   
              
 
            int[] distinctArray = new int[20];  
              

            int index = 0;  
              

            for (int i = 0; i < len; i++)   
            {   
                int flag = 0;  
      
                for (int j = 0; j < i; j++){  
                    if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){   
                        flag = 1;  
                        break;   
                    }  
                }  
           
                if (flag == 0){   
                    distinctArray[index] = arrayWithDuplicates[i];  
                    index++;    //increment index value  
                }  
            }  
            
            for(int i = 0; i < index; i++)  
                System.out.print( distinctArray[i] + " ");   
        }         
          
    }   