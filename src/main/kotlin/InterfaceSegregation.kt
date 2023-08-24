/*
    When we extend an interface normally we have to implement all the methods of the interface.
    But some classes when they extend the interface need not implement all the methods of an interface and only require some methods.
    So instead of having a bulky interface with methods common to most of the classes, Segregate the interface
    into multiple interfaces to make the code cleaner to use.
    This is about ISP principle


 */

/*interface EmployeeofZee{
    fun WorkofHR()              // Instead of having a single interface that contains methods of all classes,segregate it//
    fun WorkofSDE()
    fun WorkofITSup()
}*/


// The Below Code follows ISP as every class need not implement all the interfaces but only the interface it needs//
interface HR{
    fun WorkofHR()

}

interface SDE{
    fun WorkofSDE()
}

interface ITSup{
    fun WorkofITSup()
}

class HumanResource:HR {
    override fun WorkofHR(){
        TODO("Not yet implemented")
    }
}

class SoftwareDeveloper : SDE{
    override fun WorkofSDE() {
        TODO("Not yet implemented")
    }

}

class ITsupport : ITSup{
    override fun WorkofITSup() {
        TODO("Not yet implemented")
    }

}