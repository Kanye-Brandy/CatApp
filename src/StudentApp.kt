fun main() {
    println("String")
    var ans = ""
    while(ans!= "exit"){
        println("Enter a student ID:")
        val id = readln()
        println("Enter the student's name")
        val name = readln()
        println("Enter the student's course")
        val course = readln()
        println("Enter the student's mark")
        val mark = readln().toDouble()
        val student = Student(id,name,course,mark)
        print(student)
        println("\nEnter exit if you are finished:")
        ans = readln()
    }
}

class Student(val id: String, val name: String, val course: String, val mark: Double){
    override fun toString() : String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}