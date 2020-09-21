class Q32{

       int rollno;
        String name;

        static int count =0;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
                count++;
                System.out.println("no of stud object ="+count);
            }

}

class Q32Demo {
        public static void main(String args[]){
        
        Q32 s = new Q32();

        s.setData(101,"ankita");
        s.showData();
        s.setData(102,"nikita");
        s.showData();
        
        }

}
