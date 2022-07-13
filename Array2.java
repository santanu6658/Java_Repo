class  ExampleArray2 {
    int arr[] = {14, 2, 3, 4, 5};
void display(){
    for(int i:arr){
        System.out.print(i);
        System.out.print("  ");
    }}
    ExampleArray2(){
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
        System.out.print("\t");
    }


}
}
public class Array2 {
    public static void main(String args[]){
        ExampleArray2 dees=new ExampleArray2();
        dees.display();


    }
}
