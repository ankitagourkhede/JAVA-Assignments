class Q31{

       int rollno;
        String name;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
            }
}

class Q31Demo {
        public static void main(String args[]){
        
        Q31 s = new Q31();

        s.setData(101,"aman");
        s.showData();
        s.setData(102,"aarav");
        s.showData();
        
        }

}
