namespace java com.st.thrift
service SumService{
    string getSum(1:i32 num1, 2:i32 num2)
}