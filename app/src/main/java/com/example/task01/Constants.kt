package com.example.task01

object Constants {
    fun getEmployeeData():ArrayList<People>{
        // create an arraylist of type employee class
        val employeeList=ArrayList<People>()
        val emp1=People("Chinmaya Mohapatra","Manali")
        employeeList.add(emp1)
        val emp2=People("Ram prakash","Lucknow")
        employeeList.add(emp2)
        val emp3=People("OMM Meheta","Ayodhya")
        employeeList.add(emp3)
        val emp4=People("Hari Mohapatra","Manali")
        employeeList.add(emp4)
        val emp5=People("Abhisek Mishra","Jaipur")
        employeeList.add(emp5)
        val emp6=People("Sindhu Malhotra","Rewa")
        employeeList.add(emp6)
        val emp7=People("Anil sidhu","Kashi")
        employeeList.add(emp7)
        val emp8=People("Sachin sinha","Delhi")
        employeeList.add(emp8)
        val emp9=People("Amit sahoo","Mumbai")
        employeeList.add(emp9)
        val emp10=People("Raj kumar","U.K.")
        employeeList.add(emp10)

        return  employeeList
}
}