public class b_array_as_function_arguments {
    public static void update(int marks[]) {
        for (int i=0;i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={2,4,8};
        update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
