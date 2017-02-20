public class page_fault_fast
{
  public static void main(String[] args)
  {
    int i, j; 
    int [][] data = new int [1024][1024] ;

    long startTime = System.nanoTime();

    for( i = 0; i < 1024; i++ )
      for( j = 0; j < 1024; j++ )
        data[i][j] = 1;

    long endTime = System.nanoTime();

    long duration = ( endTime - startTime );

    System.out.println(duration);
    
  }
}
